# 1984. Minimum Difference Between Highest and Lowest of K Scores

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
**Tags:** Array, Sliding Window, Sorting

## Approach 1 — 2026-03-28 15:58 (java)

*Runtime: 9 ms (faster than 26.1%) · Memory: 46.5 MB*

```java
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==1)return 0;
        int min=Integer.MAX_VALUE;
        int l=0,r=k-1;
        while(r<nums.length){
            min=Math.min(min,nums[r]-nums[l]);
            l++;
            r++;
        }
        return min;
    }
}
```
