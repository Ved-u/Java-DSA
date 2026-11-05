# 2545. Sort the Students by Their Kth Score

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/sort-the-students-by-their-kth-score/
**Tags:** Array, Sorting, Matrix

## Approach 1 — 2024-07-15 21:29 (java)

*Runtime: 2 ms (faster than 96.2%) · Memory: 51.8 MB*

```java
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 0; i < score.length; i++) {
            int maxIndx = i;
            for (int j = i + 1; j < score.length; j++) {
                if (score[j][k] > score[maxIndx][k]) {
                    maxIndx = j;
                }
            }
            if (maxIndx != i) {
                int[] temp = score[i];
                score[i] = score[maxIndx];
                score[maxIndx] = temp;
            }
        }
    return score;
    }
}
```
