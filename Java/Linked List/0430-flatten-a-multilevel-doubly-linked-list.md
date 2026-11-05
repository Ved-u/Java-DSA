# 430. Flatten a Multilevel Doubly Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
**Tags:** Linked List, Depth-First Search, Doubly-Linked List

## Approach 1 — 2024-08-03 19:22 (java)

*Runtime: 1 ms (faster than 39.6%) · Memory: 41.5 MB*

```java
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node t=head;
        while(t!=null){
            Node temp=t.next;
            if(t.child!=null){
               Node c=flatten(t.child);
               t.next=c;
               c.prev=t;
               while(c.next!=null){
                c=c.next;
               } 
               c.next=temp;
               if(temp!=null)temp.prev=c;
            }
            t.child=null;
            t=temp;
        }
    return head;    
    }
}
```

## Approach 2 — 2024-08-03 19:26 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                Node child = curr.child;
                curr.next = child;
                child.prev = curr;
                curr.child = null;
                for (;child.next != null;child = child.next){}
                child.next = next;
                if (next != null) next.prev = child;
            }
            curr = curr.next;
        }
    return head;
    }
}
```
