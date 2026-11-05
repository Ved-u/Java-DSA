# 1470. Shuffle the Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/shuffle-the-array/
**Tags:** Array

## Approach 1 — 2024-02-03 20:02 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.8 MB*

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int counto=1;
        int counte=0;
        for(int i=0;i<n;i++){
        ans[counte]=nums[i];
        counte=counte+2;
        }
        
        for(int i=n;i<nums.length;i++){
        ans[counto]=nums[i];
        counto=counto+2;
        }
        return ans;
    }
}
```
