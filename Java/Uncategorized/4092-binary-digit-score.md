# 4092. Binary Digit Score

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/binary-digit-score/
**Tags:** 

## Approach 1 — 2026-10-28 19:06 (java)

*Runtime: 2 ms · Memory: 42.3 MB*

```java
class Solution {
    public int calculateScore(int a, int b) {
        int s1 = setBits(a);
        int s2 = setBits(b);
        if(s1>=s2)return s1*s2;
        return s2/s1;
    }
    int setBits(int n){
        int ans=0;
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')ans++;
        }
        return ans;
    }
}
```
