# 3550. Smallest Index With Digit Sum Equal to Index

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/
**Tags:** Array, Math

## Approach 1 — 2026-09-24 11:39 (java)

*Runtime: 1 ms · Memory: 45.7 MB*

```java
class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i)return i;
        }
        return -1;
    }
    public int sum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
```
