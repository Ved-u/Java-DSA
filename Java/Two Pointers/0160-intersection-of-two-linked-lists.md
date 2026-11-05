# 160. Intersection of Two Linked Lists

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/intersection-of-two-linked-lists/
**Tags:** Hash Table, Linked List, Two Pointers

## Approach 1 — 2024-07-23 07:26 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 48.6 MB*

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode  temp=headA;
        ListNode temp2=headB;
        int m=0,n=0;
        while(temp!=null){
            m++;
            temp=temp.next;
        }
        while(temp2!=null){
            n++;
            temp2=temp2.next;
        }
       temp=headA;
       temp2=headB;
        if(m>n){
        for(int i=1;i<=Math.abs(m-n);i++){
            temp=temp.next;
        }}else if(m<n){
            for(int i=1;i<=Math.abs(m-n);i++){
            temp2=temp2.next;
        }
        }
        while(temp!=null){
            if(temp==temp2)return temp;
            temp=temp.next;
            temp2=temp2.next;
        }
    return null;    
    }
}
```
