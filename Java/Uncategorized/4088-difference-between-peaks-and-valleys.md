# 4088. Difference Between Peaks and Valleys

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/difference-between-peaks-and-valleys/
**Tags:** 

## Approach 1 — 2026-10-25 18:48 (java)

*Runtime: 2 ms · Memory: 45.8 MB*

```java
class Solution {
    public int peakValleyDifference(int[] nums) {
        int peak=0,val=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1])peak+=nums[i];
            else if(nums[i]<nums[i-1]&&nums[i]<nums[i+1])val+=nums[i];
        }
        return peak-val;
    }
}
```
