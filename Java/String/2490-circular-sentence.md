# 2490. Circular Sentence

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/circular-sentence/
**Tags:** String

## Approach 1 — 2024-11-02 11:30 (java)

*Runtime: 1 ms (faster than 98.3%) · Memory: 42.3 MB*

```java
class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                if(arr[i].charAt(arr[i].length()-1)!=arr[0].charAt(0))
                    return false;
            }else if(arr[i].charAt(arr[i].length()-1)!=arr[i+1].charAt(0))
                    return false;
        }
    return true;
    }
}
```
