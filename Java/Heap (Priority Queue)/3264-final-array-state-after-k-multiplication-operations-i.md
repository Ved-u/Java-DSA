# 3264. Final Array State After K Multiplication Operations I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/
**Tags:** Array, Math, Heap (Priority Queue), Simulation

## Approach 1 — 2024-08-26 22:18 (java)

*Runtime: 1 ms (faster than 99.0%) · Memory: 45 MB*

```java
class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        for(int i=1;i<=k;i++){
            int indx=min(nums);
            nums[indx]*=mul;
        }
    return nums;
    }
    public int min(int nums[]){
        int min=Integer.MAX_VALUE,indx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                indx=i;
            }
        }
    return indx;
    }
}
```
