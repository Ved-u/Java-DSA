# 56. Merge Intervals

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/merge-intervals/
**Tags:** Array, Sorting, Quicksort

## Approach 1 — 2024-03-11 19:01 (java)

*Runtime: 9 ms (faster than 37.4%) · Memory: 46.5 MB*

```java
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Sort the intervals based on the start times
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (currentInterval[1] >= nextStart) {
                // Merge the intervals
                currentInterval[1] = Math.max(currentInterval[1], nextEnd);
            } else {
                // Disjoint intervals, add the currentInterval to the result
                mergedIntervals.add(currentInterval);
                currentInterval = intervals[i]; // Start a new interval
            }
        }

        // Add the last interval to the result
        mergedIntervals.add(currentInterval);

        // Convert the ArrayList to a 2D array
        int[][] result = new int[mergedIntervals.size()][2];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            result[i] = mergedIntervals.get(i);
        }

        return result;
    }
}
```
