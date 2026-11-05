# 338. Counting Bits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/counting-bits/
**Tags:** Dynamic Programming, Bit Manipulation

## Approach 1 — 2026-04-13 19:01 (java)

*Runtime: 11 ms (faster than 5.9%) · Memory: 48.8 MB*

```java
class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<ans.length;i++){
            String x=Integer.toBinaryString(i);
            int one=0;
            for(int j=0;j<x.length();j++){
                if(x.charAt(j)=='1')one++;
            }
            ans[i]=one;
        }
    return ans;
    }
}
```
