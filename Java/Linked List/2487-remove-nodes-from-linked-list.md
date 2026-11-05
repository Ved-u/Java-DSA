# 2487. Remove Nodes From Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/remove-nodes-from-linked-list/
**Tags:** Linked List, Stack, Recursion, Monotonic Stack

## Approach 1 — 2026-06-17 11:56 (java)

*Runtime: 22 ms (faster than 46.1%) · Memory: 148.4 MB*

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
    public ListNode removeNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for(ListNode tmp = head;tmp != null;tmp = tmp.next){
            list.add(tmp.val);
        }
        int max=0;
        Stack<Integer> stack = new Stack<>();
        for(int i = list.size()-1;i >= 0;i--){
            if(list.get(i)>=max){
                max = list.get(i);
                stack.push(max);
            }
        }
        ListNode tmp = head;
        ListNode last = head;
        while(!stack.isEmpty()){
            last = tmp;
            tmp.val = stack.pop();
            tmp = tmp.next;
        }
        last.next = null;
        return head;
    }
}
```
