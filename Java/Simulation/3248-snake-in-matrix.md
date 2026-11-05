# 3248. Snake in Matrix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/snake-in-matrix/
**Tags:** Array, String, Simulation

## Approach 1 — 2024-10-06 13:29 (java)

*Runtime: 2 ms (faster than 95.0%) · Memory: 44.1 MB*

```java
class Solution {
    public int finalPositionOfSnake(int n, List<String> c) {
        int rc[]={0,0};
        for(int i=0;i<c.size();i++){
            if(c.get(i).equals("UP"))rc[0]--;
            else if(c.get(i).equals("DOWN"))rc[0]++;
            else if(c.get(i).equals("LEFT"))rc[1]--;
            else rc[1]++;
        }
    return rc[0]*n+rc[1];
    }
}
```

## Approach 2 — 2024-10-06 13:30 (java)

*Runtime: 2 ms (faster than 95.0%) · Memory: 44.6 MB*

```java
class Solution {
    public int finalPositionOfSnake(int n, List<String> c) {
        int rc[]={0,0};
        for(String x:c){
            if(x.equals("UP"))rc[0]--;
            else if(x.equals("DOWN"))rc[0]++;
            else if(x.equals("LEFT"))rc[1]--;
            else rc[1]++;
        }
    return rc[0]*n+rc[1];
    }
}
```
