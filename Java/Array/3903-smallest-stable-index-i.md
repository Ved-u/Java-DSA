# 3903. Smallest Stable Index I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/smallest-stable-index-i/
**Tags:** Array, Prefix Sum

## Approach 1 — 2026-09-04 18:25 (java)

*Runtime: 1 ms · Memory: 46.4 MB*

```java
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int min=nums[i];
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
            if(max-min<=k)return i;
        }
        return -1;
    }
}
```
