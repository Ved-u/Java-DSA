# 3954. Sum of Compatible Numbers in Range I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-compatible-numbers-in-range-i/
**Tags:** Dynamic Programming, Bit Manipulation, Enumeration

## Approach 1 — 2026-06-11 20:14 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42.4 MB*

```java
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int ans = 0;
        int start = Math.max(1, n - k);
        int end = n + k;
        for (int x = start; x <= end; x++) 
            if ((n & x) == 0) 
                ans += x;
        return ans;
    }
}
```
