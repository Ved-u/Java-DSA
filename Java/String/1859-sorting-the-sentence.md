# 1859. Sorting the Sentence

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sorting-the-sentence/
**Tags:** String, Sorting, Bubble Sort

## Approach 1 — 2024-03-30 21:14 (java)

*Runtime: 1 ms (faster than 42.1%) · Memory: 41.3 MB*

```java
class Solution {
    public String sortSentence(String s) {
        char count='0';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')count++;
        }count++;
        int currIndex=0;
        int prevIndex=0;
        StringBuilder str=new StringBuilder();
       for(char ch='1';ch<=count;ch++){
            currIndex=0;
            prevIndex=0;
            if(ch!='1')str.append(' ');
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')prevIndex=i+1;
            if(s.charAt(i)==ch){
                currIndex=i-1;
                while(prevIndex<=currIndex){
                    str.append(s.charAt(prevIndex++));
                }
              }
            }  
       }
    return str.toString();    
    }
}
```
