# 1816. Truncate Sentence

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/truncate-sentence/
**Tags:** Array, String

## Approach 1 — 2024-03-30 11:28 (java)

*Runtime: 1 ms (faster than 82.9%) · Memory: 41.4 MB*

```java
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')k--;
            if(k==0)return str.toString();
            str.append(s.charAt(i));
        } 
    return str.toString();     
    }
}
```

## Approach 2 — 2024-03-30 11:30 (java)

*Runtime: 1 ms (faster than 82.9%) · Memory: 41.3 MB*

```java
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')k--;
            if(k==0)break;
            str.append(s.charAt(i));
        } 
    return str.toString();     
    }
}
```
