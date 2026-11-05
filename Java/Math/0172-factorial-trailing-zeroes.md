# 172. Factorial Trailing Zeroes

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/factorial-trailing-zeroes/
**Tags:** Math

## Approach 1 — 2024-08-07 13:48 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.3 MB*

```java
class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        // Count the number of 5s in the factors of the numbers from 1 to n
        for (int i = 5; i <= n; i *= 5) {
            ans += n / i;
        }
        return ans;
    }
}
```
