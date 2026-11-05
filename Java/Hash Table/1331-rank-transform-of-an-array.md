# 1331. Rank Transform of an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/rank-transform-of-an-array/
**Tags:** Array, Hash Table, Sorting

## Approach 1 — 2026-07-12 20:10 (java)

*Runtime: 32 ms (faster than 52.4%) · Memory: 77 MB*

```java
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[] = arr.clone();
        HashMap<Integer,Integer> map = new HashMap<>();//no,rank
        Arrays.sort(copy);
        int rank=1;
        for(int i=0;i<copy.length;i++){
            if(!map.containsKey(copy[i]))
                map.put(copy[i],rank++);
        }       
        for(int i=0;i<copy.length;i++){
            copy[i]=map.get(arr[i]);
        }
        return copy;
    }
}
```
