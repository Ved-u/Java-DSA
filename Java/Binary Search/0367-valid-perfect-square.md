# 367. Valid Perfect Square

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/valid-perfect-square/
**Tags:** Math, Binary Search

## Approach 1 — 2026-05-04 13:17 (java)

*Runtime: 1 ms (faster than 19.9%) · Memory: 41.7 MB*

```java
class Solution {
    public boolean isPerfectSquare(int num) {
        int sqrt=(int)Math.sqrt(num);
        for(int i=1;i<=sqrt;i++){
            if(i*i==num)return true;
        }
        return false;
    }
}
```
