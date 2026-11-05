# 1974. Minimum Time to Type Word Using Special Typewriter

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/
**Tags:** String, Greedy

## Approach 1 — 2024-06-06 08:27 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.1 MB*

```java
class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char current = 'a'; 
        for (char ch : word.toCharArray()) {
            int clockwiseDist = Math.abs(ch - current);
            int counterClockwiseDist = 26 - clockwiseDist;
            time += Math.min(clockwiseDist, counterClockwiseDist);
            current = ch; 
            time++; 
        }  
    return time;
    }
}
```

## Approach 2 — 2024-06-06 08:28 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char current = 'a'; 
        int counterClockwiseDist,clockwiseDist;
        for (char ch : word.toCharArray()) {
            clockwiseDist = Math.abs(ch - current);
            counterClockwiseDist = 26 - clockwiseDist;
            time += Math.min(clockwiseDist, counterClockwiseDist);
            current = ch; 
            time++; 
        }  
    return time;
    }
}
```
