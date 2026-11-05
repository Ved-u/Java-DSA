# 1260. Shift 2D Grid

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/shift-2d-grid/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2026-07-20 15:42 (java)

*Runtime: 7 ms (faster than 59.4%) · Memory: 47.4 MB*

```java
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k = k%(grid.length*grid[0].length);
        Deque<Integer> dq = new ArrayDeque();
        for(int x[]:grid){
            for(int y:x){
                dq.offerLast(y);
            }
        }
        while(k>0){
            dq.offerFirst(dq.pollLast());
            k--;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                temp.add(dq.pollFirst());
            }
            ans.add(temp);
        }
        return ans;
    }
}
```
