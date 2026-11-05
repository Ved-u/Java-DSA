# 2465. Number of Distinct Averages

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-distinct-averages/
**Tags:** Array, Hash Table, Two Pointers, Sorting

## Approach 1 — 2026-07-17 10:21 (java)

*Runtime: 4 ms (faster than 31.4%) · Memory: 43.2 MB*

```java
class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set = new HashSet<>();
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        while(l<r){
            set.add((nums[l]+nums[r])/2.0);
            l++;r--;
        }
        return set.size();
    }
}
```
