# 3602. Hexadecimal and Hexatrigesimal Conversion

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/hexadecimal-and-hexatrigesimal-conversion/
**Tags:** Math, String

## Approach 1 — 2026-03-29 19:22 (java)

*Runtime: 4 ms (faster than 46.5%) · Memory: 44 MB*

```java
class Solution {
    public String concatHex36(int num) {
        String hex = Integer.toHexString(num*num);
        String Trex = Trex(num*num*num);
        return hex.toUpperCase()+Trex;
    }
    String Trex(int num){//trihexadecimal
        StringBuilder sb=new StringBuilder();
        while(num>0){
            char x;
            int rem=num%36;
            if(rem<=9)x=(char)(rem+'0');
            else x=(char)(rem-10+'A');
            sb.append(""+x);
            num/=36;
        }
        return sb.reverse().toString();
    }
}
```
