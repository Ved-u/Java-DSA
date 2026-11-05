# 268. Missing Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/missing-number/
**Tags:** Array, Hash Table, Math, Binary Search, Bit Manipulation, Sorting

## Approach 1 — 2024-02-20 22:59 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.6 MB*

```java
class Solution {
    public int missingNumber(int[] nums) {
       int arr[]= new int[nums.length+1];
       for(int i:nums){
           arr[i]++;
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]==0)return i;
       }
       return 0;
    }
}
```
