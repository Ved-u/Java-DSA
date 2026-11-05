# 3507. Minimum Pair Removal to Sort Array I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/
**Tags:** Array, Hash Table, Linked List, Heap (Priority Queue), Simulation, Doubly-Linked List, Ordered Set

## Approach 1 — 2026-03-28 22:07 (java)

*Runtime: 3 ms (faster than 63.8%) · Memory: 44.8 MB*

```java
class Solution {
    public int minimumPairRemoval(int[] nums) {
        int ans=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int x: nums){
            arr.add(x);
        }
        while(!isSorted(arr)){
            int idx[]=new int[2];
            int min=Integer.MAX_VALUE;
            for(int i=1;i<arr.size();i++){
                if(arr.get(i)+arr.get(i-1)<min){
                    min=arr.get(i)+arr.get(i-1);
                    idx[0]=i-1;
                    idx[1]=i;
                }
            }
            arr.set(idx[1],arr.get(idx[0])+arr.get(idx[1]));
            arr.remove(idx[0]);
            ans++;
        }
        return ans;
    }
    boolean isSorted(List<Integer> arr){
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)>arr.get(i))return false;
        }
        return true;
    }
}
```
