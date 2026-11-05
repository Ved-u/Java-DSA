# 24. Swap Nodes in Pairs

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/swap-nodes-in-pairs/
**Tags:** Linked List, Recursion

## Approach 1 — 2026-04-10 18:22 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43 MB*

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        for(ListNode i=head;i!=null;i=i.next)
            list.add(i.val);
        for(int i=1;i<list.size();i+=2){
            int temp=list.get(i-1);
            list.set(i-1,list.get(i));
            list.set(i,temp);
        }
        int idx=0;
        for(ListNode i=head;i!=null;i=i.next)
            i.val=list.get(idx++);
    return head;
    }
}
```

## Approach 2 — 2026-04-24 11:00 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.7 MB*

```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode ans=head.next;
        ListNode prev=new ListNode(0);
        ListNode curr=head,next=null;
        while(curr!=null&&curr.next!=null){
            next=curr.next.next;
            prev.next=curr.next;
            curr.next.next=curr;
            curr.next=next;
            prev=curr;
            curr=curr.next;
        }
    return ans;
    }
}
```
