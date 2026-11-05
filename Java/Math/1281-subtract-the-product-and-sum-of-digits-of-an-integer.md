# 1281. Subtract the Product and Sum of Digits of an Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
**Tags:** Math

## Approach 1 — 2024-01-25 11:34 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.6 MB*

```java
class Solution {
    public int subtractProductAndSum(int n) {
      int prod=1;
      int sum=0;

      while(n>0){
          int digit=n%10;
          sum=sum+digit;
          prod=prod*digit;
          n=n/10;
      }
      return prod-sum;
    }
}
```
