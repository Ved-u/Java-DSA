# 1880. Check if Word Equals Summation of Two Words

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
**Tags:** String

## Approach 1 — 2024-06-06 09:33 (java)

*Runtime: 1 ms (faster than 29.1%) · Memory: 41.2 MB*

```java
class Solution {
    public boolean isSumEqual(String first, String second, String target) {
        int f, s, t;
        StringBuilder str1 = new StringBuilder();  
        StringBuilder str2 = new StringBuilder();  
        StringBuilder str3 = new StringBuilder(); 

        for (char x : first.toCharArray()) {
            str1.append(x - 'a');
        } 

        for (char x : second.toCharArray()) {
            str2.append(x - 'a');
        } 

        for (char x : target.toCharArray()) {
            str3.append(x - 'a');
        }

        try {
            f = Integer.parseInt(str1.toString());
            s = Integer.parseInt(str2.toString());
            t = Integer.parseInt(str3.toString());
        } catch (NumberFormatException e) {
            // Handle potential NumberFormatException if the strings are too large to be parsed as integers
            return false;
        }

        return f + s == t;
    }
}
```
