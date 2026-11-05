# 3701. Compute Alternating Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/compute-alternating-sum/
**Tags:** Array, Simulation

## Approach 1 — 2025-11-18 22:28 (java)

*Runtime: 1 ms (faster than 95.5%) · Memory: 46.3 MB*

```java
class Solution {
    public int alternatingSum(int[] nums) {
        int even =0 ;
        int odd =0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)even+=nums[i];
            else odd+=nums[i];
        }
     return even-odd;
    }
}
```
