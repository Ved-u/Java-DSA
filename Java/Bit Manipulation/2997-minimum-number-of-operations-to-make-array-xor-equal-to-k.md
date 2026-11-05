# 2997. Minimum Number of Operations to Make Array XOR Equal to K

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/
**Tags:** Array, Bit Manipulation

## Approach 1 — 2024-05-14 19:29 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 58.2 MB*

```java
class Solution {
    public int minOperations(int[] nums, int k) {
        int xorAll = 0;
        for (int num : nums)
            xorAll ^= num;
        if (xorAll == k) return 0;
        int xorWithK = xorAll ^ k;
        int count = 0;
        while (xorWithK > 0) {
            count += xorWithK & 1; 
            xorWithK >>= 1;
        }
    return count;
    }
}
```
