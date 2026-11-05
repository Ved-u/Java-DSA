# 3925. Concatenate Array With Reverse

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/concatenate-array-with-reverse/
**Tags:** Array, Simulation

## Approach 1 — 2026-05-10 11:19 (java)

*Runtime: 1 ms (faster than 97.7%) · Memory: 47.2 MB*

```java
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int idx=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            ans[idx++]=nums[i];
        }
        return ans;
    }
}
```
