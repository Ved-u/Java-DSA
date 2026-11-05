# 3360. Stone Removal Game

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/stone-removal-game/
**Tags:** Math, Simulation

## Approach 1 — 2024-11-23 20:11 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.5 MB*

```java
class Solution {
    public boolean canAliceWin(int n) {
        boolean alice=true;
        boolean win=false;
        int count=10;
        while(count!=0&&count<=n){
           if(alice){
               n-=count;
               count--;
               alice=false;
               win=true;
           }else{
               n-=count;
               count--;
               alice=true;
               win=false;
           } 
        }
    return win;
    }
}
```
