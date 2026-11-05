# 3818. Minimum Prefix Removal to Make Array Strictly Increasing

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-prefix-removal-to-make-array-strictly-increasing/
**Tags:** Array

## Approach 1 — 2026-02-02 21:19 (java)

*Runtime: 1 ms (faster than 95.4%) · Memory: 120 MB*

```java
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int idx=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                idx=i;
                break;
            }
        }
        return idx-0;
    }
}
```
