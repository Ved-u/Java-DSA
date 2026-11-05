# 1518. Water Bottles

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/water-bottles/
**Tags:** Math, Simulation

## Approach 1 — 2024-06-01 21:12 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.4 MB*

```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        ans+=numBottles;
        while(numBottles>0){
            if(numBottles>=numExchange){numBottles-=numExchange;
            numBottles++;
            ans++;}else break;
        }
    return ans;    
    }
}
```

## Approach 2 — 2024-07-07 08:13 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.6 MB*

```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        ans+=numBottles;
        while(numBottles>0){
            if(numBottles>=numExchange){
                numBottles-=numExchange;
                numBottles++;
                ans++;
            }else break;
        }
    return ans;    
    }
}
```
