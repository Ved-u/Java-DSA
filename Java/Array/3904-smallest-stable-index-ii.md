# 3904. Smallest Stable Index II

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/smallest-stable-index-ii/
**Tags:** Array, Prefix Sum

## Approach 1 — 2026-09-05 22:00 (java)

*Runtime: 3 ms · Memory: 133.3 MB*

```java
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int suff[]=new int[nums.length];
        int max=Integer.MIN_VALUE;
        suff[suff.length-1]=nums[nums.length-1];
        for(int i=suff.length-2;i>=0;i--){
            suff[i]=Math.min(nums[i],suff[i+1]);
        }
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            int min=suff[i];
            if(max-min<=k)return i;
        }
        return -1;
    }
}
```
