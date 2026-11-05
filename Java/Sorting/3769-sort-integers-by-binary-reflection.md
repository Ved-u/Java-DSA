# 3769. Sort Integers by Binary Reflection

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sort-integers-by-binary-reflection/
**Tags:** Array, Sorting

## Approach 1 — 2025-12-10 08:28 (java)

*Runtime: 51 ms (faster than 9.8%) · Memory: 45.8 MB*

```java
class Solution {
    public int[] sortByReflection(int[] nums) {
        // box int[] -> Integer[]
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (n1, n2) -> {
            int m1 = reflectedValue(n1);
            int m2 = reflectedValue(n2);

            if (m1 != m2) {
                return Integer.compare(m1, m2);
            }
            // tie-break by original value
            return Integer.compare(n1, n2);
        });

        // unbox back to int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = boxed[i];
        }

        return nums;
    }

    private int reflectedValue(int n) {
        String normal = Integer.toBinaryString(n);       // e.g. 13 -> "1101"
        String reversed = new StringBuilder(normal).reverse().toString(); // "1011"
        return Integer.parseInt(reversed, 2);            // 11
    }
}
```
