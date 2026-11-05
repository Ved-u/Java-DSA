# 50. Pow(x, n)

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/powx-n/
**Tags:** Math, Recursion

## Approach 1 — 2024-10-10 15:37 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.1 MB*

```java
class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}
```

## Approach 2 — 2024-12-16 22:20 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.9 MB*

```java
class Solution {
    public double myPow(double x, int n) {
        long binForm=n;double ans=1;
        if(n<0){
            binForm=-binForm;
            x=1/x;
        }
        while(binForm>0){
            if(binForm%2==1)ans*=x;
            x*=x;
            binForm/=2;
        }
    return ans;
    }
}
```
