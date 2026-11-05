# 3718. Smallest Missing Multiple of K

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/smallest-missing-multiple-of-k/
**Tags:** Array, Hash Table

## Approach 1 — 2025-11-13 22:37 (java)

*Runtime: 2 ms (faster than 71.6%) · Memory: 45.4 MB*

```java
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int i=1;
        while(set.contains(k*i)){
            i++;
        }
        return i*k;
    }
}
```
