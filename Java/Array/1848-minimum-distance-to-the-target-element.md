# 1848. Minimum Distance to the Target Element

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-distance-to-the-target-element/
**Tags:** Array

## Approach 1 — 2024-08-20 20:38 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43 MB*

```java
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target&&Math.abs(i-start)<ans)ans=Math.abs(i-start);
        }
    return ans;
    }
}
```
