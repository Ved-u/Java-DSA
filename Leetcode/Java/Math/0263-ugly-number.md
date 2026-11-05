# 263. Ugly Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/ugly-number/
**Tags:** Math

## Approach 1 — 2024-09-16 11:21 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.5 MB*

```java
class Solution {
    public boolean isUgly(int n) {
       if(n<=0)return false;
       while(n%2==0)n/=2;
       while(n%3==0)n/=3;
       while(n%5==0)n/=5;
    return n==1;
    }
}
```
