# 3238. Find the Number of Winning Players

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-number-of-winning-players/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2024-08-03 20:18 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 45.2 MB*

```java
class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        // Maximum number of colors is 11 as per the constraints
        int[][] playerColorCount = new int[n][11];
        
        // Count the balls picked by each player of each color
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            playerColorCount[player][color]++;
        }
        
        int winners = 0;
        
        // Check how many players meet the condition to win
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 11; j++) {
                if (playerColorCount[i][j] > i) {
                    winners++;
                    break;
                }
            }
        }
        
        return winners;
    }
}
```

## Approach 2 — 2024-08-03 20:20 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 45.2 MB*

```java
class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] playerColorCount=new int[n][11];
        for(int[] p:pick)
            playerColorCount[p[0]][p[1]]++;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<11;j++){
                if(playerColorCount[i][j]>i){
                    ans++;
                    break;
                }
            }
        }
    return ans;
    }
}
```
