# 2778. Sum of Squares of Special Elements 

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-squares-of-special-elements/
**Tags:** Array, Enumeration

## Approach 1 — 2026-10-11 08:03 (java)

*Runtime: 1 ms · Memory: 46.2 MB*

```java
class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        for(int i=1;i<=nums.length;i++){
            if(nums.length%i==0)ans+=nums[i-1]*nums[i-1];
        }
        return ans;
    }
}
```
