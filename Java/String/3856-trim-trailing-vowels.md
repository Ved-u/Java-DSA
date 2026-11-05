# 3856. Trim Trailing Vowels

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/trim-trailing-vowels/
**Tags:** String

## Approach 1 — 2026-03-10 23:30 (java)

*Runtime: 2 ms (faster than 38.8%) · Memory: 45.3 MB*

```java
class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int start=0;
        // for(int i=0;i<s.length();i++){
        //     if(vowel(s.charAt(i))){
        //         continue;
        //     }else{
        //         start=i;
        //         break;
        //     }
        // }
        int end=s.length()-1;
        for(int i=s.length()-1;i>=0;i--){
            if(vowel(s.charAt(i))){
                if(i==0)return "";
                continue;
            }else{
                end=i;
                break;
            }
        }
        for(int i=start;i<=end;i++){
            sb.append(""+s.charAt(i));
        }
        return sb.toString();
    }
    boolean vowel(char c){
        if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')return true;
        return false;
    }
}
```

## Approach 2 — 2026-03-10 23:31 (java)

*Runtime: 2 ms (faster than 38.8%) · Memory: 45.9 MB*

```java
class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int end=s.length()-1;
        for(int i=s.length()-1;i>=0;i--){
            if(vowel(s.charAt(i))){
                if(i==0)return "";
                continue;
            }else{
                end=i;
                break;
            }
        }
        for(int i=0;i<=end;i++){
            sb.append(""+s.charAt(i));
        }
        return sb.toString();
    }
    boolean vowel(char c){
        if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')return true;
        return false;
    }
}
```
