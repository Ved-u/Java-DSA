# 476. Number Complement

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-complement/
**Tags:** Bit Manipulation

## Approach 1 — 2024-08-22 10:27 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.1 MB*

```java
class Solution {
    public int findComplement(int n) {
        if(n == 0)return 1;
        int ans = 0;
        int compare = 0;
        while(n > 0) {
            if((n & 1) == 0)ans += (int)Math.pow(2,compare);
            n = n >> 1;
            compare++;
        }
    return ans;
    }
}
```
