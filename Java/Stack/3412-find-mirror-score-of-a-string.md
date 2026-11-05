# 3412. Find Mirror Score of a String

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-mirror-score-of-a-string/
**Tags:** Hash Table, String, Stack, Simulation

## Approach 1 — 2025-01-05 08:25 (java)

*Runtime: 37 ms (faster than 34.8%) · Memory: 47 MB*

```java
import java.util.*;

class Solution {
    public long calculateScore(String s) {
        long score = 0;
        boolean[] isMarked = new boolean[s.length()];
        Map<Character, Deque<Integer>> charMap = new HashMap<>();

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char mirror = getMirror(current);

            // Check if there is an unmarked mirror character available
            if (charMap.containsKey(mirror) && !charMap.get(mirror).isEmpty()) {
                int j = charMap.get(mirror).pollLast(); // Get the closest valid match
                if (!isMarked[j]) {
                    score += i - j; // Calculate score
                    isMarked[i] = true;
                    isMarked[j] = true;
                }
            } else {
                // Store the index of the current character
                charMap.putIfAbsent(current, new ArrayDeque<>());
                charMap.get(current).add(i);
            }
        }

        return score;
    }

    // Helper function to get the mirror character
    private char getMirror(char c) {
        return (char) ('z' - (c - 'a'));
    }
}
```
