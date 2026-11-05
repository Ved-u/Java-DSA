# 1929. Concatenation of Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/concatenation-of-array/
**Tags:** Array, Simulation

## Approach 1 — 2024-02-01 22:00 (java)

*Runtime: 1 ms (faster than 97.6%) · Memory: 45.3 MB*

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
       int  n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
```
