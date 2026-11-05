# 1475. Final Prices With a Special Discount in a Shop

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
**Tags:** Array, Stack, Monotonic Stack

## Approach 1 — 2024-08-10 17:50 (java)

*Runtime: 2 ms (faster than 68.8%) · Memory: 43.4 MB*

```java
class Solution {
    public int[] finalPrices(int[] prices) {
       int discount=0;
       for(int i=0;i<prices.length;i++){
            discount=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    discount=prices[j];
                    break;}
            }
            prices[i]-=discount;
       }
    return prices;
    }
}
```

## Approach 2 — 2024-08-10 17:51 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 43.4 MB*

```java
class Solution {
    public int[] finalPrices(int[] prices) {
       for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    prices[i]-=prices[j];
                    break;
                }
            }
       }
    return prices;
    }
}
```
