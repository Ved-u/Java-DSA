# 43. Multiply Strings

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/multiply-strings/
**Tags:** Math, String, Simulation

## Approach 1 — 2026-06-09 10:06 (java)

*Runtime: 10 ms (faster than 5.2%) · Memory: 44.6 MB*

```java
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.multiply(b).toString();
    }
}
```
