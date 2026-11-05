# 1025. Divisor Game

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/divisor-game/
**Tags:** Math, Dynamic Programming, Brainteaser, Game Theory, Impartial Game

## Approach 1 — 2026-04-03 12:44 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.9 MB*

```java
class Solution {
    public boolean divisorGame(int n) {
        boolean alice=true;
        while(true){
            int x=divisor(n);
            if(x==-1)break;
            n-=x;
            alice=!alice;
        }
        if(alice)return false;
    return true;
    }
    int divisor(int n){
        for(int i=1;i<n;i++){
            if(n%i==0)return i;
        }
        return -1;
    }
}
```

## Approach 2 — 2026-04-03 12:45 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.8 MB*

```java
class Solution {
    public boolean divisorGame(int n) {
        return n%2==0;
    }
}
```
