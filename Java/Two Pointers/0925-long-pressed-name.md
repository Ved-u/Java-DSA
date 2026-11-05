# 925. Long Pressed Name

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/long-pressed-name/
**Tags:** Two Pointers, String

## Approach 1 — 2024-11-19 09:25 (java)

*Runtime: 1 ms (faster than 86.2%) · Memory: 41.5 MB*

```java
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0; // Pointers for name and typed

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                // Match character from both name and typed
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                // Allow long-pressed character in typed
                j++;
            } else {
                // Mismatch
                return false;
            }
        }

        // Ensure all characters in name are matched
        return i == name.length();
    }
}
```

## Approach 2 — 2024-11-19 09:38 (java)

*Runtime: 1 ms (faster than 86.2%) · Memory: 41.4 MB*

```java
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0; 
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
```
