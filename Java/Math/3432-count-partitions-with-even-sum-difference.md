# 3432. Count Partitions with Even Sum Difference

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-partitions-with-even-sum-difference/
**Tags:** Array, Math, Prefix Sum

## Approach 1 — 2025-12-05 21:17 (java)

*Runtime: 1 ms (faster than 61.4%) · Memory: 43.8 MB*

```java
class Solution {
    public int countPartitions(int[] nums) {
        int tot_sum=0;
        int lsum=nums[0];
        int ans=0;
        for(int x:nums){
            tot_sum+=x;
        }
        tot_sum-=nums[0];
        for(int i=1;i<nums.length;i++){
            lsum+=nums[i];
            tot_sum-=nums[i];
            if(Math.abs(tot_sum-lsum)%2==0)ans++;
        }
        return ans;
    }
}
```
