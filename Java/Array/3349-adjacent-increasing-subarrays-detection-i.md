# 3349. Adjacent Increasing Subarrays Detection I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/
**Tags:** Array

## Approach 1 — 2024-11-10 08:07 (java)

*Runtime: 2 ms (faster than 69.5%) · Memory: 44.6 MB*

```java
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        
        // Check each possible starting index for the first subarray
        for (int i = 0; i <= n - 2 * k; i++) {
            // Check if the first subarray nums[i..i+k-1] is strictly increasing
            boolean isFirstIncreasing = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    isFirstIncreasing = false;
                    break;
                }
            }
            
            // Check if the second subarray nums[i+k..i+2k-1] is strictly increasing
            boolean isSecondIncreasing = true;
            for (int j = i + k; j < i + 2 * k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    isSecondIncreasing = false;
                    break;
                }
            }
            
            // If both subarrays are strictly increasing, return true
            if (isFirstIncreasing && isSecondIncreasing) {
                return true;
            }
        }
        
        // If no valid adjacent subarrays are found, return false
        return false;
    }
}
```

## Approach 2 — 2025-10-14 07:26 (java)

*Runtime: 2 ms (faster than 69.5%) · Memory: 44.9 MB*

```java
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        // Check each possible starting index for the first subarray
        for (int i = 0; i <= n - 2 * k; i++) {
            // Check if the first subarray nums[i..i+k-1] is strictly increasing
            boolean isFirstIncreasing = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    isFirstIncreasing = false;
                    break;
                }
            }
            // Check if the second subarray nums[i+k..i+2k-1] is strictly increasing
            boolean isSecondIncreasing = true;
            for (int j = i + k; j < i + 2 * k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    isSecondIncreasing = false;
                    break;
                }
            }
            // If both subarrays are strictly increasing, return true
            if (isFirstIncreasing && isSecondIncreasing) {
                return true;
            }
        }
        // If no valid adjacent subarrays are found, return false
        return false;
    }
}
```
