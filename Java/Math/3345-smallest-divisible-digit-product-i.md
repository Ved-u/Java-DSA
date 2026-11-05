# 3345. Smallest Divisible Digit Product I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/smallest-divisible-digit-product-i/
**Tags:** Math, Enumeration

## Approach 1 — 2026-08-06 08:57 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 42.7 MB*

```java
class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=Integer.MAX_VALUE;i++){
            if(prod(i)%t==0)return i;
        }
        return -1;
    }
    int prod(int n){
        int prod = 1;
        while(n>0){
            prod*=n%10;
            n/=10;
        }
        return prod;
    }
}
```

## Approach 2 — 2026-08-06 08:59 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 42.8 MB*

```java
class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            if(prod(i)%t==0)return i;
        }
        return -1;
    }
    int prod(int n){
        int prod = 1;
        while(n>0){
            prod*=n%10;
            n/=10;
        }
        return prod;
    }
}
```
