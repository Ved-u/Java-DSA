# 4074. Maximum Product Pair With Target Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-product-pair-with-target-sum/
**Tags:** 

## Approach 1 — 2026-10-13 19:42 (java)

*Runtime: 2 ms · Memory: 46.7 MB*

```java
class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] ans = {-1,-1};
        int prod=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j&&nums[i]+nums[j]==target&&nums[i]>nums[j]){
                    int mul = nums[i]*nums[j];
                    if(mul>prod){
                        ans[0]=i;
                        ans[1]=j;
                        prod = mul;
                    }
                }
            }
        }
        return ans;
    }
}
```
