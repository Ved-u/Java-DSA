# 295. Find Median from Data Stream

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/find-median-from-data-stream/
**Tags:** Two Pointers, Design, Sorting, Heap (Priority Queue), Data Stream

## Approach 1 — 2024-12-06 11:13 (java)

*Runtime: 100 ms (faster than 99.2%) · Memory: 63.9 MB*

```java
class MedianFinder {
    PriorityQueue<Integer> lpq=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> rpq=new PriorityQueue<>();
    public void addNum(int num) {
        if(lpq.isEmpty()||num<=lpq.peek())lpq.add(num);
        else rpq.add(num);
        if(lpq.size()>rpq.size()+1)rpq.add(lpq.remove());
        else if(rpq.size()>lpq.size())lpq.add(rpq.remove());
    }
    public double findMedian() {
        if(lpq.size()-rpq.size()==0)return((double)lpq.peek()+rpq.peek())/2;
    return lpq.peek();
    }
}
```

## Approach 2 — 2024-12-06 11:15 (java)

*Runtime: 96 ms (faster than 99.7%) · Memory: 63.4 MB*

```java
class MedianFinder {
    PriorityQueue<Integer> lpq=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> rpq=new PriorityQueue<>();
    public void addNum(int num) {
        if(lpq.isEmpty()||num<=lpq.peek())lpq.add(num);
        else rpq.add(num);
        if(lpq.size()-rpq.size()==2)rpq.add(lpq.remove());
        else if(rpq.size()>lpq.size())lpq.add(rpq.remove());
    }
    public double findMedian() {
        if(lpq.size()-rpq.size()==0)return((double)lpq.peek()+rpq.peek())/2;
    return lpq.peek();
    }
}
```
