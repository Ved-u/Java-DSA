# 3731. Find Missing Elements

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-missing-elements/
**Tags:** Array, Hash Table, Sorting

## Approach 1 — 2025-11-11 22:01 (java)

*Runtime: 4 ms (faster than 56.3%) · Memory: 46.9 MB*

```java
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int x:nums){
            set.add(x);
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!set.contains(i))ans.add(i);
        }
        return ans;
    }
}
```
