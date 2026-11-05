# 948. Bag of Tokens

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/bag-of-tokens/
**Tags:** Array, Two Pointers, Greedy, Sorting

## Approach 1 — 2024-04-28 14:03 (java)

*Runtime: 2 ms (faster than 100.0%) · Memory: 42.8 MB*

```java
import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if (tokens.length == 1) {
            if (power >= tokens[0]) return 1;
            return 0;
        }
        int score = 0;
        int maxScore = 0;
        int left = 0;
        int right = tokens.length - 1;
        Arrays.sort(tokens);
        
        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                power += tokens[right];
                score--;
                right--;
            } else {
                break; // If neither condition satisfies, we cannot proceed further
            }
        }   
        return maxScore;
    }
}
```

## Approach 2 — 2024-04-28 14:07 (java)

*Runtime: 2 ms (faster than 100.0%) · Memory: 42.4 MB*

```java
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if (tokens.length == 1) {
            if (power >= tokens[0]) return 1;
            return 0;
        }
        int score = 0;
        int maxScore = 0;
        int left = 0;
        int right = tokens.length - 1;
        Arrays.sort(tokens);
        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                power += tokens[right];
                score--;
                right--;
            } else  break;
        }   
    return maxScore;
    }
}
```
