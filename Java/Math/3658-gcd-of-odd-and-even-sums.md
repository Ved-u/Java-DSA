# 3658. GCD of Odd and Even Sums

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/gcd-of-odd-and-even-sums/
**Tags:** Math, Number Theory

## Approach 1 — 2026-04-05 21:34 (java)

*Runtime: 3 ms (faster than 21.8%) · Memory: 42.2 MB*

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumO=0,sumE=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0)sumE+=i;
            else sumO+=i;
        }
    return GCD(sumO,sumE);
    }
    int GCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
```

## Approach 2 — 2026-04-05 21:35 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.9 MB*

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}
```
