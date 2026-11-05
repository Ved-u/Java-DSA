# 3174. Clear Digits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/clear-digits/
**Tags:** String, Stack, Simulation

## Approach 1 — 2024-06-08 20:22 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42.2 MB*

```java
class Solution {
    public String clearDigits(String s) {
        char ans[]=s.toCharArray();
        for(int i=0;i<ans.length;i++){
            if(isDigit(ans[i]))delLChar(ans, i);
        }
        StringBuilder str=new StringBuilder();
        for(char x:ans){
            if(x!='~')str.append(x);
        }
    return str.toString();    
    }
    public static void delLChar(char ans[],int index){
        ans[index]='~';
        for(int i=index-1;i>=0;i--){
           if(!isDigit(ans[i])){
                if(ans[i]=='~')continue;
            ans[i]='~';
            return;
           }
        }
    }
    public static boolean isDigit(char x){
        if(x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||     
            x=='7'||x=='8'||x=='9')return true;
    return false;        
    }
}
```
