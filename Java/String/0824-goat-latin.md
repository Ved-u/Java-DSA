# 824. Goat Latin

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/goat-latin/
**Tags:** String

## Approach 1 — 2024-06-28 18:14 (java)

*Runtime: 2 ms (faster than 93.1%) · Memory: 41.5 MB*

```java
class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] arr = sentence.split(" ");
        int i = 0;
        for (String tmp : arr){
            if (isVowel(tmp.charAt(0)))
                sb.append(tmp).append("ma");
            else
        sb.append(tmp.substring(1)).append(tmp.charAt(0)).append("ma");
            for (int j = 0; j <= i; j++)
                sb.append("a");
            sb.append(" ");
            i++;
        }
    return sb.toString().trim();
    }
    boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return ( 
            c=='a' 
            || c== 'e'
            || c== 'i'
            || c== 'o'
            || c== 'u'
        );
    }
}
```
