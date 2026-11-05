# 4083. Minimum Deletions to Make Array Sharp

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-deletions-to-make-array-sharp/
**Tags:** 

## Approach 1 — 2026-10-18 11:38 (java)

*Runtime: 2 ms · Memory: 45.8 MB*

```java
class Solution {
    public int minDeletions(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])ans++;
        }
        return ans;
    }
}
```
