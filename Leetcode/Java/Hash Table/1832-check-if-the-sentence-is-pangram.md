# 1832. Check if the Sentence Is Pangram

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-the-sentence-is-pangram/
**Tags:** Hash Table, String

## Approach 1 — 2024-03-30 16:32 (java)

*Runtime: 6 ms (faster than 7.0%) · Memory: 41.4 MB*

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        List<Character> check=new ArrayList<>();
        for(int i=0;i<sentence.length();i++){
            if(!(check.contains(sentence.charAt(i))))check.add(sentence.charAt(i));
        }
        if(check.size()==26)return true;
    return false;    
    }
}
```

## Approach 2 — 2024-03-30 16:36 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.9 MB*

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char a='a';a<='z';a++){
            if(!(sentence.contains(String.valueOf(a))))return  false;
        }
    return true;    
    }
}
```
