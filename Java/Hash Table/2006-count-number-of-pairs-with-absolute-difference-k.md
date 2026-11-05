# 2006. Count Number of Pairs With Absolute Difference K

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2024-07-16 04:21 (java)

*Runtime: 7 ms (faster than 58.4%) · Memory: 42.8 MB*

```java
class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(Math.abs(nums[i]-nums[j])==k)ans++;
            }
        }
    return ans;    
    }
}
```
