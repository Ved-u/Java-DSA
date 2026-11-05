# 1930. Unique Length-3 Palindromic Subsequences

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/unique-length-3-palindromic-subsequences/
**Tags:** Hash Table, String, Bit Manipulation, Prefix Sum

## Approach 1 — 2025-01-04 13:25 (java)

*Runtime: 1044 ms (faster than 9.6%) · Memory: 46.9 MB*

```java
class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] left = new int[26]; 
        int[] right = new int[26];
        for (char c : s.toCharArray()) {
            right[c - 'a']++;
        }
        HashSet<String> uniquePalindromes = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char mid = s.charAt(i);
            right[mid - 'a']--; 
            for (int c = 0; c < 26; c++) {
                if (left[c] > 0 && right[c] > 0) {
    uniquePalindromes.add("" + (char)(c + 'a') + mid + (char)(c + 'a'));
                }
            }
            left[mid - 'a']++;
        }
    return uniquePalindromes.size();
    }
}
```

## Approach 2 — 2025-01-04 13:32 (java)

*Runtime: 168 ms (faster than 65.0%) · Memory: 45.2 MB*

```java
class Solution {
    public int countPalindromicSubsequence(String s) {
        int res = 0;
        for(char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if(first != -1 && last != -1 && first < last) {
                HashSet<Character> set = new HashSet<>();
                for(int i = first+1; i< last; i++) { 
                    set.add(s.charAt(i));
                }
                res += set.size(); 
            }
        }
    return res;
    }
}
```
