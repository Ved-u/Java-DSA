# 3100. Water Bottles II

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/water-bottles-ii/
**Tags:** Math, Simulation

## Approach 1 — 2024-04-02 10:03 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.5 MB*

```java
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBot = 0;
        int botDrunk = 0;
        while (numBottles > 0) {
            botDrunk+=numBottles;
            emptyBot+=numBottles;
            numBottles=0;
            if(emptyBot>=numExchange){
                emptyBot-=numExchange;
                numBottles++;
                numExchange++;
            }
        }
        return botDrunk;
    }
}
```
