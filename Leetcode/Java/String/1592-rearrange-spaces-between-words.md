# 1592. Rearrange Spaces Between Words

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/rearrange-spaces-between-words/
**Tags:** String

## Approach 1 — 2024-11-12 11:35 (java)

*Runtime: 2 ms (faster than 88.6%) · Memory: 41.3 MB*

```java
class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') spaces++;
        }
        String[] arr = text.trim().split("\\s+");
        if (arr.length == 1) {
            StringBuilder sb = new StringBuilder(arr[0]);
            for (int i = 0; i < spaces; i++) sb.append(" ");
            return sb.toString();
        }
        int divide = spaces / (arr.length - 1);
        int remainder = spaces % (arr.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            for (int j = 0; i<arr.length-1&&j < divide; j++) 
                sb.append(" ");
        }
        for (int i = 0; i < remainder; i++) sb.append(" ");
    return sb.toString();
    }
}
```
