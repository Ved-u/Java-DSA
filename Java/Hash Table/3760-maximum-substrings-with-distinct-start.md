# 3760. Maximum Substrings With Distinct Start

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-substrings-with-distinct-start/
**Tags:** Hash Table, String

## Approach 1 — 2025-12-04 07:39 (java)

*Runtime: 6 ms (faster than 90.7%) · Memory: 47.8 MB*

```java
class Solution {
    public int maxDistinct(String s) {
        boolean arr[]=new boolean[26];
        for(char x:s.toCharArray()){
            arr[x-'a']=true;
        }
        int ans=0;
        for(boolean x:arr){
            if(x)ans++;
        }
        return ans;
    }
}
```
