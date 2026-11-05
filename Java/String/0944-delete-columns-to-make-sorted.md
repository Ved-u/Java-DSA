# 944. Delete Columns to Make Sorted

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/delete-columns-to-make-sorted/
**Tags:** Array, String, Longest Increasing Subsequence

## Approach 1 — 2024-06-06 08:36 (java)

*Runtime: 9 ms (faster than 17.9%) · Memory: 44.6 MB*

```java
class Solution {
    public int minDeletionSize(String[] strs) {
       int ans=0;
       for(int j=0;j<strs[0].length();j++){
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].charAt(j)>strs[i+1].charAt(j)){
                    ans++;
                    break;
                }    
            }
       }
    return ans;    
    }
}
```

## Approach 2 — 2024-06-06 08:39 (java)

*Runtime: 8 ms (faster than 78.7%) · Memory: 43.7 MB*

```java
class Solution {
    public int minDeletionSize(String[] strs) {
       int ans=0;
    out :for(int j=0;j<strs[0].length();j++){
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].charAt(j)>strs[i+1].charAt(j)){
                    ans++;
                    continue out;
                }    
            }
       }
    return ans;    
    }
}
```
