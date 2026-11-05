# 1784. Check if Binary String Has at Most One Segment of Ones

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
**Tags:** String

## Approach 1 — 2026-04-06 10:45 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.9 MB*

```java
class Solution {
    public boolean checkOnesSegment(String s) {
       int r=0;
       boolean one=false;
       while(r<s.length()){
            if(s.charAt(r)=='1'){
                if(one)return false;
                one=true;
                while(r<s.length()&&s.charAt(r)=='1')r++;
            }
            r++;
       }
       return true;
    }
}
```
