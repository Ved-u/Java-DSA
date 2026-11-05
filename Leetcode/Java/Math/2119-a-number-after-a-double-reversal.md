# 2119. A Number After a Double Reversal

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/a-number-after-a-double-reversal/
**Tags:** Math

## Approach 1 — 2024-08-09 21:48 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.1 MB*

```java
class Solution {
    public boolean isSameAfterReversals(int n) {
        int copy=reverse(n);
        copy=reverse(copy);
    return copy==n;    
    }
    public int reverse(int n){
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n/=10;
        }
    return ans;    
    }
}
```
