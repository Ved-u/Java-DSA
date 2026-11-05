# 3043. Find the Length of the Longest Common Prefix

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/
**Tags:** Array, Hash Table, String, Trie

## Approach 1 — 2026-05-21 08:37 (java)

*Runtime: 291 ms (faster than 5.1%) · Memory: 96.4 MB*

```java
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        int max=0;
        for(int x:arr1){
            String str=""+x;
            String ans="";
            int n=str.length();
            for(int i=0;i<n;i++){
                ans+=str.charAt(i);
                set.add(ans);
            }
        }
        for(int x:arr2){
            String str=""+x;
            String ans="";
            int n=str.length();
            for(int i=0;i<n;i++){
                ans+=str.charAt(i);
                if(set.contains(ans))max=Math.max(max,ans.length());
                else break;
            }    
        }
        return max;
    }
}
```
