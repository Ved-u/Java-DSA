# 2716. Minimize String Length

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimize-string-length/
**Tags:** Hash Table, String

## Approach 1 — 2024-05-29 14:51 (java)

*Runtime: 4 ms (faster than 82.6%) · Memory: 44.7 MB*

```java
class Solution {
    public int minimizedStringLength(String s) {
        int ans=0;
        boolean freq[]=new boolean[26];
        for(char x:s.toCharArray())
            if(freq[x-'a']==false)
               freq[x-'a']=true;
        for(boolean x:freq)
            if(x)
            ans++;    
    return ans;    
    }
}
```
