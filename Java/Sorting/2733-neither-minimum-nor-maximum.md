# 2733. Neither Minimum nor Maximum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/neither-minimum-nor-maximum/
**Tags:** Array, Sorting

## Approach 1 — 2024-08-06 15:29 (java)

*Runtime: 9 ms (faster than 43.7%) · Memory: 45.3 MB*

```java
class Solution {
    public int findNonMinOrMax(int[] nums) {
       if(nums.length<=2)return -1;
       Arrays.sort(nums);
       int min=nums[0]; 
       int max=nums[nums.length-1];
       for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=min)return nums[i];
            if(nums[i]!=max)return nums[i];
       }
    return -1;    
    }
}
```

## Approach 2 — 2024-08-06 15:37 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 45.2 MB*

```java
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==2||nums.length==1)return -1;
    if(nums[0]<nums[1]&&nums[1]<nums[2]||nums[0]>nums[1]&&nums[1]>nums[2])
        return nums[1];
else if(nums[1]<nums[0]&&nums[0]<nums[2]||nums[0]<nums[1]&&nums[0]>nums[2])
        return nums[0];
    return nums[2];
    }
}
```
