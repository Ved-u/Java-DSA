# 1678. Goal Parser Interpretation

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/goal-parser-interpretation/
**Tags:** String

## Approach 1 — 2024-04-15 15:59 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.2 MB*

```java
class Solution {
    public String interpret(String command) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    str.append("o");
                    i++;
                }    
                else if(command.charAt(i+1)=='a'){
                    str.append("al");
                    i+=3;
                }    
            }else{
                str.append(command.charAt(i));
            }
        }
    return str.toString();    
    }
}
```
