# 70. Climbing Stairs

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/climbing-stairs/
**Tags:** Math, Dynamic Programming, Memoization

## Approach 1 — 2024-09-25 10:25 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40 MB*

```java
class Solution {
    public int fun(int n,int[] dp){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        if(n==0)return 1;
        return dp[n]=fun(n-2,dp)+fun(n-1,dp);
    }
    public int climbStairs(int n){
       int[] dp=new int[n+3];
       Arrays.fill(dp,-1);
       return fun(n,dp);
    }
}
```
