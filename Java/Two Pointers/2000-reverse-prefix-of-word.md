# 2000. Reverse Prefix of Word

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-prefix-of-word/
**Tags:** Two Pointers, String, Stack

## Approach 1 — 2024-04-15 14:26 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.2 MB*

```java
class Solution {
    public String reversePrefix(String word, char ch) {
        int size=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                size=i;
                break;
            }
        }if(size==0)return word;
        char ans[]=new char[word.length()];
        for(int i=0;i<word.length();i++){
            if(size>=0)ans[size--]=word.charAt(i);
            else ans[i]=word.charAt(i);
        }
    return new String(ans);    
    }
}
```
