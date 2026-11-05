# 3688. Bitwise OR of Even Numbers in an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/
**Tags:** Array, Bit Manipulation, Simulation

## Approach 1 — 2025-11-20 20:38 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.5 MB*

```java
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        for(int x:nums){
            if(x%2==0)ans|=x;
        }
        return ans;
    }
}
```
