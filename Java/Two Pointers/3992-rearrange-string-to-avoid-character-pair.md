# 3992. Rearrange String to Avoid Character Pair

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/rearrange-string-to-avoid-character-pair/
**Tags:** Two Pointers, String, Sorting

## Approach 1 — 2026-07-21 19:41 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 45.2 MB*

```java
class Solution {
    public String rearrangeString(String s, char x, char y) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder ans = new StringBuilder();
        while(freq[y-'a']-- > 0){
            ans.append(y);
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]<=0)continue;
            for(int j=1;j<=freq[i];j++){
                char c = (char)('a' + i);
                if(c == x || c == y) continue;
                ans.append(c);
            }
        }
        while(freq[x-'a']-- > 0){
            ans.append(x);
        }
        return ans.toString();
    }
}
```
