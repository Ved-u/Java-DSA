# 4048. Count Values With Equally Spaced Occurrences I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-i/
**Tags:** Array, Hash Table

## Approach 1 — 2026-09-13 11:56 (java)

*Runtime: 8 ms · Memory: 46.6 MB*

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))map.get(nums[i]).add(i);
            else map.put(nums[i], new ArrayList<Integer>(Arrays.asList(i)));
        }
        int ans=0;
        for(Integer x:map.keySet()){
            List<Integer> l = map.get(x);
            if(l.size()!=3)continue;
            if(l.get(1)-l.get(0)==l.get(2)-l.get(1))ans++;
        }
        return ans;
    }
}
```
