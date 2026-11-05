# 2562. Find the Array Concatenation Value

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-array-concatenation-value/
**Tags:** Array, Two Pointers, Simulation

## Approach 1 — 2024-08-11 22:31 (java)

*Runtime: 11 ms (faster than 7.1%) · Memory: 44.2 MB*

```java
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans=0;
        int left=0,right=nums.length-1;
        while(left<=right){
            if(left==right)ans+=nums[left];
            else ans+=Integer.parseInt(""+nums[left]+nums[right]);
            left++;
            right--;
        }
    return ans;    
    }
}
```
