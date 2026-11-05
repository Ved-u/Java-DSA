# 2433. Find The Original Array of Prefix Xor

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
**Tags:** Array, Bit Manipulation

## Approach 1 — 2024-07-09 20:28 (java)

*Runtime: 2 ms (faster than 95.9%) · Memory: 56.5 MB*

```java
class Solution {
    public int[] findArray(int[] pref) {
        int[] ans=new int[pref.length];
        ans[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            ans[i]=pref[i-1]^pref[i];
        }
    return ans;     
    }
}
```
