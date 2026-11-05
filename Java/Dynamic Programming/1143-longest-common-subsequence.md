# 1143. Longest Common Subsequence

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/longest-common-subsequence/
**Tags:** String, Dynamic Programming, Longest Common Subsequence

## Approach 1 — 2024-12-29 19:50 (java)

*Runtime: 34 ms (faster than 7.4%) · Memory: 50.9 MB*

```java
class Solution {
    public static int longestCommonSubsequenceMemoization(int dp[][],int i,int j,String str,String str2){
        if(i==str.length()||j==str2.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(str.charAt(i)==str2.charAt(j))
            return dp[i][j]=1+ longestCommonSubsequenceMemoization(dp,i+1, j+1, str, str2);
    return dp[i][j]=Math.max(longestCommonSubsequenceMemoization(dp,i,j+1,str,str2),longestCommonSubsequenceMemoization(dp,i+1,j,str,str2));
    }
    public int longestCommonSubsequence(String str, String str2) {
        int dp[][]=new int[str.length()][str2.length()];
      for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j]=-1;
        }
      }
      return longestCommonSubsequenceMemoization(dp,0,0,str,str2);
    }
}
```

## Approach 2 — 2024-12-29 20:10 (java)

*Runtime: 21 ms (faster than 62.1%) · Memory: 50.1 MB*

```java
class Solution {
    public int longestCommonSubsequence(String str, String str2) {
         int dp[][] = new int[str.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str.charAt(i - 1) == str2.charAt(j - 1))dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return (dp[str.length()][str2.length()]);
    }
}
```
