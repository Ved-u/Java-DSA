# 3803. Count Residue Prefixes

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-residue-prefixes/
**Tags:** Hash Table, String

## Approach 1 — 2026-01-19 08:21 (java)

*Runtime: 4 ms (faster than 12.4%) · Memory: 46.3 MB*

```java
class Solution {
    public int residuePrefixes(String s) {
        int ans=0;
        int l=0,r=0;
        while(r<s.length()){
            if(prefix(l,r,s)){
                ans++;
            }
            r++;
        }
        return ans;
    }
    boolean prefix(int l,int r,String s){
        int freq[]=new int[26];
        int dist=0;
        for(int i=l;i<=r;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int x:freq){
            if(x>0)dist++;
        }
        if(dist==((r-l)+1)%3) return true;
        return false;
    }
}
```
