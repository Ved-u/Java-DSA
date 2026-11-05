# 2395. Find Subarrays With Equal Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-subarrays-with-equal-sum/
**Tags:** Array, Hash Table

## Approach 1 — 2026-07-23 16:12 (java)

*Runtime: 1 ms (faster than 98.4%) · Memory: 43.6 MB*

```java
class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0, r = 1;
        while(r<nums.length){
            int sum = nums[l]+nums[r];
            if(set.contains(sum))return true;
            set.add(sum);
            l++;r++;
        }
        return false;
    }
}
```
