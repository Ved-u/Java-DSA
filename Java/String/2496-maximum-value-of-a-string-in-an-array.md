# 2496. Maximum Value of a String in an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/
**Tags:** Array, String

## Approach 1 — 2024-06-10 15:38 (java)

*Runtime: 1 ms (faster than 94.6%) · Memory: 41 MB*

```java
class Solution {
    public int maximumValue(String[] strs) {
        int ans=0;
        int value;
        boolean letter;
        for(String x:strs){
            letter=false;
            value=0;
            for(char ch:x.toCharArray()){
                if(Character.isLetter(ch)){
                    letter=true;
                    break;
                }
            }
            if(letter)value=x.length();
            else value=Integer.parseInt(x);
            ans=Math.max(ans,value);
        }
    return ans;    
    }
}
```
