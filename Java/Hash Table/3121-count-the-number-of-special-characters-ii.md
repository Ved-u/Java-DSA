# 3121. Count the Number of Special Characters II

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-the-number-of-special-characters-ii/
**Tags:** Hash Table, String

## Approach 1 — 2026-05-27 08:22 (java)

*Runtime: 10 ms (faster than 78.2%) · Memory: 48.2 MB*

```java
class Solution {
    public int numberOfSpecialChars(String word) {
        int freq[][]=new int[26][2];
        for(int i=0;i<freq.length;i++){
            freq[i][0]=-1;
            freq[i][1]=-1;
        }
        int ans=0;
        for(int i=0;i<word.length();i++){
            char x=word.charAt(i);
            if(x>='a'&&x<='z'){
                freq[x-'a'][0]=i;
            }else if(x>='A'&&x<='Z'){
                int idx=x-'A';
                if(freq[idx][1]==-1)freq[idx][1]=i;
            }
        }
        for(int x[]:freq){
            if(x[0]==-1||x[1]==-1)continue;
            if(x[0]<x[1])ans++;
        }
        return ans;
    }
}
```
