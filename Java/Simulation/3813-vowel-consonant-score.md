# 3813. Vowel-Consonant Score

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/vowel-consonant-score/
**Tags:** String, Simulation

## Approach 1 — 2026-01-18 08:07 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 43.8 MB*

```java
class Solution {
    public int vowelConsonantScore(String s) {
        int v=0,c=0;
        for(char x:s.toCharArray()){
            if(Character.isWhitespace(x)||Character.isDigit(x))continue;
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')v++;
            else c++;
        }
        if(c==0)return 0;
        return v/c;
    }
}
```
