# 3222. Find the Winning Player in Coin Game

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-winning-player-in-coin-game/
**Tags:** Math, Simulation, Game Theory

## Approach 1 — 2024-07-20 20:58 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.4 MB*

```java
class Solution {
    public String losingPlayer(int x, int y) {
        while (true) {
            // Alice's turn
            if (x < 1 || y < 4) return "Bob"; // Alice can't pick 1 coin with a value of 75 and 4 coins with a value of 10
            x--;
            y -= 4;
            
            // Bob's turn
            if (x < 1 || y < 4) return "Alice"; // Bob can't pick 1 coin with a value of 75 and 4 coins with a value of 10
            x--;
            y -= 4;
        }
    }
}
```

## Approach 2 — 2024-07-20 20:59 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.8 MB*

```java
class Solution {
    public String losingPlayer(int x, int y) {
        while(true){
            //alice turn
            if(x<1||y<4)return "Bob";
            x--;
            y-=4;
            //bob turn
            if(x<1||y<4)return "Alice";
            x--;
            y-=4;
        }
   // return "";    
    }
}
```
