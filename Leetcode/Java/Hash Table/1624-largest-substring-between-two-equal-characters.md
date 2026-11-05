# 1624. Largest Substring Between Two Equal Characters

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/largest-substring-between-two-equal-characters/
**Tags:** Hash Table, String

## Approach 1 — 2024-06-26 21:53 (java)

*Runtime: 8 ms (faster than 5.3%) · Memory: 44.3 MB*

```java
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    ans=Math.max( ans,(s.substring(i,j+1)).length()-2);
                }    
            }
        }
        return ans;
    }
}
```
