# 3010. Divide an Array Into Subarrays With Minimum Cost I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/
**Tags:** Array, Sorting, Enumeration

## Approach 1 — 2024-03-21 17:49 (java)

*Runtime: 2 ms (faster than 29.1%) · Memory: 44 MB*

```java
class Solution {
    public int minimumCost(int[] nums) {
        int sum=0;
        Arrays.sort(nums,1,nums.length);
        sum=nums[0]+nums[1]+nums[2];
        return sum;
    }
}
```

## Approach 2 — 2024-03-21 17:51 (java)

*Runtime: 2 ms (faster than 29.1%) · Memory: 44.3 MB*

```java
class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length==3)return (nums[0]+nums[1]+nums[2]);
        int sum=0;
        Arrays.sort(nums,1,nums.length);
        sum=nums[0]+nums[1]+nums[2];
        return sum;
    }
}
```
