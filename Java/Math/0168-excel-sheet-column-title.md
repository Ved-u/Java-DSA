# 168. Excel Sheet Column Title

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/excel-sheet-column-title/
**Tags:** Math, String

## Approach 1 — 2024-09-19 16:49 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.1 MB*

```java
class Solution {
    public String convertToTitle(int num) {
        StringBuilder st=new StringBuilder();
        while(num>0){
            int r=(num-1)%26;
            st.append((char)(r+'A'));
            num=(num-1)/26;
        }
    return st.reverse().toString();
    }
}
```
