# 328. Odd Even Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/odd-even-linked-list/
**Tags:** Linked List

## Approach 1 — 2024-07-28 17:33 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.5 MB*

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
    public ListNode oddEvenList(ListNode head) {
       ListNode to=new ListNode(69);
       ListNode te=new ListNode(69);
       ListNode t=te;
       ListNode ans=to;
       int count=0;
       for(ListNode temp=head;temp!=null;temp=temp.next){
            if(count%2==0){
                to.next=temp;
                to=to.next;
            }else{
                te.next=temp;
                te=te.next;
            }
            count++;
       }
       te.next=null;
       to.next=t.next;
    return ans.next;   
    }
}
```

## Approach 2 — 2024-07-28 17:49 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.9 MB*

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
    public ListNode oddEvenList(ListNode head) {
       ListNode to=new ListNode(69);
       ListNode te=new ListNode(69);
       ListNode t=te;
       ListNode ans=to;
       int count=1;
       for(ListNode temp=head;temp!=null;temp=temp.next){
            if(count%2==1){
                to.next=temp;
                to=to.next;
            }else{
                te.next=temp;
                te=te.next;
            }
            count++;
       }
       te.next=null;
       to.next=t.next;
    return ans.next;   
    }
}
```
