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

## Approach 2 — 2024-02-20 22:51 (java)

*Runtime: 6 ms (faster than 18.9%) · Memory: 45.4 MB*

```java
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing=0;
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i])missing=i+1;
        }
        return missing;
    }
}
```
