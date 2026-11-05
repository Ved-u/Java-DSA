# 2126. Destroying Asteroids

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/destroying-asteroids/
**Tags:** Array, Greedy, Sorting

## Approach 1 — 2026-05-31 09:20 (java)

*Runtime: 27 ms (faster than 39.7%) · Memory: 107.5 MB*

```java
class Solution {
    public boolean asteroidsDestroyed(int m, int[] as) {
        Arrays.sort(as);
        long mass = m;
        long count=0;
        for(int x:as){
            if(mass>=x){
                count++;
                mass+=x;
            }else return false;
        }
        return true;
    }
}
```
