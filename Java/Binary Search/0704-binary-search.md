# 704. Binary Search

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/binary-search/
**Tags:** Array, Binary Search

## Approach 1 — 2026-08-26 19:21 (java)

*Runtime: 0 ms · Memory: 48.3 MB*

```java
class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
}
```
