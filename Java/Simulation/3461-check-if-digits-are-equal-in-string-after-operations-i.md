# 3461. Check If Digits Are Equal in String After Operations I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/
**Tags:** Math, String, Simulation, Combinatorics, Number Theory

## Approach 1 — 2025-11-09 09:52 (java)

*Runtime: 24 ms (faster than 33.8%) · Memory: 47 MB*

```java
class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()!=2){
            s=sb.toString();
            sb.setLength(0); 
            for(int i=0;i<s.length()-1;i++){
            String x=""+(Integer.parseInt(""+s.charAt(i))+Integer.parseInt(""+s.charAt(i+1)))%10;
                sb.append(x);
            }    
        }
        return sb.charAt(0)==sb.charAt(1);
    }
}
```
