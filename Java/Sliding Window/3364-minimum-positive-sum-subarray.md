# 3364. Minimum Positive Sum Subarray 

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-positive-sum-subarray/
**Tags:** Array, Sliding Window, Prefix Sum

## Approach 1 — 2024-11-24 08:14 (java)

*Runtime: 25 ms (faster than 9.3%) · Memory: 44.2 MB*

```java
import java.util.List;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        int n = nums.size();
        
        // Iterate over all possible starting points
        for (int i = 0; i < n; i++) {
            // Iterate over all possible subarray lengths between l and r
            for (int len = l; len <= r; len++) {
                if (i + len > n) break; // Ensure subarray is within bounds
                
                int sum = 0;
                // Calculate the sum of the subarray of length `len` starting from `i`
                for (int k = i; k < i + len; k++) {
                    sum += nums.get(k);
                }
                
                // Check if the sum is greater than 0 and update the answer
                if (sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }
        
        // If no valid subarray is found, return -1
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
```

## Approach 2 — 2024-11-24 08:17 (java)

*Runtime: 25 ms (faster than 9.3%) · Memory: 44.2 MB*

```java
class Solution {
    public int minimumSumSubarray(List<Integer> nums,int l,int r){
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            for (int len = l; len <= r; len++) {
                if (i + len > nums.size()) break; 
                int sum = 0;
                for (int k = i; k < i + len; k++) {
                    sum += nums.get(k);
                }
                if (sum > 0)ans = Math.min(ans, sum);
            }
        }
    return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
```
