# 2744. Find Maximum Number of String Pairs

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-maximum-number-of-string-pairs/
**Tags:** Array, Hash Table, String, Simulation

## Approach 1 — 2024-04-15 07:47 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42.1 MB*

```java
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
                for(int k=i+1;k<words.length;k++){
                    if(words[i].charAt(0)==words[k].charAt(1)&&words[i].charAt(1)==words[k].charAt(0)){
                        ans++;
                    }
                }
        }
    return ans;    
    }
}
```
