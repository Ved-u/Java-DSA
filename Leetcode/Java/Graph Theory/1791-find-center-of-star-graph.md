# 1791. Find Center of Star Graph

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-center-of-star-graph/
**Tags:** Graph Theory

## Approach 1 — 2024-12-20 20:57 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 66.7 MB*

```java
class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1])return edges[0][0];
    else return edges[0][1];
    }
}
```
