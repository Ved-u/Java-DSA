# 1952. Three Divisors

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/three-divisors/
**Tags:** Math, Enumeration, Number Theory, Prime Factorization, Sieve Theory

## Approach 1 — 2024-08-17 19:00 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.9 MB*

```java
class Solution {
    public boolean isThree(int n) {
        int div=2;
        for(int i=2;i<n;i++){
            if(n%i==0)div++;
            if(div>3)return false;
        }
    return div==3;
    }
}
```
