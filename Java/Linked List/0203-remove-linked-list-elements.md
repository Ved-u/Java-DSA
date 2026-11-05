# 203. Remove Linked List Elements

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/remove-linked-list-elements/
**Tags:** Linked List, Recursion

## Approach 1 — 2024-08-05 23:08 (java)

*Runtime: 1 ms (faster than 97.2%) · Memory: 45.3 MB*

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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        ListNode temp=new ListNode(100);
        temp.next=head;
        ListNode last=temp;
        ListNode t=head;
        for(;t!=null;t=t.next){
            if(t.val==val)last.next=t.next;
            else last=last.next;
        }
    return temp.next;    
    }
}
```
