# 2325. Decode the Message

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/decode-the-message/
**Tags:** Hash Table, String

## Approach 1 — 2024-04-03 11:49 (java)

*Runtime: 3 ms (faster than 91.8%) · Memory: 41.9 MB*

```java
public class Solution {
    public String decodeMessage(String key, String message) {
        // Create an array to represent the substitution table
        char[] substitutionTable = new char[26];
        
        // Initialize the substitution table with spaces
        for (int i = 0; i < substitutionTable.length; i++) {
            substitutionTable[i] = ' ';
        }
        
        // Populate the substitution table with the first appearance of each letter in the key
        int index = 0;
        for (char ch : key.toCharArray()) {
            if (Character.isLowerCase(ch) && substitutionTable[ch - 'a'] == ' ') {
                substitutionTable[ch - 'a'] = (char)('a' + index);
                index++;
            }
        }
        
        // Construct the decoded message using the substitution table
        StringBuilder decodedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                // Space remains unchanged
                decodedMessage.append(' ');
            } else {
                // Substitute character using the substitution table
                decodedMessage.append(substitutionTable[ch - 'a']);
            }
        }
        
        return decodedMessage.toString();
    }
}
```
