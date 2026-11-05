# 1957. Delete Characters to Make Fancy String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/delete-characters-to-make-fancy-string/
**Tags:** String

## Approach 1 — 2024-11-01 17:02 (java)

*Runtime: 1686 ms (faster than 5.1%) · Memory: 45.4 MB*

```java
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length()-2;i++){
        if(sb.charAt(i)==sb.charAt(i+1)&&sb.charAt(i+1)==sb.charAt(i+2)){
                sb.deleteCharAt(i);
                i--;
         }
        }
    return sb.toString();
    }
}
```
