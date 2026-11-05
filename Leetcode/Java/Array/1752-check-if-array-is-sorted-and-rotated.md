# 1752. Check if Array Is Sorted and Rotated

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
**Tags:** Array

## Approach 1 — 2024-02-01 23:34 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.2 MB*

```java
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        // Check if the array is sorted
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                break;
            }
        }

        // If the array is already sorted, return true
        if (sorted) {
            return true;
        }

        // Find the rotation point
        int rotationPoint = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                rotationPoint = i + 1;
                break;
            }
        }

        // Check if the remaining elements are in non-decreasing order
        for (int i = 0; i < n - 1; i++) {
            int current = nums[(i + rotationPoint) % n];
            int next = nums[(i + rotationPoint + 1) % n];

            if (current > next) {
                return false;
            }
        }

        return true;
    }
}
```

## Approach 2 — 2024-08-23 15:08 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public boolean check(int[] arr) {
        int dip=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length])dip++;
        }
    return dip<=1;
    }
}
```
