# 289. Game of Life

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/game-of-life/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2026-04-07 10:28 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.3 MB*

```java
class Solution {
    public void gameOfLife(int[][] nums) {
        int copy[][]=new int[nums.length][];
        int idx=0;
        for(int x[]:nums){
            copy[idx++]=x.clone();
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                int live=0;
                if(i+1<nums.length&&copy[i+1][j]==1)live++;
                if(j+1<nums[0].length&&copy[i][j+1]==1)live++;
                if((i+1<nums.length&&j+1<nums[0].length)&&copy[i+1][j+1]==1)live++;
                if(i>0&&copy[i-1][j]==1)live++;
                if(j>0&&copy[i][j-1]==1)live++;
                if((i>0&&j>0)&&copy[i-1][j-1]==1)live++;
                if((j+1<nums[0].length&&i>0)&&copy[i-1][j+1]==1)live++;
                if((i+1<nums.length&&j>0)&&copy[i+1][j-1]==1)live++;
                //compute
                if(live<2||live>3)nums[i][j]=0;
                else if(copy[i][j]==0&&live==3) nums[i][j]=1;
                else if(copy[i][j]==1&&(live==2||live==3))nums[i][j]=1;
            }
        }
    }
}
```

## Approach 2 — 2026-04-07 10:30 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43 MB*

```java
class Solution {
    public void gameOfLife(int[][] nums) {
        int copy[][]=new int[nums.length][];
        int idx=0;
        for(int x[]:nums){
            copy[idx++]=x.clone();
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                int live=0;
                if(i+1<nums.length&&copy[i+1][j]==1)live++;
                if(j+1<nums[0].length&&copy[i][j+1]==1)live++;
                if((i+1<nums.length&&j+1<nums[0].length)&&copy[i+1][j+1]==1)live++;
                if(i>0&&copy[i-1][j]==1)live++;
                if(j>0&&copy[i][j-1]==1)live++;
                if((i>0&&j>0)&&copy[i-1][j-1]==1)live++;
                if((j+1<nums[0].length&&i>0)&&copy[i-1][j+1]==1)live++;
                if((i+1<nums.length&&j>0)&&copy[i+1][j-1]==1)live++;
                //compute
                if (copy[i][j] == 1) {
                    if (live < 2 || live > 3) nums[i][j] = 0;
                } else {
                    if (live == 3) nums[i][j] = 1;
                }
            }
        }
    }
}
```
