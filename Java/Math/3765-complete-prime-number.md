# 3765. Complete Prime Number

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/complete-prime-number/
**Tags:** Math, Enumeration, Number Theory

## Approach 1 — 2025-12-06 20:17 (java)

*Runtime: 5 ms (faster than 19.8%) · Memory: 43.3 MB*

```java
class Solution {
    public boolean completePrime(int num) {
        if(num==1||num==0)return false;
        String x=""+num;
        //prefix
        for(int i=1;i<=x.length();i++){
            if(prime(Integer.parseInt(x.substring(0,i)))==false)return false;
        }
        //suffix
        for(int i=0;i<x.length();i++){
            if(prime(Integer.parseInt(x.substring(i)))==false)return false;
        }
        return true;
    }
    boolean prime(int n){
        if(n==0||n==1)return false;
        for(int i=2;i<(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
```
