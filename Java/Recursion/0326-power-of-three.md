# 326. Power of Three

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/power-of-three/
**Tags:** Math, Recursion

## Approach 1 — 2025-11-27 21:25 (java)

*Runtime: 107 ms (faster than 5.0%) · Memory: 46.2 MB*

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<=Math.ceil(Math.cbrt(n));i++){
            if(Math.pow(3,i)==n)return true;
        }
        return false;
    }
}
```
