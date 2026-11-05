# 2427. Number of Common Factors

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-common-factors/
**Tags:** Math, Enumeration, Number Theory, Euclidean Algorithm, Greatest Common Divisor

## Approach 1 — 2024-02-29 23:52 (java)

*Runtime: 1 ms (faster than 75.4%) · Memory: 40.2 MB*

```java
class Solution {
    public int commonFactors(int a, int b) {
        int ans=0;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0)ans++;
        }
        return ans;
    }
}
```

## Approach 2 — 2024-02-29 23:53 (java)

*Runtime: 1 ms (faster than 75.4%) · Memory: 39.9 MB*

```java
class Solution {
    public int commonFactors(int a, int b) {
        int ans=0;
        int min=Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0&&b%i==0)ans++;
        }
        return ans;
    }
}
```
