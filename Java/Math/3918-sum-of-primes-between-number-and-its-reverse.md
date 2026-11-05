# 3918. Sum of Primes Between Number and Its Reverse

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/sum-of-primes-between-number-and-its-reverse/
**Tags:** Math, Number Theory

## Approach 1 — 2026-05-03 21:03 (java)

*Runtime: 6 ms (faster than 43.7%) · Memory: 42.8 MB*

```java
class Solution {
    public int sumOfPrimesInRange(int n) {
        int sum=0;
        int r=Integer.parseInt(new StringBuilder(""+n).reverse().toString());
        int min=Math.min(n,r);
        int max=Math.max(n,r);
        for(int i=min;i<=max;i++){
            if(isPrime(i))sum+=i;
        }
        return sum;
    }
    boolean isPrime(int n){
        if(n==2)return true;
        if(n<2)return false;
        int sqrt=(int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
```
