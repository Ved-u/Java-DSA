# 896. Monotonic Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/monotonic-array/
**Tags:** Array

## Approach 1 — 2024-02-19 18:18 (java)

*Runtime: 3 ms (faster than 28.4%) · Memory: 59.2 MB*

```java
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]) decreasing=false;
           else if(nums[i] > nums[i-1]) increasing=false;
        }
     return increasing || decreasing ;
    }
}
```
