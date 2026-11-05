# 10. Regular Expression Matching

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/regular-expression-matching/
**Tags:** String, Dynamic Programming, Recursion

## Approach 1 — 2025-01-04 13:10 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42 MB*

```java
class Solution {
    private boolean isMatch(int i, int j, String s, String p) {
        if (j < 0) return i < 0; // Both strings are fully matched
        if (i < 0) {
            // Check if remaining pattern can match an empty string (only '*' is allowed)
            while (j >= 0) {
                if (p.charAt(j) != '*') return false;
                j -= 2; // Skip the preceding character and '*'
            }
            return true;
        }

        if (p.charAt(j) == '*') {
            // '*' can match zero or more of the preceding element
            return isMatch(i, j - 2, s, p) // Zero occurrences of preceding element
                || ((s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.') && isMatch(i - 1, j, s, p));
        }

        // Check for exact match or wildcard match ('.')
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            return isMatch(i - 1, j - 1, s, p);
        }

        return false; // No match
    }

    public boolean isMatch(String s, String p) {
        return isMatch(s.length() - 1, p.length() - 1, s, p);
    }
}
```

## Approach 2 — 2025-01-04 13:12 (java)

*Runtime: 2 ms (faster than 56.3%) · Memory: 42 MB*

```java
class Solution {
    private boolean isMatch(int i, int j, String s, String p) {
        if (j < 0) return i < 0;
        if (i < 0) {
            for(;j >= 0;j-=2) {
                if (p.charAt(j) != '*') return false;
            }
            return true;
        }
        if (p.charAt(j) == '*'){return isMatch(i, j - 2, s, p)|| ((s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.') && isMatch(i - 1, j, s, p));
        }
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')
            return isMatch(i - 1, j - 1, s, p);
        return false; 
    }
    public boolean isMatch(String s, String p) {
        return isMatch(s.length() - 1, p.length() - 1, s, p);
    }
}
```
