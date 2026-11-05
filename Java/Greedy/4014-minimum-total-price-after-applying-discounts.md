# 4014. Minimum Total Price After Applying Discounts

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-total-price-after-applying-discounts/
**Tags:** Array, Two Pointers, Greedy, Sorting

## Approach 1 — 2026-08-09 08:10 (java)

*Runtime: 62 ms (faster than 8.3%) · Memory: 141.8 MB*

```java
class Solution {
    public double minPrice(int[] price, int[] d) {
        double[] p = new double[price.length];
        for(int i=0;i<price.length;i++){
            p[i] = price[i];
        }
        Arrays.sort(p);
        Arrays.sort(d);
        double ans = 0;
        int idx=p.length-1;
        for(int i=d.length-1;i>=0;i--){
            p[idx] = discount(p[idx--],d[i]);
            if(idx<0)break;
        }
        for(int i=0;i<p.length;i++){
            ans+=p[i];
        }
        return ans;
    }
    double discount(double val, int dis){
        return val*(100-dis)/100;
    }
}
```
