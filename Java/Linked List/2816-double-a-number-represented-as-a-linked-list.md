# 2816. Double a Number Represented as a Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
**Tags:** Linked List, Math, Stack

## Approach 1 — 2026-06-17 11:45 (java)

*Runtime: 8 ms (faster than 12.1%) · Memory: 47.4 MB*

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
    public ListNode doubleIt(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for(ListNode tmp = head;tmp != null;tmp = tmp.next){
            list.add(tmp.val);
        }
        int carry = 0;
        for(int i=list.size()-1;i>=0;i--){
            int x = list.get(i)*2 + carry;
            carry = 0;
            if(x>9){
                list.set(i,x%10);
                x/=10;
                carry = x%10;
            }else list.set(i,x);
        }
        ListNode ans = head;
        if(carry>0){
            ans = new ListNode(carry);
            ans.next = head;
        }
        carry = 0;
        for(ListNode tmp = head;tmp != null;tmp = tmp.next){
            tmp.val = list.get(carry++);
        }
        return ans;
    }
}
```
