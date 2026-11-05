# 4070. Minimum Rotations to Dial a Number I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-rotations-to-dial-a-number-i/
**Tags:** 

## Approach 1 — 2026-10-05 22:13 (java)

*Runtime: 1 ms · Memory: 44 MB*

```java
class Solution {
    public int minRotations(String s) {
        int ans=0;
        char curr = '0';
        for(int i=0;i<s.length();i++){
            int d = Math.abs(s.charAt(i)-curr);
            ans+=Math.min(d, 10-d);
            curr = s.charAt(i);
        }
        return ans;
    }
}
```
