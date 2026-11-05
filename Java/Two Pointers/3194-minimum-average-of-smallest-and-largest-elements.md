# 3194. Minimum Average of Smallest and Largest Elements

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/
**Tags:** Array, Two Pointers, Sorting

## Approach 1 — 2024-06-23 09:15 (java)

*Runtime: 2 ms (faster than 98.3%) · Memory: 43.7 MB*

```java
class Solution {
    public double minimumAverage(int[] nums) {
        double averages=Double.MAX_VALUE    ;
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        for(int i=1;i<=nums.length/2;i++){
            double curr=((nums[left++]+nums[right--])/2.0);
            averages=Math.min(averages,curr);
        }
      return averages;  
    }
}
```
