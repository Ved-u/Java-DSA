# 3968. Maximum Manhattan Distance After All Moves

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-manhattan-distance-after-all-moves/
**Tags:** Math, String, Counting

## Approach 1 — 2026-06-21 09:10 (java)

*Runtime: 70 ms (faster than 5.8%) · Memory: 48.1 MB*

```java
class Solution {
    public int maxDistance(String moves) {
        int[] curr = new int[2];
        // StringBuilder moves = new StringBuilder(m);
        HashMap<Character,Integer> map = new HashMap<>();
        int underscore = 0;
        for(int i=0;i<moves.length();i++){
            char x = moves.charAt(i);
            if(Character.isLetter(x)){
                if(map.containsKey(x))map.put(x,map.get(x)+1);
                else map.put(x,1);
            }
            if(x == 'U')curr[1]++;
            else if(x == 'R')curr[0]++;
            else if(x == 'L')curr[0]--;
            else if(x == 'D')curr[1]--;
            else underscore++;
        }
        if(underscore == moves.length())return moves.length();
        // if(map.isEmpty())System.out.println("=====");
        char x = 'U';int max = 0;
        for(Character y:map.keySet()){
            if(map.get(y)>max){
                x = y;
                max = map.get(y);
            }
        }
        // if(x == 'U')curr[1]+=underscore;
        // else if(x == 'R')curr[0]+=underscore;
        // else if(x == 'L')curr[0]+=underscore;
        // else if(x == 'D')curr[1]+=underscore;
        return Math.abs(curr[0]-0)+Math.abs(curr[1]-0)+underscore;
    }
}
```

## Approach 2 — 2026-06-21 09:11 (java)

*Runtime: 74 ms (faster than 5.8%) · Memory: 48 MB*

```java
class Solution {
    public int maxDistance(String moves) {
        int[] curr = new int[2];
        // StringBuilder moves = new StringBuilder(m);
        HashMap<Character,Integer> map = new HashMap<>();
        int underscore = 0;
        for(int i=0;i<moves.length();i++){
            char x = moves.charAt(i);
            if(Character.isLetter(x)){
                if(map.containsKey(x))map.put(x,map.get(x)+1);
                else map.put(x,1);
            }
            if(x == 'U')curr[1]++;
            else if(x == 'R')curr[0]++;
            else if(x == 'L')curr[0]--;
            else if(x == 'D')curr[1]--;
            else underscore++;
        }
        if(underscore == moves.length())return moves.length();
        // if(map.isEmpty())System.out.println("=====");
        // char x = 'U';int max = 0;
        // for(Character y:map.keySet()){
        //     if(map.get(y)>max){
        //         x = y;
        //         max = map.get(y);
        //     }
        // }
        // if(x == 'U')curr[1]+=underscore;
        // else if(x == 'R')curr[0]+=underscore;
        // else if(x == 'L')curr[0]+=underscore;
        // else if(x == 'D')curr[1]+=underscore;
        return Math.abs(curr[0]-0)+Math.abs(curr[1]-0)+underscore;
    }
}
```

## Approach 3 — 2026-06-21 09:11 (java)

*Runtime: 18 ms (faster than 39.9%) · Memory: 47.6 MB*

```java
class Solution {
    public int maxDistance(String moves) {
        int[] curr = new int[2];
        int underscore = 0;
        for(int i=0;i<moves.length();i++){
            char x = moves.charAt(i);
            if(x == 'U')curr[1]++;
            else if(x == 'R')curr[0]++;
            else if(x == 'L')curr[0]--;
            else if(x == 'D')curr[1]--;
            else underscore++;
        }
        if(underscore == moves.length())return moves.length();
        return Math.abs(curr[0]-0)+Math.abs(curr[1]-0)+underscore;
    }
}
```
