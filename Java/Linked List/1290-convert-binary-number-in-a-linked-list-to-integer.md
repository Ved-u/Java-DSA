# 1290. Convert Binary Number in a Linked List to Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
**Tags:** Linked List, Math

## Approach 1 — 2024-07-29 19:30 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.4 MB*

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
    public int getDecimalValue(ListNode head) {
        int ans=0;
        for(ListNode temp=head;temp!=null;temp=temp.next){
             ans=ans*2+temp.val;
        }
    return ans;    
    }
}
```
