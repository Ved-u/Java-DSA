# 2938. Separate Black and White Balls

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/separate-black-and-white-balls/
**Tags:** Two Pointers, String, Greedy

## Approach 1 — 2024-10-15 10:32 (java)

*Runtime: 9 ms (faster than 15.7%) · Memory: 45.1 MB*

```java
class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        long onesCount = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')onesCount++;
            else if (s.charAt(i) == '0')ans += onesCount;  
        }
    return ans;
    }
}
```

## Approach 2 — 2024-10-15 10:33 (java)

*Runtime: 7 ms (faster than 100.0%) · Memory: 45.5 MB*

```java
class Solution {

    public long minimumSteps(String s) {
        int whitePosition = 0;
        long totalSwaps = 0;

        // Iterate through each ball (character) in the string
        for (int currentPos = 0; currentPos < s.length(); currentPos++) {
            if (s.charAt(currentPos) == '0') {
                // Calculate the number of swaps needed
                // to move it to leftmost available position
                totalSwaps += currentPos - whitePosition;

                // Move the next available position for a white ball one step to the right
                whitePosition++;
            }
        }

        return totalSwaps;
    }
}
```

## Approach 3 — 2024-11-07 17:53 (java)

*Runtime: 7 ms (faster than 100.0%) · Memory: 45.7 MB*

```java
class Solution {
    public long minimumSteps(String s) {
        int whitePosition = 0;
        long totalSwaps = 0;
        for (int currentPos = 0; currentPos < s.length(); currentPos++) {
            if (s.charAt(currentPos) == '0') {
                totalSwaps += currentPos - whitePosition;
                whitePosition++;
            }
        }
    return totalSwaps;
    }
}
```
