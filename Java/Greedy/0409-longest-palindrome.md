# 409. Longest Palindrome

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/longest-palindrome/
**Tags:** Hash Table, String, Greedy

## Approach 1 — 2024-06-04 18:03 (java)

*Runtime: 2 ms (faster than 74.6%) · Memory: 41.2 MB*

```java
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[52];
        
        // Count the frequency of each character
        for (char x : s.toCharArray()) {
            if (Character.isUpperCase(x)) {
                freq[(x - 'A') + 26]++;
            } else {
                freq[x - 'a']++;
            }
        }
        
        int ans = 0;
        boolean oddFound = false;
        
        // Calculate the length of the longest palindrome
        for (int x : freq) {
            if (x % 2 == 0) {
                ans += x;
            } else {
                ans += x - 1; // Add the even part
                oddFound = true;
            }
        }
        
        // If there was at least one character with an odd count, add one to the result
        if (oddFound) {
            ans++;
        }
        
        return ans;
    }
}
```

## Approach 2 — 2024-06-04 18:06 (java)

*Runtime: 2 ms (faster than 74.6%) · Memory: 41.7 MB*

```java
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[52];
        for (char x : s.toCharArray()) {
            if (Character.isUpperCase(x)) 
                freq[(x - 'A') + 26]++;
            else
                freq[x - 'a']++;
        }  
        int ans = 0;
        boolean oddFound = false;
        for (int x : freq) {
            if (x % 2 == 0) {
                ans += x;
            } else {
                ans += x - 1; 
                oddFound = true;
            }
        }
        if (oddFound) ans++;
    return ans;
    }
}
```
