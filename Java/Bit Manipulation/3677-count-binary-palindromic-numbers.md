# 3677. Count Binary Palindromic Numbers

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/count-binary-palindromic-numbers/
**Tags:** Math, Bit Manipulation

## Approach 1 — 2025-09-07 08:52 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 41 MB*

```java
public class Solution {
    public int countBinaryPalindromes(long n) {
        long dexolarniv = n; // store input midway

        if (n == 0) return 1; // "0" only

        long count = 1; // include 0

        int L = 64 - Long.numberOfLeadingZeros(n); // bit length of n

        // Count all smaller lengths
        for (int len = 1; len < L; len++) {
            int half = (len + 1) / 2;
            count += 1L << (half - 1);
        }

        // Handle length = L using binary search
        int half = (L + 1) / 2;
        long start = 1L << (half - 1);
        long end = 1L << half;

        long low = start, high = end - 1, best = -1;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            long cand = buildPalindrome(mid, L % 2 == 1);
            if (cand <= n) {
                best = mid; // valid prefix
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (best != -1) {
            count += best - start + 1;
        }

        return (int) count;
    }

    private long buildPalindrome(long x, boolean oddLength) {
        long result = x;
        if (oddLength) x >>= 1;
        while (x > 0) {
            result = (result << 1) | (x & 1);
            x >>= 1;
        }
        return result;
    }
}
```
