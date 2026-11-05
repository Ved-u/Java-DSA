# 3612. Process String with Special Operations I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/process-string-with-special-operations-i/
**Tags:** String, Simulation

## Approach 1 — 2026-06-16 10:48 (java)

*Runtime: 4 ms (faster than 80.1%) · Memory: 55.3 MB*

```java
class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(Character.isLetter(x)){
                sb.append(x);
            }else if(x=='*'){
                if(sb.length()>0)sb.deleteCharAt(sb.length()-1);
            }else if(x=='#'){
                sb.append(sb.toString());
            }else if(x=='%'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
```
