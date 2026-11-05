# 2540. Minimum Common Value

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-common-value/
**Tags:** Array, Hash Table, Two Pointers, Binary Search

## Approach 1 — 2024-03-10 19:17 (java)

*Runtime: 8 ms (faster than 20.7%) · Memory: 62.7 MB*

```java
class Solution {
    public boolean binSearch(int n,int nums[]){
        int left=nums[0];
        int right=nums[nums.length-1];
        int mid;
        if(left==n||right==n)return true;
        left=0;
        right=nums.length-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==n)return true;
            else if(n>nums[mid])left=mid+1;
            else right=mid-1;
        }
        return false;
    }

    public int getCommon(int[] nums1, int[] nums2) {
       for(int i=0;i<nums1.length;i++){
            if(binSearch(nums1[i],nums2)) return nums1[i];
       }
       return -1;
    }
    
}
```
