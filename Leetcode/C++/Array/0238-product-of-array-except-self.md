# 238. Product of Array Except Self

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/product-of-array-except-self/
**Tags:** Array, Prefix Sum

## Approach 1 — 2025-01-30 08:47 (cpp)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.1 MB*

```cpp
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n, 1);
        int prefix = 1;
        for (int i = 0; i < n; ++i) {
            ans[i] *= prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; --i) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
    return ans;
    }
};
```
