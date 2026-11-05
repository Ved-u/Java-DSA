# 3774. Absolute Difference Between Maximum and Minimum K Elements

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/absolute-difference-between-maximum-and-minimum-k-elements/
**Tags:** Array, Sorting

## Approach 1 — 2025-12-14 08:04 (java)

*Runtime: 5 ms (faster than 95.4%) · Memory: 46.7 MB*

```java
class Solution {
    public int absDifference(int[] nums, int k) {
        int sumS=0,sumL=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            sumS+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            if(k==0)break;
            sumL+=nums[i];
            k--;
        }
        return Math.abs(sumS-sumL);
    }
}
```
