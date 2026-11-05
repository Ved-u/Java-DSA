# 12. Integer to Roman

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/integer-to-roman/
**Tags:** Hash Table, Math, String

## Approach 1 — 2024-03-05 17:50 (java)

*Runtime: 3 ms (faster than 99.9%) · Memory: 44.2 MB*

```java
class Solution {
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        // Arrays to store Roman numeral symbols and their corresponding values
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        // Loop through the values array and build the Roman numeral string
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}
```

## Approach 2 — 2024-08-24 08:16 (java)

*Runtime: 3 ms (faster than 99.9%) · Memory: 44.4 MB*

```java
class Solution {
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
     String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
    return result.toString();
    }
}
```
