# 3223. Minimum Length of String After Operations

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-length-of-string-after-operations/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2026-05-13 19:56 (java)

*Runtime: 10 ms (faster than 80.4%) · Memory: 48.6 MB*

```java
class Solution {
    public int minimumLength(String s) {
        int freq[]=new int[26];
        for(char x:s.toCharArray()){
            freq[x-'a']++;
        }
        int ans=0;
        for(int x:freq){
            if(x>=3){
                if(x%2==1)ans++;
                else ans+=2;
            }
            else ans+=x;
            // ans+=Math.min(x,2);
        }
        return ans;
    }
}
```
