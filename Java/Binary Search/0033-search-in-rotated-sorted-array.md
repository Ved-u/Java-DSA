# 33. Search in Rotated Sorted Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/search-in-rotated-sorted-array/
**Tags:** Array, Binary Search

## Approach 1 — 2024-12-21 20:04 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.2 MB*

```java
class Solution {
    public int search(int[] nums, int target) {
       int left=0,right=nums.length-1,mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target)return mid;
            if(nums[left]<=nums[mid]){
                if(target>=nums[left]&&target<=nums[mid])right=mid-1; 
                else left=mid+1;
            }else{
                if(nums[mid]<=target&&nums[right]>=target)left=mid+1;
                else right=mid-1;
            }
        }
    return -1; 
    }
}
```
