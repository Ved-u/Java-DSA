# 2586. Count the Number of Vowel Strings in Range

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
**Tags:** Array, String, Counting

## Approach 1 — 2024-06-06 09:10 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.2 MB*

```java
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans=0;
        String str;
        for(int i=left;i<=right;i++){
            str=words[i];
            if(isVowel(str.charAt(0))&&isVowel(str.charAt(str.length()-1)))ans++;
        }
    return ans;    
    }
    public static boolean isVowel(char x){
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')return true;
    return false;    
    }
}
```
