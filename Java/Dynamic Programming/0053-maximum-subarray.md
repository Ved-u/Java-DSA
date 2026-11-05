# 53. Maximum Subarray

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-subarray/
**Tags:** Array, Divide and Conquer, Dynamic Programming

## Approach 1 — 2024-10-21 12:21 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 57 MB*

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int x:nums){
            sum+=x;
            if(sum>max)max=sum;
            if(sum<0)sum=0;
        }
    return max;
    }
}
```

## Approach 2 — 2026-04-30 16:34 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 76.9 MB*

```java
class Solution {
    public int maxSubArray(int[] nums) {
       int max=Integer.MIN_VALUE;
       int l=0,r=0;
       int sum=0;
       while(l<=r&&r<nums.length){
            sum+=nums[r];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
                l++;
            }
            r++;
       }
       return max; 
    }
}
```
