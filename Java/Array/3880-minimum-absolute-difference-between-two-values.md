# 3880. Minimum Absolute Difference Between Two Values

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-absolute-difference-between-two-values/
**Tags:** Array, Enumeration

## Approach 1 — 2026-03-28 21:41 (java)

*Runtime: 2 ms (faster than 51.2%) · Memory: 46.3 MB*

```java
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1&&nums[j]==2)
                    min=Math.min(min,Math.abs(i-j));
            }
        }
        if(min!=Integer.MAX_VALUE)return min;
        return -1;
    }
}
```
