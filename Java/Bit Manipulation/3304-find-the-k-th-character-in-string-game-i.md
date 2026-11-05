# 3304. Find the K-th Character in String Game I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
**Tags:** Math, Bit Manipulation, Recursion, Simulation

## Approach 1 — 2024-09-29 13:00 (java)

*Runtime: 3 ms (faster than 66.1%) · Memory: 43 MB*

```java
class Solution {
    public char kthCharacter(int k) {
        StringBuilder w=new StringBuilder("a");
        while(w.length()<k){
            char t[]=w.toString().toCharArray();
            for(int i=0;i<w.length();i++){
                t[i]=(t[i]=='z')?'a':++t[i];
            }
           w.append(new String(t));
        }
    return w.charAt(k-1);
    }
}
```
