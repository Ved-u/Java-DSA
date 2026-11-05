# 238. Product of Array Except Self

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/product-of-array-except-self/
**Tags:** Array, Prefix Sum

## Approach 1 — 2024-03-11 11:42 (java)

*Runtime: 2 ms (faster than 92.5%) · Memory: 53.2 MB*

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
                continue;
            }else prod*=nums[i];    
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zeros>1)ans[i]=0;
            else if(zeros==1){
                if(nums[i]==0)ans[i]=prod;
                else ans[i]=0;
            }
            else ans[i]=prod/nums[i];
        }
        return ans;
    }
}
```

## Approach 2 — 2025-09-07 09:21 (java)

*Runtime: 2 ms (faster than 92.5%) · Memory: 55.3 MB*

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = 1;
        }
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
    return ans;
    }
}
```
