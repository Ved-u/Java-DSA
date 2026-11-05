# 219. Contains Duplicate II

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/contains-duplicate-ii/
**Tags:** Array, Hash Table, Sliding Window

## Approach 1 — 2026-07-01 19:06 (java)

*Runtime: 37 ms (faster than 9.1%) · Memory: 116.6 MB*

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                List<Integer> temp = map.get(nums[i]);
                for(int j = 0;j<temp.size();j++){
                   if(Math.abs(i-temp.get(j))<=k)return true;
                }
            }else{
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        return false;
    }
}
```
