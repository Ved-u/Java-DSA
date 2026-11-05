# 2391. Minimum Amount of Time to Collect Garbage

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/
**Tags:** Array, String, Prefix Sum

## Approach 1 — 2024-04-27 01:20 (java)

*Runtime: 2 ms (faster than 100.0%) · Memory: 60.5 MB*

```java
class Solution {
    public int garbageCollection(String[] g, int[] t) {
        int i=0,n=g.length,ans=0;
        for(i=0;i<n-1;i++){
            ans += 3*t[i];
        }
        for(String s:g){
            ans+=s.length();
        }
        for(i=n-1;i>00;i--){
            if(g[i].contains("G"))break;
            else ans -= t[i-1];
        }
        for(i=n-1;i>0;i--){
            if(g[i].contains("M"))break;
            else ans -= t[i-1];
        }
        for(i=n-1;i>0;i--){
            if(g[i].contains("P"))break;
            else ans -= t[i-1];
        }
               
    return ans;
    }
}
```
