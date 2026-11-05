# 11. Container With Most Water

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/container-with-most-water/
**Tags:** Array, Two Pointers, Greedy

## Approach 1 — 2024-06-01 20:46 (java)

*Runtime: 5 ms (faster than 82.9%) · Memory: 57.3 MB*

```java
class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            ans=Math.max(ans,Math.min(height[left],height[right])*(right-left));
            if (height[left] < height[right])left++;
            else right--;
        }
    return ans;
    }
}
```

## Approach 2 — 2024-12-11 06:42 (java)

*Runtime: 5 ms (faster than 82.9%) · Memory: 57.7 MB*

```java
class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            ans=Math.max(ans,Math.min(height[left],height[right])*(right - left));
            if (height[left] < height[right])left++;
            else right--;
        }
    return ans;
    }
}
```
