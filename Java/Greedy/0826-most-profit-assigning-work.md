# 826. Most Profit Assigning Work

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/most-profit-assigning-work/
**Tags:** Array, Two Pointers, Binary Search, Greedy, Sorting

## Approach 1 — 2024-09-17 10:21 (java)

*Runtime: 18 ms (faster than 92.1%) · Memory: 45.4 MB*

```java
class Solution {
public int maxProfitAssignment(int[] difficulty,int[] profit,int[] worker){       int n = difficulty.length;
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Arrays.sort(worker);
        int maxProfit = 0, i = 0, best = 0;
        for (int ability : worker) {
            while (i < n && ability >= jobs[i][0]) {
                best = Math.max(best, jobs[i][1]);
                i++;
            }
            maxProfit += best;
        }
    return maxProfit;
    }
}
```
