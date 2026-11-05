# 461. Hamming Distance

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/hamming-distance/
**Tags:** Bit Manipulation

## Approach 1 — 2026-04-30 13:34 (java)

*Runtime: 5 ms (faster than 1.5%) · Memory: 42.6 MB*

```java
class Solution {
    public int hammingDistance(int x, int y) {
        String xs = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String ys=String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');;
        int ans=0;
        for(int i=0;i<xs.length();i++){
            if(xs.charAt(i)!=ys.charAt(i))ans++;
        }
        return ans;
    }
}
```
