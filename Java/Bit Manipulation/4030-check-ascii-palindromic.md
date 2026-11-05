# 4030. Check ASCII Palindromic

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-ascii-palindromic/
**Tags:** Two Pointers, String, Bit Manipulation

## Approach 1 — 2026-08-23 16:26 (java)

*Runtime: 14 ms · Memory: 46.4 MB*

```java
class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            int ascii = x;
            sb.append(String.format("%8s",Integer.toBinaryString(ascii)).replace(' ','0'));
        }
        return isPalindrome(sb);
    }
    boolean isPalindrome(StringBuilder s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
    }
}
```
