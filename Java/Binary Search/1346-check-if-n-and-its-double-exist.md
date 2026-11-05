# 1346. Check If N and Its Double Exist

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-n-and-its-double-exist/
**Tags:** Array, Hash Table, Two Pointers, Binary Search, Sorting

## Approach 1 — 2024-12-01 07:57 (java)

*Runtime: 2 ms (faster than 97.0%) · Memory: 43.6 MB*

```java
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(set.contains(2*x)||(x%2==0&&set.contains(x/2)))return true;
            set.add(x);
        }
    return false;
    }
}
```
