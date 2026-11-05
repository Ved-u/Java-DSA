# 3411. Maximum Subarray With Equal Products

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-subarray-with-equal-products/
**Tags:** Array, Math, Sliding Window, Enumeration, Number Theory

## Approach 1 — 2025-01-05 08:08 (java)

*Runtime: 3 ms (faster than 82.7%) · Memory: 42.9 MB*

```java
class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;

        // Iterate over all subarrays
        for (int i = 0; i < n; i++) {
            int prod = 1; // Product of subarray
            int subGcd = 0; // GCD of subarray
            int subLcm = 1; // LCM of subarray

            for (int j = i; j < n; j++) {
                prod *= nums[j]; // Update product
                subGcd = gcd(subGcd, nums[j]); // Update GCD
                subLcm = lcm(subLcm, nums[j]); // Update LCM

                // Check if the subarray satisfies the condition
                if (prod == subGcd * subLcm) {
                    maxLength = Math.max(maxLength, j - i + 1); // Update max length
                }
            }
        }

        return maxLength;
    }
}
```

## Approach 2 — 2025-01-05 08:10 (java)

*Runtime: 3 ms (faster than 82.7%) · Memory: 42.4 MB*

```java
class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int prod = 1; 
            int subGcd = 0; 
            int subLcm = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j]; 
                subGcd = gcd(subGcd, nums[j]); 
                subLcm = lcm(subLcm, nums[j]); 
                if (prod == subGcd * subLcm) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
    return maxLength;
    }
}
```
