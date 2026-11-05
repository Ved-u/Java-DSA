# 204. Count Primes

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-primes/
**Tags:** Array, Math, Enumeration, Number Theory, Primality Test, Sieve Theory, Prime Number Sieve

## Approach 1 — 2024-12-16 20:58 (java)

*Runtime: 128 ms (faster than 68.7%) · Memory: 49.5 MB*

```java
class Solution {
    public int countPrimes(int n) {
       int ans=0;
       boolean isPrime[]=new boolean[n];
       for(int i=0;i<n;i++)isPrime[i]=true;
       for(int i=2;i<n;i++){
            if(isPrime[i]){
                ans++;
                for(int j=i*2;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
       }
    return ans; 
    }
}
```
