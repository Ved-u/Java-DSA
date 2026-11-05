# 876. Middle of the Linked List

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/middle-of-the-linked-list/
**Tags:** Linked List, Two Pointers

## Approach 1 — 2024-07-23 08:02 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.8 MB*

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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    return slow;    
    }
}
```
