# 1608. Special Array With X Elements Greater Than or Equal X

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
**Tags:** Array, Binary Search, Sorting

## Approach 1 — 2024-05-29 19:27 (java)

*Runtime: 2 ms (faster than 55.0%) · Memory: 40.9 MB*

```java
class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length; 
        for (int i = 0; i < n; i++) {
            int x = n - i; 
            if (nums[i] >= x) 
                if (i == 0 || nums[i - 1] < x) 
                    return x;
        }
    return -1;    
    }
}
```
