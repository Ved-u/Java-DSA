# 2103. Rings and Rods

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/rings-and-rods/
**Tags:** Hash Table, String

## Approach 1 — 2024-04-16 08:56 (java)

*Runtime: 6 ms (faster than 4.4%) · Memory: 41.5 MB*

```java
class Solution {
    public int countPoints(String rings) {
        int ans=0;
        String rods[]=new String[10];
        int rod=-1;
        char color='a';
        for(int i=0;i<rings.length();i+=2){
            rod = rings.charAt(i + 1) - '0';
            color=rings.charAt(i);
            rods[rod]+=color;
        }
        for(int i=0;i<rods.length;i++){
             if (rods[i] != null && rods[i].contains("R") && rods[i].contains("G") && rods[i].contains("B")) {
                ans++;
            }
        }
    return ans;    
    }
}
```
