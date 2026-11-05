# 2824. Count Pairs Whose Sum is Less than Target

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
**Tags:** Array, Two Pointers, Binary Search, Sorting

## Approach 1 — 2024-06-08 10:35 (java)

*Runtime: 2 ms (faster than 98.2%) · Memory: 42 MB*

```java
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++)
                if(nums.get(i)+nums.get(j)<target)ans++;
        }
    return ans;    
    }
}
```
