# 945. Minimum Increment to Make Array Unique

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-increment-to-make-array-unique/
**Tags:** Array, Greedy, Sorting, Counting

## Approach 1 — 2024-06-14 18:21 (java)

*Runtime: 37 ms (faster than 94.9%) · Memory: 60.2 MB*

```java
import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] + 1 - nums[i];
                nums[i] = nums[i - 1] + 1;
                ans += increment;
            }
        }
        return ans;
    }
}
```

## Approach 2 — 2024-06-14 18:28 (java)

*Runtime: 37 ms (faster than 94.9%) · Memory: 60.4 MB*

```java
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0,increment;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                increment = nums[i - 1] + 1 - nums[i];
                nums[i] = nums[i - 1] + 1;
                ans += increment;
            }
        }
    return ans;
    }
}
```
