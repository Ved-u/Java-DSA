# 3783. Mirror Distance of an Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/mirror-distance-of-an-integer/
**Tags:** Math

## Approach 1 — 2025-12-26 09:34 (java)

*Runtime: 1 ms (faster than 99.8%) · Memory: 42.6 MB*

```java
class Solution {
    public int mirrorDistance(int n) {
        int temp=n,rev=0;
        while(n>0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        return Math.abs(temp-rev);
    }
}
```
