# 3379. Transformed Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/transformed-array/
**Tags:** Array, Simulation

## Approach 1 — 2026-03-07 19:36 (java)

*Runtime: 1 ms (faster than 97.3%) · Memory: 46.9 MB*

```java
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int steps=Math.abs(nums[i]);
            int idx=i;
            if(nums[i]>0){
                while(steps>0){
                    idx++;
                    if(idx==nums.length)idx=0;
                    steps--;
                }
            }else if(nums[i]<0){
                while(steps>0){
                    idx--;
                    if(idx<0)idx=nums.length-1;
                    steps--;
                }
            }
            ans[i]=nums[idx];
        }
        return ans;
    }
}
```
