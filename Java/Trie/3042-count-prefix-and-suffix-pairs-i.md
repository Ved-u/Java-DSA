# 3042. Count Prefix and Suffix Pairs I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/
**Tags:** Array, String, Trie, Rolling Hash, String Matching, Hash Function

## Approach 1 — 2025-01-08 06:38 (java)

*Runtime: 2 ms (faster than 100.0%) · Memory: 42.3 MB*

```java
class Solution {
    boolean prefSuff(String str,String str2){
        return str2.startsWith(str) && str2.endsWith(str);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(prefSuff(words[i],words[j]))ans++;
            }
        }
    return ans;
    }
}
```
