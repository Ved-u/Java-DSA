# 190. Reverse Bits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-bits/
**Tags:** Divide and Conquer, Bit Manipulation

## Approach 1 — 2026-03-21 19:03 (java)

*Runtime: 5 ms (faster than 5.4%) · Memory: 42.9 MB*

```java
class Solution {
    public int reverseBits(int n) {
        String s=Integer.toBinaryString(n);
        // pad with leading zeros to make 32 bits
        while (s.length() < 32) {
            s = "0" + s;
        }
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        return Integer.parseInt(s,2);
    }
}
```
