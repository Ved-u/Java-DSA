# 3950. Exactly One Consecutive Set Bits Pair

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/exactly-one-consecutive-set-bits-pair/
**Tags:** Bit Manipulation

## Approach 1 — 2026-06-10 22:36 (java)

*Runtime: 1 ms (faster than 99.3%) · Memory: 42.8 MB*

```java
class Solution {
    public boolean consecutiveSetBits(int n) {
        String x=Integer.toBinaryString(n);
        boolean flag=false;
        for(int i=1;i<x.length();i++){
            if(x.charAt(i)=='1'&&x.charAt(i-1)=='1'){
                if(flag)return false;
                else flag=true;
            }
        }
        return flag;
    }
}
```
