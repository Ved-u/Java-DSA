# 2441. Largest Positive Integer That Exists With Its Negative

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
**Tags:** Array, Hash Table, Two Pointers, Sorting

## Approach 1 — 2024-05-05 17:39 (java)

*Runtime: 57 ms (faster than 5.4%) · Memory: 44.8 MB*

```java
class Solution {
    public int findMaxK(int[] nums) {
      int ans=-1;
      ArrayList<Integer> al = new ArrayList<>();
        for (int num : nums) {
            al.add(num);
        }
      for(int i=0;i<al.size();i++){
        if(al.get(i)>0&&al.contains(-al.get(i))&&al.get(i)>ans)ans=al.get(i);
      }
    return ans;    
    }
}
```
