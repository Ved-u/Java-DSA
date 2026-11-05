# 3423. Maximum Difference Between Adjacent Elements in a Circular Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/
**Tags:** Array

## Approach 1 — 2025-01-19 09:00 (java)

*Runtime: 1 ms (faster than 99.7%) · Memory: 43.8 MB*

```java
class Solution {
    public int maxAdjacentDistance(int[] nums) {
       int ans=Math.abs(nums[0]-nums[nums.length-1]);
       for(int i=1;i<nums.length;i++){
          ans=Math.max(ans,Math.abs(nums[i]-nums[i-1]));
       }
    return ans; 
    }
}
```

## Approach 2 — 2025-06-12 20:18 (java)

*Runtime: 1 ms (faster than 99.7%) · Memory: 43.2 MB*

```java
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])>ans)ans=Math.abs(nums[i]-nums[i+1]);
        }
        return ans;
    }
}
```
