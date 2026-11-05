# 1486. XOR Operation in an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/xor-operation-in-an-array/
**Tags:** Math, Bit Manipulation

## Approach 1 — 2024-09-28 13:19 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.1 MB*

```java
class Solution {
    public int xorOperation(int n, int start) {
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=start+2*i;
        }
        int ans=0;
        for(int x:nums){
            ans^=x;
        }
    return ans;
    }
}
```
