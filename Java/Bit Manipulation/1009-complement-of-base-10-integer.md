# 1009. Complement of Base 10 Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/complement-of-base-10-integer/
**Tags:** Bit Manipulation

## Approach 1 — 2024-08-22 10:24 (java)

*Runtime: 1 ms (faster than 17.9%) · Memory: 40.3 MB*

```java
import java.util.ArrayList;

class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        ArrayList<Integer> ar = new ArrayList<>();
        while (n > 0) {
            ar.add(n % 2 == 0 ? 1 : 0);
            n /= 2;
        }
        n = 0;
        int base = 1;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) == 1) {
                n += base;
            }
            base *= 2;
        }
    return n;
    }
}
```
