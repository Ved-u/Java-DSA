# 1456. Maximum Number of Vowels in a Substring of Given Length

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
**Tags:** String, Sliding Window

## Approach 1 — 2024-08-13 20:11 (java)

*Runtime: 13 ms (faster than 74.4%) · Memory: 44.7 MB*

```java
class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int vowels = 0;
        for (int i = 0; i < k; i++) {
            if (vowel(s.charAt(i))) vowels++;
        }
        ans = vowels;
        for (int i = k; i < s.length(); i++) {
            if (vowel(s.charAt(i))) vowels++;
            if (vowel(s.charAt(i - k))) vowels--; 
            ans = Math.max(ans, vowels);
        }
    return ans;
    }
    public boolean vowel(char x) {
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }
}
```
