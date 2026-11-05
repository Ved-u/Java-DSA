# 69. Sqrt(x)

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sqrtx/
**Tags:** Math, Binary Search, Newton's Method

## Approach 1 — 2024-08-30 20:10 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.9 MB*

```java
class Solution {
    public int mySqrt(int x) {
       return (int)Math.sqrt(x);
    }
}
```

## Approach 2 — 2024-09-05 20:52 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 40.7 MB*

```java
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int start = 1;
        int end = x;
        int mid;
        while (start <= end){
            mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)return mid;
            else start = mid + 1;
        }
    return Math.round(end);
    }
}
```
