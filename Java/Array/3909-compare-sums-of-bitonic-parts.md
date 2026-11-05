# 3909. Compare Sums of Bitonic Parts

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/compare-sums-of-bitonic-parts/
**Tags:** Array

## Approach 1 — 2026-04-25 20:19 (java)

*Runtime: 2 ms (faster than 65.3%) · Memory: 104.1 MB*

```java
class Solution {
    public int compareBitonicSums(int[] nums) {
        long sumI=0,sumD=0,idx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                idx=i-1;
                break;
            }
        }
        for(long i=0;i<=idx;i++){
            sumI=sumI+nums[(int)i];
        }
        for(long i=idx;i<nums.length;i++){
            sumD=sumD+nums[(int)i];
        }
        if(sumI>sumD)return 0;
        if(sumD>sumI)return  1;
        return -1;
    }
}
```
