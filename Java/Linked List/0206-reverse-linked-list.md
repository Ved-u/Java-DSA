# 206. Reverse Linked List

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-linked-list/
**Tags:** Linked List, Recursion

## Approach 1 — 2024-07-26 18:16 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.3 MB*

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
   public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    
    ListNode temp = head.next;
    ListNode last = head;
    last.next = null; // Set the next of the original head to null
    
    while (temp != null) {
        ListNode t = temp.next;
        temp.next = last;
        last = temp;
        temp = t;
    }
    
    return last; // Return the new head
}

    public ListNode reverse(ListNode curr,ListNode prev) {
        if(curr.next==null)return curr;
      ListNode ans=reverse(curr.next,curr);
        curr.next=prev;
       return ans;
    }
}
```

## Approach 2 — 2024-07-28 10:46 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.7 MB*

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
   public ListNode reverseList(ListNode head) {
    if(head==null)return null;
    ListNode curr=head;
    ListNode last=head;
    while(curr!=null){
        ListNode next=curr.next;
        curr.next=last;
        last=curr;
        curr=next;
    }
    head.next=null;
    return last;
    }
}
```

## Approach 3 — 2024-07-28 10:56 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.7 MB*

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
   public ListNode reverseList(ListNode head) {
    // if(head==null)return null;
    // ListNode curr=head;
    // ListNode last=head;
    // while(curr!=null){
    //     ListNode next=curr.next;
    //     curr.next=last;
    //     last=curr;
    //     curr=next;
    // }
    // head.next=null;
    // return last;
    if(head==null)return null;
    ListNode ans=reverse(head,head);
    head.next=null;
    return ans;
    }
    public ListNode reverse(ListNode head,ListNode last) {
    if(head==null)return last;
    ListNode temp=head.next;
    head.next=last;
    last=head;
    return reverse(temp,last);
    }
}
```

## Approach 4 — 2024-07-28 11:49 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.3 MB*

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
   public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode ans=reverse(head);
        head.next=null;
    return ans;
    }
    public ListNode reverse(ListNode head) {
        if(head.next==null)return head;
        ListNode temp=reverse(head.next);
        head.next.next=head;
    return temp;
    }
}
```

## Approach 5 — 2024-07-28 11:52 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.3 MB*

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
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode temp=reverseList(head.next);
        head.next.next=head; 
        head.next=null;
    return temp;
    }
}
```
