# 2309. Greatest English Letter in Upper and Lower Case

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
**Tags:** Hash Table, String, Enumeration

## Approach 1 — 2024-06-19 10:48 (java)

*Runtime: 1148 ms (faster than 5.3%) · Memory: 45.1 MB*

```java
class Solution {
    public String greatestLetter(String s) {
        String ans="0";
        for(char x:s.toCharArray()){
            for(char y:s.toCharArray()){
                if(Character.isUpperCase(x)&&Character.isLowerCase(y)){
                    if((x-'A'==y-'a')&&ans.charAt(0)<x){
                     ans=Character.toString(x);
                    break;   
                    }
                }else if(Character.isUpperCase(y)&&Character.isLowerCase(x)){
                    if((x-'A'==y-'a')&&ans.charAt(0)<y){
                      ans=Character.toString(y);
                    break;  
                    }
                }
            }
        }if(ans.charAt(0)=='0')return "";
    return ans;    
    }
}
```

## Approach 2 — 2024-06-19 10:50 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public String greatestLetter(String s) {
        for (int i = 'z'; i >= 'a'; i--) {
            String lower = Character.toString(i);
            String upper = Character.toString(i - 32);
            if (s.contains(lower) && s.contains(upper)) return upper;
        }
    return "";
    }
}
```
