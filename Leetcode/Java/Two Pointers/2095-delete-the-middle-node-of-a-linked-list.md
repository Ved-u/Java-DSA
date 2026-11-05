# 2095. Delete the Middle Node of a Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
**Tags:** Linked List, Two Pointers

## Approach 1 — 2024-07-24 08:01 (java)

*Runtime: 3 ms (faster than 99.9%) · Memory: 65.6 MB*

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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(slow.next==null)return null;
        if(slow.next.next==null){slow.next=null;
        return head;}
        while(fast.next.next!=null&&fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
    return head;    
    }
}
```

## Approach 2 — 2024-07-24 08:09 (java)

*Runtime: 2 ms (faster than 100.0%) · Memory: 64.4 MB*

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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)return null;
        ListNode h=head;
        ListNode t=head;
        h=h.next.next;
        while(h!=null && h.next!=null){
            h=h.next.next;
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
}
```
