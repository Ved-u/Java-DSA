# 2413. Smallest Even Multiple

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/smallest-even-multiple/
**Tags:** Math, Number Theory

## Approach 1 — 2024-07-31 21:24 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.2 MB*

```java
class Solution {
    public int smallestEvenMultiple(int n) {
       int ans=0;
       for(int i=2;i<=2*n;i++){
            if(i%n==0&&i%2==0)return i;
       }
    return ans;    
    }
}
```
