# 3684. Maximize Sum of At Most K Distinct Elements

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximize-sum-of-at-most-k-distinct-elements/
**Tags:** Array, Hash Table, Greedy, Sorting

## Approach 1 — 2026-04-11 20:19 (java)

*Runtime: 9 ms (faster than 55.4%) · Memory: 47.4 MB*

```java
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set =new HashSet<>();
        for(int x:nums){
           set.add(x);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        int ans[]=new int[Math.min(list.size(),k)];
        int idx=list.size()-1;
        for(int i=0;i<k;i++){
            if(idx==-1)break;
            ans[i]=list.get(idx--);
        }
        return ans;
    }
}
```
