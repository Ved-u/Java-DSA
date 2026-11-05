# 3633. Earliest Finish Time for Land and Water Rides I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/
**Tags:** Array, Two Pointers, Binary Search, Greedy, Sorting

## Approach 1 — 2026-06-02 08:01 (java)

*Runtime: 3 ms (faster than 58.7%) · Memory: 46.8 MB*

```java
class Solution {
    public int earliestFinishTime(int[] lst, int[] ld,
                                  int[] wst, int[] wd) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < lst.length; i++) {
            for (int j = 0; j < wst.length; j++) {
                // land -> water
                int finishLand = lst[i] + ld[i];
                int finish1 = Math.max(finishLand, wst[j]) + wd[j];
                // water -> land
                int finishWater = wst[j] + wd[j];
                int finish2 = Math.max(finishWater, lst[i]) + ld[i];
                ans = Math.min(ans, Math.min(finish1, finish2));
            }
        }
        return ans;
    }
}
```
