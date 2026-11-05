# 3233. Find the Count of Numbers Which Are Not Special

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-count-of-numbers-which-are-not-special/
**Tags:** Array, Math, Number Theory

## Approach 1 — 2024-07-28 08:42 (java)

*Runtime: 129 ms (faster than 16.0%) · Memory: 44.7 MB*

```java
import java.util.*;

class Solution {
    public int nonSpecialCount(int l, int r) {
        // Compute all primes up to sqrt(10^9)
        int maxPrime = (int) Math.sqrt(1e9);
        boolean[] isPrime = new boolean[maxPrime + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= maxPrime; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxPrime; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collect all prime numbers up to maxPrime
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= maxPrime; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        // Count squares of primes within the range [l, r]
        int specialCount = 0;
        for (int prime : primes) {
            long square = (long) prime * prime;
            if (square >= l && square <= r) {
                specialCount++;
            }
        }

        // Total numbers in the range [l, r]
        int totalNumbers = r - l + 1;
        // Non-special numbers are total numbers minus special numbers
        return totalNumbers - specialCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.nonSpecialCount(5, 7));  // Expected output: 3
        System.out.println(sol.nonSpecialCount(4, 16)); // Expected output: 11
    }
}
```

## Approach 2 — 2024-07-28 08:43 (java)

*Runtime: 130 ms (faster than 16.0%) · Memory: 44.9 MB*

```java
class Solution {
    public int nonSpecialCount(int l, int r) {
        int maxPrime = (int) Math.sqrt(1e9);
        boolean[] isPrime = new boolean[maxPrime + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= maxPrime; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxPrime; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= maxPrime; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        int specialCount = 0;
        for (int prime : primes) {
            long square = (long) prime * prime;
            if (square >= l && square <= r) {
                specialCount++;
            }
        }
        int totalNumbers = r - l + 1;
        return totalNumbers - specialCount;
    }
}
```
