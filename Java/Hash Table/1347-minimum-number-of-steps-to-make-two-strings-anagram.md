# 1347. Minimum Number of Steps to Make Two Strings Anagram

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2024-04-16 07:54 (java)

*Runtime: 7 ms (faster than 89.0%) · Memory: 45.5 MB*

```java
class Solution {
    public int minSteps(String s, String t) {
    int ans=0;
    int freqS[]=new int[26];
    int freqT[]=new int[26];
    for(int i=0;i<s.length();i++){
        freqS[s.charAt(i)-'a']++;
    }
    for(int i=0;i<t.length();i++){
        freqT[t.charAt(i)-'a']++;
    }
     for (int i = 0; i < 26; i++) {
            if (freqS[i] > freqT[i]) {
                ans += freqS[i] - freqT[i];
            }
        }
    return ans;
    }
}
```
