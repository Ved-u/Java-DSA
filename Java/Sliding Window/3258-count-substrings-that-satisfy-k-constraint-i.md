# 3258. Count Substrings That Satisfy K-Constraint I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/
**Tags:** String, Sliding Window

## Approach 1 — 2024-08-18 08:58 (java)

*Runtime: 25 ms (faster than 7.6%) · Memory: 45.8 MB*

```java
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if(k(s.substring(i, j),k))ans++;
            }
        }
    return ans;
    }
    public boolean k(String s,int k){
        int zero=0,one=0;
        for(char x:s.toCharArray()){
            if(x=='0')zero++;
            else one++;
        }
    return zero<=k||one<=k;
    }
}
```
