# 3498. Reverse Degree of a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-degree-of-a-string/
**Tags:** String, Simulation

## Approach 1 — 2026-09-20 13:03 (java)

*Runtime: 1 ms · Memory: 44.1 MB*

```java
class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            ans+=(i+1)*('z'-x+1);
        }
        return ans;
    }
}
```
