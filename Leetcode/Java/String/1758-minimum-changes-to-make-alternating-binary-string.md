# 1758. Minimum Changes To Make Alternating Binary String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
**Tags:** String

## Approach 1 — 2026-03-20 17:32 (java)

*Runtime: 15 ms (faster than 8.0%) · Memory: 44.8 MB*

```java
class Solution {
    public int minOperations(String s) {
       String str = gen(s);
       StringBuilder strm=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')strm.append(""+'1');
            else if(str.charAt(i)=='1')strm.append(""+'0');
        }
        int one=0,two=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=str.charAt(i))one++;
            if(s.charAt(i)!=strm.charAt(i))two++;
        }
    return Math.min(one,two);
    }
    String gen(String s){
       StringBuilder str=new StringBuilder();
       boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(flag){
                str.append(""+'1');
            }else{
                str.append(""+'0');
            }
            flag=!flag;
        }
        return str.toString();
    }
}
```
