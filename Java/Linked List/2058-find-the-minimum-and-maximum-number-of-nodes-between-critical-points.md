# 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
**Tags:** Linked List

## Approach 1 — 2026-05-18 17:16 (java)

*Runtime: 21 ms (faster than 5.2%) · Memory: 118.8 MB*

```java
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list = new ArrayList<>();
        List<Integer> cp = new ArrayList<>();
        int[] ans = {-1,-1};
        for(ListNode tmp = head; tmp != null; tmp = tmp.next){
            list.add(tmp.val);
        }
        if(list.size()==2)return ans;
        for(int i=1;i<list.size()-1;i++){
            if((list.get(i)<list.get(i+1)&&list.get(i)<list.get(i-1))||
               (list.get(i)>list.get(i+1)&&list.get(i)>list.get(i-1))){
                cp.add(i);
            }
        }
        if(cp.size()<2)return ans;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < cp.size(); i++) {
            min = Math.min(min, cp.get(i) - cp.get(i - 1));
        }
        int max = cp.get(cp.size() - 1) - cp.get(0);
        ans[0]=min;ans[1]=max;
        return ans;
    }
}
```
