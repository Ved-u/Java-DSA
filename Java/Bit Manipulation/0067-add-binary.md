# 67. Add Binary

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/add-binary/
**Tags:** Math, String, Bit Manipulation, Simulation

## Approach 1 — 2024-09-23 13:33 (java)

*Runtime: 5 ms (faster than 9.5%) · Memory: 42.1 MB*

```java
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger n1=new BigInteger(a,2);
        BigInteger n2=new BigInteger(b,2);
        BigInteger ans=n1.add(n2);
    return ans.toString(2);
    }
}
```
