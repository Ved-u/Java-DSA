# 2574. Left and Right Sum Differences

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/left-and-right-sum-differences/
**Tags:** Array, Prefix Sum

## Approach 1 — 2024-02-13 23:23 (java)

*Runtime: 2 ms (faster than 98.7%) · Memory: 44.5 MB*

```java
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[]=new int[nums.length];
        int lftsum[]=new int[nums.length];
        lftsum[0]=0;
        int rtsum[]=new int[nums.length];
        rtsum[nums.length-1]=0;
        int lsum=0;
        int rsum=0;
        for(int i=1;i<nums.length;i++){
            lsum=lsum+nums[i-1];
            lftsum[i]=lsum;
        }

        for(int i=nums.length-2;i>=0;i--){
            rsum=rsum+nums[i+1];
            rtsum[i]=rsum;
        }

        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(lftsum[i]-rtsum[i]);
        }

         return ans;   
    }
}
```
