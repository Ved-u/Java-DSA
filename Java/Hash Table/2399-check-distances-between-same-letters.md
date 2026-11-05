# 2399. Check Distances Between Same Letters

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-distances-between-same-letters/
**Tags:** Array, Hash Table, String

## Approach 1 — 2024-06-20 15:55 (java)

*Runtime: 2 ms (faster than 32.9%) · Memory: 42.5 MB*

```java
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(distance[s.charAt(i)-'a']!=Math.abs(j-i-1))return false;
                    break;
                }
            }
        }
    return true;    
    }
}
```
