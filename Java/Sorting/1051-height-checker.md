# 1051. Height Checker

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/height-checker/
**Tags:** Array, Sorting, Counting Sort, Bubble Sort

## Approach 1 — 2024-06-10 13:54 (java)

*Runtime: 2 ms (faster than 90.3%) · Memory: 41.6 MB*

```java
class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=heights.clone();
       Arrays.sort(expected);
       int ans=0;
       for(int i=0;i<heights.length;i++){
        if(expected[i]!=heights[i])ans++;
       }
    return ans;   
    }
}
```
