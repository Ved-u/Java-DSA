# 1822. Sign of the Product of an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sign-of-the-product-of-an-array/
**Tags:** Array, Math

## Approach 1 — 2024-02-03 19:50 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.5 MB*

```java
class Solution {
    public int arraySign(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               return 0;
           }if(nums[i]<0){
               count++;
           }
       }
       if(count%2==0){
           return 1;
       }else{
           return -1;
       }
      // return 1;
    }
}
```
