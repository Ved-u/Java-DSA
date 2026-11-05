# 912. Sort an Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/sort-an-array/
**Tags:** Array, Divide and Conquer, Sorting, Heap (Priority Queue), Merge Sort, Bucket Sort, Radix Sort, Counting Sort

## Approach 1 — 2024-07-25 16:43 (java)

*Runtime: 17 ms (faster than 96.4%) · Memory: 55.2 MB*

```java
class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
    return nums;    
    }
}
```

## Approach 2 — 2024-07-25 16:46 (java)

*Runtime: 3 ms (faster than 100.0%) · Memory: 57.1 MB*

```java
class Solution {
    public int[] sortArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int n = max - min;
        int[] arr = new int[n + 1];
        for (int num : nums) {
            arr[num - min]++;
        }
        int index = 0;
        for (int i = 0; i <= n; i++) {
            while (arr[i] > 0) {
                nums[index] = min;
                index++;
                arr[i]--;
            }
            min++;
        }
    return nums;
    }
}
```
