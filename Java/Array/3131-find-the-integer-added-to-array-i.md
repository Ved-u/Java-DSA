# 3131. Find the Integer Added to Array I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-integer-added-to-array-i/
**Tags:** Array

## Approach 1 — 2024-10-12 22:11 (java)

*Runtime: 2 ms (faster than 56.3%) · Memory: 43.3 MB*

```java
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
       Arrays.sort(nums1); 
       Arrays.sort(nums2);
    return nums2[0]-nums1[0]; 
    }
}
```
