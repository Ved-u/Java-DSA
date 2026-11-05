# 3516. Find Closest Person

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-closest-person/
**Tags:** Math

## Approach 1 — 2025-09-14 19:08 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.7 MB*

```java
class Solution {
    public int findClosest(int x, int y, int z) {
        int x1 = Math.abs(z-x);
        int y1 = Math.abs(z-y);
        if ( x1 > y1) return 2;
        else if ( x1 < y1) return 1;
        else return 0;
    }
}
```

## Approach 2 — 2025-09-14 19:45 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.7 MB*

```java
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z)<Math.abs(y-z))return 1;
        else if(Math.abs(x-z)>Math.abs(y-z))return 2;
        else return 0;
    }
}
```
