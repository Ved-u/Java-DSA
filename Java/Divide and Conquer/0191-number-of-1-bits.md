# 191. Number of 1 Bits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-1-bits/
**Tags:** Divide and Conquer, Bit Manipulation

## Approach 1 — 2026-03-25 20:16 (java)

*Runtime: 1 ms (faster than 50.9%) · Memory: 42.5 MB*

```java
class Solution {
    public int hammingWeight(int n) {
        int ans=0;
        String x=Integer.toBinaryString(n);
        for(char y:x.toCharArray()){
            if(y=='1')ans++;
        }
        return ans;
    }
}
```
