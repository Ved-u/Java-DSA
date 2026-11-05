# 3737. Count Subarrays With Majority Element I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-subarrays-with-majority-element-i/
**Tags:** Array, Hash Table, Divide and Conquer, Segment Tree, Merge Sort, Counting, Prefix Sum

## Approach 1 — 2025-11-08 20:39 (java)

*Runtime: 51 ms (faster than 15.8%) · Memory: 46.9 MB*

```java
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=0,length=0;
            for(int j=i;j<nums.length;j++){
                    if(nums[j]==target)count++;
                    length++;
                if(count>length/2)ans++;
            }
        }
        return ans;
    }
}
```
