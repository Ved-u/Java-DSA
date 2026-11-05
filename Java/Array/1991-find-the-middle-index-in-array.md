# 1991. Find the Middle Index in Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-middle-index-in-array/
**Tags:** Array, Prefix Sum

## Approach 1 — 2024-09-16 10:52 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.4 MB*

```java
class Solution {
    public int findMiddleIndex(int[] nums) {
        int lsum[]=new int[nums.length];
        lsum[0]=nums[0];
        for(int i=1;i<lsum.length;i++){
            lsum[i]=lsum[i-1]+nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            nums[i]+=nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==lsum[i])return i;
        }
    return -1;
    }
}
```
