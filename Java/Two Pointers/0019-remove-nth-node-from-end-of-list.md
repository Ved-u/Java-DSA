# 19. Remove Nth Node From End of List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/remove-nth-node-from-end-of-list/
**Tags:** Linked List, Two Pointers

## Approach 1 — 2024-07-20 11:05 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.8 MB*

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count == n) {
            return head.next;
        }
        ListNode t = head;
        for (int i = 1; i < count - n; i++) {
            t = t.next;
        }
        t.next = t.next.next;
        return head;
    }
}
```

## Approach 2 — 2024-07-22 07:52 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.7 MB*

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode fast=head;
        ListNode slow=head;
        ListNode temp=slow;
        for(int i=1;i<=n;i++)
            fast=fast.next;
        while(fast!=null){
            fast=fast.next;
            temp=slow;
            slow=slow.next;
        } 
        if(slow==head)return head.next;
        temp.next=temp.next.next;   
    return head;
    }
}
```

## Approach 3 — 2024-07-22 08:11 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.6 MB*

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode fast=head;
        ListNode slow=head;
        for(int i=1;i<=n;i++)
            fast=fast.next;
        if(fast==null)return head.next;    
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;   
    return head;
    }
}
```

## Approach 4 — 2026-06-07 22:25 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.6 MB*

```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        for(int i=1;i<=n;i++)
            fast=fast.next;
        if(fast==null)return head.next;    
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;   
        return head;
    }
}
```
