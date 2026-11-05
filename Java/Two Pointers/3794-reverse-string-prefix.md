# 3794. Reverse String Prefix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-string-prefix/
**Tags:** Two Pointers, String

## Approach 1 — 2026-03-07 19:56 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.6 MB*

```java
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(int i=k-1;i>=0;i--){
            ans.append(s.charAt(i));
        }
        for(int i=k;i<s.length();i++){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
```
