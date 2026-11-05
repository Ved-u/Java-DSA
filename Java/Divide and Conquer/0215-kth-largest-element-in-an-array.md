# 215. Kth Largest Element in an Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/kth-largest-element-in-an-array/
**Tags:** Array, Divide and Conquer, Sorting, Heap (Priority Queue), Quickselect

## Approach 1 — 2025-01-01 11:12 (java)

*Runtime: 63 ms (faster than 63.7%) · Memory: 61.2 MB*

```java
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
            if(pq.size()>k)pq.remove();
        }
    return pq.peek();
    }
}
```
