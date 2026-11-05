# 2951. Find the Peaks

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-peaks/
**Tags:** Array, Enumeration

## Approach 1 — 2024-08-10 17:54 (java)

*Runtime: 1 ms (faster than 99.4%) · Memory: 44.4 MB*

```java
class Solution {
    public List<Integer> findPeaks(int[] m) {
       List<Integer> ans=new ArrayList<>();
       for(int i=1;i<m.length-1;i++)
            if(m[i]>m[i-1]&&m[i]>m[i+1])ans.add(i);
    return ans;    
    }
}
```
