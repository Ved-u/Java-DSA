# 3024. Type of Triangle

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/type-of-triangle/
**Tags:** Array, Math, Sorting, Polygons

## Approach 1 — 2024-02-09 13:57 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.3 MB*

```java
class Solution {
    public String triangleType(int[] nums) {
      if(nums[0]+nums[1]>nums[2] && nums[2]+nums[0]>nums[1] && nums[2]+nums[1]>nums[0]){
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }else if(nums[1]==nums[0] || nums[1]==nums[2] || nums[2]==nums[0] ){
            return "isosceles";
        }else{
            return "scalene";
        }
      }else{
          return "none";
      }
    }
}
```
