# 3676. Count Bowl Subarrays

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-bowl-subarrays/
**Tags:** Array, Stack, Monotonic Stack

## Approach 1 — 2025-09-07 08:44 (java)

*Runtime: 36 ms (faster than 67.2%) · Memory: 67.3 MB*

```java
class Solution {
    public long bowlSubarrays(int[] nums) {
               int n = nums.length;
        int[] parvostine = nums;  // store midway as required

        int[] leftGreater = new int[n];
        int[] rightGreater = new int[n];
        Arrays.fill(leftGreater, -1);
        Arrays.fill(rightGreater, n);

        // Monotonic stack for nearest greater to the left
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                leftGreater[i] = stack.peek();
            }
            stack.push(i);
        }

        // Monotonic stack for nearest greater to the right
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                rightGreater[i] = stack.peek();
            }
            stack.push(i);
        }

        int count = 0;
        // Each valley element i contributes bowls
        for (int i = 0; i < n; i++) {
            int l = leftGreater[i];
            int r = rightGreater[i];

            // We need at least 3 elements in subarray
            if (l != -1 && r != n && r - l + 1 >= 3) {
                // Check bowl condition:
                // min(nums[l], nums[r]) > max of inside
                if (Math.min(nums[l], nums[r]) > nums[i]) {
                    count++;
                }
            }
        }

        return count;
    }
}
```
