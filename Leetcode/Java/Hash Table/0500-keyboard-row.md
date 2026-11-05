# 500. Keyboard Row

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/keyboard-row/
**Tags:** Array, Hash Table, String

## Approach 1 — 2024-06-15 20:44 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.6 MB*

```java
class Solution {
    public String[] findWords(String[] words) {
        String fr = "qwertyuiop";
        String sr = "asdfghjkl";
        String tr = "zxcvbnm";
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toLowerCase().toCharArray();
            boolean check=true, fRow = false, sRow = false, tRow = false;
            if (fr.indexOf(word[0]) != -1)fRow = true;
            else if (sr.indexOf(word[0]) != -1)sRow = true;
            else if (tr.indexOf(word[0]) != -1)tRow = true;
            for (int j = 0; j < word.length; j++) {
                if (fRow) {
                    if (fr.indexOf(word[j]) == -1) {
                        check = false;
                        break;
                    }
                }else if (sRow) {
                    if (sr.indexOf(word[j]) == -1) {
                        check = false;
                        break;
                    }
                }else if (tRow) {
                    if (tr.indexOf(word[j]) == -1) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) ans.add(words[i]); 
        }
        String[] uttar = new String[ans.size()];
        uttar = ans.toArray(uttar);
        return uttar;
    }
}
```
