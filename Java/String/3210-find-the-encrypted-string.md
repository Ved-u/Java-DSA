# 3210. Find the Encrypted String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-encrypted-string/
**Tags:** String

## Approach 1 — 2024-07-07 08:21 (java)

*Runtime: 2 ms (faster than 40.0%) · Memory: 43.1 MB*

```java
class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i+k<s.length()){
                sb.append(""+s.charAt(i+k));
            }else sb.append(""+s.charAt((i+k)%s.length()));
        }
    return sb.toString();    
    }
}
```
