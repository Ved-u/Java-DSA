# 1844. Replace All Digits with Characters

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/replace-all-digits-with-characters/
**Tags:** String

## Approach 1 — 2024-04-08 00:11 (java)

*Runtime: 1 ms (faster than 49.7%) · Memory: 41.2 MB*

```java
class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                str.append(s.charAt(i));
            } else {
                char shiftedChar = shift(s.charAt(i - 1), Character.getNumericValue(s.charAt(i)));
                str.append(shiftedChar);
            }
        }
        return str.toString();    
    }
    
    public char shift(char ch, int n) {
        int shiftedValue = ch + n;
        return (char) shiftedValue;
    }
}
```

## Approach 2 — 2024-04-08 00:14 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.3 MB*

```java
class Solution {
        public String replaceDigits(String s) {
           
        char[] charArr=s.toCharArray();
        
        for(int i=1;i<charArr.length;i=i+2)
            {
            charArr[i]=(char)(charArr[i-1]+charArr[i]-'0');
            }
                
           return String.valueOf(charArr);
       }
}
```
