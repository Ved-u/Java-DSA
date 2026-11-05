# 217. Contains Duplicate

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/contains-duplicate/
**Tags:** Array, Hash Table, Sorting

## Approach 1 — 2025-12-10 08:35 (java)

*Runtime: 14 ms (faster than 91.7%) · Memory: 93.2 MB*

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            if(set.contains(x))return true;
            set.add(x);
        }
        return false;
    }
}
```
