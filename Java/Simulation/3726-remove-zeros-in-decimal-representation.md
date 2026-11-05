# 3726. Remove Zeros in Decimal Representation

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/remove-zeros-in-decimal-representation/
**Tags:** Math, Simulation

## Approach 1 — 2025-11-12 21:45 (java)

*Runtime: 3 ms (faster than 39.7%) · Memory: 43.1 MB*

```java
class Solution {
    public long removeZeros(long n) {
        String y = ""+n;
        StringBuilder ans=new StringBuilder();
        for(char x:y.toCharArray()){
            if(x-'0' != 0)ans.append(""+x);
        }
        return Long.parseLong(ans.toString());
    }
}
```
