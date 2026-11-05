# 3740. Minimum Distance Between Three Equal Elements I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/
**Tags:** Array, Hash Table

## Approach 1 — 2025-11-09 08:06 (java)

*Runtime: 8 ms (faster than 16.4%) · Memory: 44.6 MB*

```java
class Solution {
    public int minimumDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j]&&nums[j]==nums[k])
                        min=Math.min(min,Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i));
                }
            }
        }
        if(min==Integer.MAX_VALUE)return -1;
        return min;
    }
}
```
