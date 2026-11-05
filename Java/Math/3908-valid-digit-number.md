# 3908. Valid Digit Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/valid-digit-number/
**Tags:** Math

## Approach 1 — 2026-04-25 20:05 (java)

*Runtime: 2 ms (faster than 31.4%) · Memory: 42.9 MB*

```java
class Solution {
    public boolean validDigit(int n, int y) {
        String s=""+n;
        char x=(char)('0'+y);
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(i==0&&s.charAt(i)==x)return false;
            if(s.charAt(i)==x){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
```
