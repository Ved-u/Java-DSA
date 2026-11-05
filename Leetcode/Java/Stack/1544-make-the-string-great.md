# 1544. Make The String Great

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/make-the-string-great/
**Tags:** String, Stack

## Approach 1 — 2024-06-25 09:59 (java)

*Runtime: 3 ms (faster than 61.3%) · Memory: 42.1 MB*

```java
class Solution {
    public String makeGood(String str) {
        StringBuilder s=new StringBuilder(str);
        for(int i=0;i<s.length()-1;i++){
            if(isGood(s.charAt(i),s.charAt(i+1))){
                s.delete(i,i+2);
                i=-1;
            }
        }
    return s.toString();    
    }public static boolean isGood(char a,char b){
        if(Character.isUpperCase(a)&&Character.isLowerCase(b)){
                if(Character.toLowerCase(a)==b)return true;
        }else if(Character.isUpperCase(b)&&Character.isLowerCase(a)){
                if(Character.toLowerCase(b)==a)return true;
        }
    return false;        
    }
}
```
