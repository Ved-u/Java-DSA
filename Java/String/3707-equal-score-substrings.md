# 3707. Equal Score Substrings

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/equal-score-substrings/
**Tags:** String, Prefix Sum

## Approach 1 — 2025-11-15 20:58 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 43.8 MB*

```java
class Solution {
    public boolean scoreBalance(String s) {
        int prefSum[]=new int[s.length()];
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'a'+1;
            prefSum [i]=sum;
        }
        for(int i=0;i<s.length()-1;i++){
            if(prefSum[i]==(prefSum[s.length()-1]-prefSum[i]))return true;
        }
        return false;
    }
}
```
