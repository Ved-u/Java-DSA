# 3622. Check Divisibility by Digit Sum and Product

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/
**Tags:** Math

## Approach 1 — 2026-08-22 11:46 (java)

*Runtime: 1 ms · Memory: 42.2 MB*

```java
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,prod=1,temp=n;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        if(temp%(sum+prod)==0)return true;
        return false;
    }
}
```
