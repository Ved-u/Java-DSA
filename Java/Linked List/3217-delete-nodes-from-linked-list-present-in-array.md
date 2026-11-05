# 3217. Delete Nodes From Linked List Present in Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/
**Tags:** Array, Hash Table, Linked List

## Approach 1 — 2024-08-05 23:29 (java)

*Runtime: 5 ms (faster than 98.2%) · Memory: 72.5 MB*

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
    public ListNode modifiedList(int[] nums, ListNode head) {
        boolean freq[]=new boolean[100005];
        for(int x:nums){
            freq[x]=true;
        }
        ListNode temp=new ListNode(100);
        ListNode t=head;
        ListNode last=temp;
        temp.next=head;
        for(;t!=null;t=t.next){
            if(freq[t.val])last.next=t.next;
            else last=last.next;
        }
    return temp.next;    
    }
}
```
