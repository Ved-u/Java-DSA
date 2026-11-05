# 2961. Double Modular Exponentiation

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/double-modular-exponentiation/
**Tags:** Array, Math, Simulation

## Approach 1 — 2026-10-23 18:55 (java)

*Runtime: 1 ms · Memory: 44.9 MB*

```java
import java.util.*;

class Solution {
    public List<Integer> getGoodIndices(int[][] v, int t) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if (modularExponentiation(v[i][0], v[i][1], 10, v[i][2], v[i][3]) == t) {
                ans.add(i);
            }
        }
        return ans;
    }

    private int modularExponentiation(int a, int b, int mod1, int c, int mod2) {
        long res1 = 1;
        a = a % mod1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res1 = (res1 * a) % mod1;
            }
            b = b >> 1;
            a = (a * a) % mod1;
        }

        long res2 = 1;
        res1 = res1 % mod2;
        while (c > 0) {
            if ((c & 1) == 1) {
                res2 = (res2 * res1) % mod2;
            }
            c = c >> 1;
            res1 = (res1 * res1) % mod2;
        }

        return (int) res2;
    }
}
```

## Approach 2 — 2024-08-15 21:09 (java)

*Runtime: 2 ms (faster than 48.1%) · Memory: 45 MB*

```java
class Solution {
    public List<Integer> getGoodIndices(int[][] v, int t) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < v.length; i++) 
    if(modularExponentiation(v[i][0], v[i][1], 10, v[i][2], v[i][3]) == t)
                ans.add(i);
    return ans;
    }
    private int modularExponentiation(int a, int b, int mod1, int c, int mod2){
        long res1 = 1;
        a = a % mod1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res1 = (res1 * a) % mod1;
            }
            b = b >> 1;
            a = (a * a) % mod1;
        }
        long res2 = 1;
        res1 = res1 % mod2;
        while (c > 0) {
            if ((c & 1) == 1) {
                res2 = (res2 * res1) % mod2;
            }
            c = c >> 1;
            res1 = (res1 * res1) % mod2;
        }
    return (int) res2;
    }
}
```
