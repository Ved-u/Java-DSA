# 1512. Number of Good Pairs

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-good-pairs/
**Tags:** Array, Hash Table, Math, Counting

## Approach 1 — 2024-02-29 23:35 (java)

*Runtime: 1 ms (faster than 84.6%) · Memory: 40.7 MB*

```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j)ans++;
            }
        }
        return ans;
    }
}
```
