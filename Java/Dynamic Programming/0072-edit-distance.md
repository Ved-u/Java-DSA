# 72. Edit Distance

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/edit-distance/
**Tags:** String, Dynamic Programming

## Approach 1 — 2025-01-03 19:16 (java)

*Runtime: 3 ms (faster than 98.8%) · Memory: 45 MB*

```java
class Solution {
    public static int editDistance(String str, String str2, int i, int j, int[][] dp) {
        if (i == 0) return j;
        if (j == 0) return i;
        if (dp[i][j] != -1) return dp[i][j];
        if (str.charAt(i - 1) == str2.charAt(j - 1)) {
            return dp[i][j] = editDistance(str, str2, i - 1, j - 1, dp);
        }
        int replace = 1 + editDistance(str, str2, i - 1, j - 1, dp);
        int insert = 1 + editDistance(str, str2, i, j - 1, dp);
        int delete = 1 + editDistance(str, str2, i - 1, j, dp);
        return dp[i][j] = Math.min(replace, Math.min(insert, delete));
    }
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
    return editDistance(word1, word2, m, n, dp);
    }
}
```

## Approach 2 — 2025-01-04 10:31 (java)

*Runtime: 5 ms (faster than 74.2%) · Memory: 44.9 MB*

```java
class Solution {
    public int minDistance(String str, String str2) {
       int m=str.length(),n=str2.length();
       int dp[][]=new int[m+1][n+1];
       for(int i=0;i<dp.length;i++)dp[i][0]=i;
       for(int j=0;j<dp[0].length;j++)dp[0][j]=j;
       for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                    continue;
                }
                int replace=1+dp[i-1][j-1];
                int insert=1+dp[i][j-1];
                int delete=1+dp[i-1][j];
                dp[i][j]=Math.min(replace,Math.min(insert,delete));
            }
        }
    return dp[m][n];
    }
}
```
