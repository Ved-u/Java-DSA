# 3847. Find the Score Difference in a Game

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-score-difference-in-a-game/
**Tags:** Array, Simulation

## Approach 1 — 2026-04-04 17:59 (java)

*Runtime: 2 ms (faster than 72.0%) · Memory: 46.9 MB*

```java
class Solution {
    public int scoreDifference(int[] nums) {
        int p1=0,p2=0;
        boolean pa=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1)pa=!pa;
            if((i+1)%6==0)pa=!pa;
            if(pa)p1+=nums[i];
            else p2+=nums[i];
        
        }
    return p1-p2;
    }
}
```
