# 3936. Minimum Swaps to Move Zeros to End

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-swaps-to-move-zeros-to-end/
**Tags:** Array, Two Pointers

## Approach 1 — 2026-05-25 19:34 (java)

*Runtime: 1 ms (faster than 99.6%) · Memory: 46.2 MB*

```java
class Solution {
    public int minimumSwaps(int[] nums) {
        int min=0;
        int l=0,r=nums.length-1;
        while(l<r){
            if(nums[l]==0&&nums[r]!=0){
                nums[l]=nums[l]^nums[r];
                nums[r]=nums[l]^nums[r];
                nums[l]=nums[l]^nums[r];
                min++;
                l++;r--;
            }
            else if(nums[l]!=0)l++;
            else if(nums[r]==0)r--;
        }
        return min;
    }
}
```
