# 55. Jump Game

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/jump-game/
**Tags:** Array, Dynamic Programming, Greedy

## Approach 1 — 2024-09-04 21:15 (java)

*Runtime: 2 ms (faster than 92.7%) · Memory: 45.3 MB*

```java
class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
       for(int i=0;i<nums.length;i++){
           if(i>max)return false;
           max=Math.max(max,i+nums[i]);
           if(max>=nums.length-1)return true;
        }
    return false;
    }
}
```
