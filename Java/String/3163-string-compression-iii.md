# 3163. String Compression III

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/string-compression-iii/
**Tags:** String

## Approach 1 — 2024-11-04 13:34 (java)

*Runtime: 36 ms (faster than 33.3%) · Memory: 46.7 MB*

```java
class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length();i++){
            int count=1;
            while(i<word.length()-1&&word.charAt(i+1)==word.charAt(i)){
                if(count<9)count++;
                else break;
                i++;
            } 
            sb.append(""+count+word.charAt(i));  
        }
    return sb.toString();
    }
}
```
