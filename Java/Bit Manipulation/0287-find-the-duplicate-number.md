# 287. Find the Duplicate Number

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-duplicate-number/
**Tags:** Array, Two Pointers, Binary Search, Bit Manipulation, Pigeonhole Principle, Floyd's Cycle Finding Algorithm

## Approach 1 — 2024-03-24 17:43 (java)

*Runtime: 35 ms (faster than 14.6%) · Memory: 58.2 MB*

```java
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1])return nums[i];
        }
        return -1;
    }
}
```

## Approach 2 — 2024-03-24 20:14 (java)

*Runtime: 4 ms (faster than 92.6%) · Memory: 58.4 MB*

```java
class Solution {
    public int findDuplicate(int[] nums) {
        int[]count=new int[100001];
        for(int x:nums){
            count[x]++;
        }
        for(int i=1;i<=count.length;i++){
            if(count[i]>1)return i;
        }
        return -1;
    }
}
```

## Approach 3 — 2024-03-24 17:41 (java)

*Runtime: 36 ms (faster than 14.2%) · Memory: 58.6 MB*

```java
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1&&nums[i]==nums[i+1])return nums[i];
            if(i==nums.length-1){
                if(nums[i]==nums[i-1])return nums[i];
            }
        }
        return 0;
    }
}
```
