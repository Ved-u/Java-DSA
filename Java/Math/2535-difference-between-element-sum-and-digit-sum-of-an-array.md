# 2535. Difference Between Element Sum and Digit Sum of an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
**Tags:** Array, Math

## Approach 1 — 2024-01-26 14:08 (java)

*Runtime: 2 ms (faster than 99.7%) · Memory: 44.9 MB*

```java
class Solution {
    public int differenceOfSum(int[] nums) {
        int sumNum=0;
        int sumDigit=0;
        int digits;
        for(int i=0;i<nums.length;i++){
            sumNum=sumNum+nums[i];
            while(nums[i]>0){
                digits=nums[i]%10;
                sumDigit=sumDigit+digits;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(sumNum-sumDigit);
    }
}
```
