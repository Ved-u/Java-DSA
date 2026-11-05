# 4097. Minimum Value of Merged Integers

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-value-of-merged-integers/
**Tags:** 

## Approach 1 — 2026-11-01 14:47 (java)

*Runtime: 6 ms · Memory: 45 MB*

```java
class Solution {
    public int minMergedInteger(int[] nums) {
      int min = Integer.MAX_VALUE;
      for(int i=0; i<nums.length;i+=2){
        String x = ""+nums[i]+nums[i+1];
        int concate = Integer.parseInt(x);
        if (min>concate) min= concate;
      }
      return min;
    }
}
```
