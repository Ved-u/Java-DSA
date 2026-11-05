# 2559. Count Vowel Strings in Ranges

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-vowel-strings-in-ranges/
**Tags:** Array, String, Prefix Sum

## Approach 1 — 2025-01-03 00:36 (java)

*Runtime: 6 ms (faster than 82.4%) · Memory: 85.8 MB*

```java
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[]=new int[queries.length];
        int pref[]=new int[words.length];
        if(vowel(words[0].charAt(0))&&vowel(words[0].charAt(words[0].length()-1)))pref[0]=1;
        for(int i=1;i<words.length;i++){
            if(vowel(words[i].charAt(0))&&vowel(words[i].charAt(words[i].length()-1)))pref[i]=1;
            pref[i]+=pref[i-1];
        }
        for(int i=0;i<queries.length;i++){
            if(queries[i][0]==0)
                ans[i]=pref[queries[i][1]];
            else   ans[i]=pref[queries[i][1]]-pref[queries[i][0]-1];
        }
    return ans;
    }
    boolean vowel(char x){
        return x=='a'||x=='i'||x=='o'||x=='e'||x=='u';
    }
}
```
