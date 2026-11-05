# 342. Power of Four

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/power-of-four/
**Tags:** Math, Bit Manipulation, Recursion

## Approach 1 — 2026-05-12 09:49 (java)

*Runtime: 1 ms (faster than 92.6%) · Memory: 42.6 MB*

```java
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1||n==4)return true;
        while(n>0){
            if(n%4!=0)return false;
            n/=4;
            if(n==4)return true;
        }
        return false;
    }
}
```
