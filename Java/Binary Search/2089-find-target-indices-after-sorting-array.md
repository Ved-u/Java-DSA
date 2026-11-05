# 2089. Find Target Indices After Sorting Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-target-indices-after-sorting-array/
**Tags:** Array, Binary Search, Sorting

## Approach 1 — 2026-10-19 17:14 (java)

*Runtime: 6 ms · Memory: 44.9 MB*

```java
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)ans.add(i);
        }
        return ans;
    }
}
```
