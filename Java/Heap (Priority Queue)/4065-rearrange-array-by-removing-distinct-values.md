# 4065. Rearrange Array by Removing Distinct Values

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/rearrange-array-by-removing-distinct-values/
**Tags:** Array, Hash Table, Sorting, Heap (Priority Queue), Simulation, Counting, Ordered Set

## Approach 1 — 2026-10-04 22:16 (java)

*Runtime: 7 ms · Memory: 47.4 MB*

```java
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int idx=0;
        List<Integer> list = new ArrayList<>();
        for(int x:nums){
            list.add(x);
        }
        while(list.isEmpty()==false){
            HashSet<Integer> set = new HashSet<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
             for (int i = list.size() - 1; i >= 0; i--) {
                int x = list.get(i);
                if(set.contains(x)){
                    continue;
                }else{
                    list.remove(i);
                    set.add(x);
                    pq.add(x);
                }
            }
            while(pq.isEmpty() == false){
                ans[idx++] = pq.poll();
            }
        }
        return ans;
    }
}
```

## Approach 2 — 2026-10-04 22:20 (java)

*Runtime: 1 ms · Memory: 46.5 MB*

```java
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int idx=0;
        int freq[] = new int[101];
        for(int x:nums){
            freq[x]++;
        }
        while(idx<nums.length){
            for(int i=0;i<freq.length;i++){
                if(freq[i]>0){
                    freq[i]--;
                    ans[idx++] = i;
                }
            }
        }
        return ans;
    }
}
```
