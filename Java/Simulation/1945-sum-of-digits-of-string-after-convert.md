# 1945. Sum of Digits of String After Convert

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
**Tags:** String, Simulation

## Approach 1 — 2024-06-27 13:53 (java)

*Runtime: 1 ms (faster than 78.3%) · Memory: 41.3 MB*

```java
class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert each character to its corresponding number and calculate the sum of the digits
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int charValue = s.charAt(i) - 'a' + 1;
            while (charValue > 0) {
                number += charValue % 10;
                charValue /= 10;
            }
        }

        // Step 2: Perform the transformation k times
        for (int i = 1; i < k; i++) {
            int temp = 0;
            while (number > 0) {
                temp += number % 10;
                number /= 10;
            }
            number = temp;
        }
        
        return number;
    }
}
```

## Approach 2 — 2024-09-03 08:42 (java)

*Runtime: 1 ms (faster than 78.3%) · Memory: 41.5 MB*

```java
class Solution {
    public int getLucky(String s, int k) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int charValue = s.charAt(i) - 'a' + 1;
            while (charValue > 0) {
                number += charValue % 10;
                charValue /= 10;
            }
        }
        for (int i = 1; i < k; i++) {
            int temp = 0;
            while (number > 0) {
                temp += number % 10;
                number /= 10;
            }
            number = temp;
        } 
    return number;
    }
}
```
