# 1827. Minimum Operations to Make the Array Increasing

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
**Tags:** Array, Greedy

## Approach 1 — 2024-10-04 14:15 (java)

*Runtime: 230 ms (faster than 6.0%) · Memory: 44.8 MB*

```java
class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            while(nums[i]<=nums[i-1]){
                ans++;
                nums[i]++;
            }
        }
    return ans;
    }
}
```

## Approach 2 — 2024-10-04 14:18 (java)

*Runtime: 5 ms (faster than 27.9%) · Memory: 45.4 MB*

```java
class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                ans+=nums[i-1]-nums[i]+1;
                nums[i]+=nums[i-1]-nums[i]+1;
            }
        }
    return ans;
    }
}
```
