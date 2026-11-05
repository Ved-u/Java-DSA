# 3146. Permutation Difference between Two Strings

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/permutation-difference-between-two-strings/
**Tags:** Hash Table, String

## Approach 1 — 2024-06-11 22:20 (java)

*Runtime: 2 ms (faster than 58.8%) · Memory: 42.3 MB*

```java
class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    ans+=(Math.abs(i-j));
                }
            }
        }
    return ans;    
    }
}
```
