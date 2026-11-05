# 1304. Find N Unique Integers Sum up to Zero

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
**Tags:** Array, Math

## Approach 1 — 2024-02-09 18:09 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public int[] sumZero(int n) { 
      int ans[]=new int[n];
      if(n==1){
          ans[0]=0;
          return ans;
      };
      int counter=0;
     for(int i=-n/2;i<=n/2;i++){
         if(i==0 && n%2==0)  continue;
         ans[counter]=i;
         counter++;
     }
     return ans;
    }
}
```
