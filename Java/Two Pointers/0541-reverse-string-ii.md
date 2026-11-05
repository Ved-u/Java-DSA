# 541. Reverse String II

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-string-ii/
**Tags:** Two Pointers, String

## Approach 1 — 2026-09-06 14:14 (java)

*Runtime: 1 ms · Memory: 45.2 MB*

```java
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int l = 0,r=2*k-1;
        while(r<s.length()){
            StringBuilder sbt = new StringBuilder(s.substring(l,k+l));
            sbt.reverse();
            sb.append(sbt);
            sb.append(s.substring(k+l,r+1));
            l=r+1;
            r=l+2*k-1;
        }
        //another for remaining chars
        int remChar = s.length()-l;
        if(2*k>remChar&&remChar>=k){
            StringBuilder sbt = new StringBuilder(s.substring(l,k+l));
            sbt.reverse();
            sb.append(sbt);
            sb.append(s.substring(k+l));
        }
        else if(remChar<k){
            StringBuilder sbt = new StringBuilder(s.substring(l));
            sbt.reverse();
            sb.append(sbt);
        }
        return sb.toString();
    }
}
```
