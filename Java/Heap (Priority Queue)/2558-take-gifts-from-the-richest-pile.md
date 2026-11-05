# 2558. Take Gifts From the Richest Pile

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/take-gifts-from-the-richest-pile/
**Tags:** Array, Heap (Priority Queue), Simulation

## Approach 1 — 2024-12-12 17:31 (java)

*Runtime: 8 ms (faster than 38.0%) · Memory: 42.3 MB*

```java
class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:gifts){
            pq.add(x);
        }
        while(k>0){
            pq.add((int)Math.sqrt(pq.remove()));
            k--;
        }
        while(!pq.isEmpty()){
            ans+=pq.remove();
        }
    return ans;
    }
}
```
