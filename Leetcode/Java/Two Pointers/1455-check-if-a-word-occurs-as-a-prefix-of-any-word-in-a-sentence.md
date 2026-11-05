# 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
**Tags:** Two Pointers, String, String Matching

## Approach 1 — 2024-08-11 22:37 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
       String arr[]=sentence.split(" ");
       for(int i=0;i<arr.length;i++){
        if(arr[i].indexOf(searchWord)==0)return i+1;
       } 
    return -1;   
    }
}
```
