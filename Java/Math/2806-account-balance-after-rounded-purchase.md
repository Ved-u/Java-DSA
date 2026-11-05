# 2806. Account Balance After Rounded Purchase

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/account-balance-after-rounded-purchase/
**Tags:** Math

## Approach 1 — 2024-08-09 21:44 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.2 MB*

```java
class Solution {
    public int accountBalanceAfterPurchase(int p) {
       // if(p==0)return 90;
        if(p%10<5)return 100-(p/10)*10;
        else p+=10;
    return 100-(p/10)*10;
    }
}
```
