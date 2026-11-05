# 3120. Count the Number of Special Characters I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-the-number-of-special-characters-i/
**Tags:** Hash Table, String

## Approach 1 — 2026-05-26 20:02 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 43.6 MB*

```java
class Solution {
    public int numberOfSpecialChars(String word) {
        int lower[]=new int[26];
        int upper[]=new int[26];
        for(int i=0;i<word.length();i++){
            char x=word.charAt(i);
            if(x>='a'&&x<='z')lower[x-'a']++;
            else if(x>='A'&&x<='Z')upper[x-'A']++;
        }
        int ans=0;
        for(int i=0;i<lower.length;i++){
            if(upper[i]>0&&lower[i]>0)ans++;
        }
        return ans;
    }
}
```
