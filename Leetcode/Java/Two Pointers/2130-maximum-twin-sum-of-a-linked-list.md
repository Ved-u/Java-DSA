# 2130. Maximum Twin Sum of a Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
**Tags:** Linked List, Two Pointers, Stack

## Approach 1 — 2024-07-28 17:08 (java)

*Runtime: 5 ms (faster than 56.4%) · Memory: 63.9 MB*

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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        mid.next=reverse(mid.next);
        slow=head;
        fast=mid.next;
        int ans=0;
        while(fast!=null){
            ans=Math.max(ans,fast.val+slow.val);
            fast=fast.next;
            slow=slow.next;
        }
    return ans;
    }
    public ListNode reverse(ListNode head){
        ListNode last=head;
        ListNode next;
        for(ListNode curr=head;curr!=null;curr=next){
            next=curr.next;
            curr.next=last;
            last=curr;
        }head.next=null;
    return last;    
    }
}
```
