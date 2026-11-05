# 1721. Swapping Nodes in a Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
**Tags:** Linked List, Two Pointers

## Approach 1 — 2026-06-17 11:13 (java)

*Runtime: 6 ms (faster than 3.6%) · Memory: 118.2 MB*

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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        for(ListNode tmp=head;tmp!=null;tmp=tmp.next){
            list.add(tmp.val);
        }
        int temp = list.get(k-1);
        list.set(k-1,list.get(list.size()-k));
        list.set(list.size()-k,temp);
        int idx=0;
        for(ListNode tmp=head;tmp!=null;tmp=tmp.next){
            tmp.val = list.get(idx++);
        }
        return head;
    }
}
```

## Approach 2 — 2026-06-17 11:23 (java)

*Runtime: 2 ms (faster than 56.4%) · Memory: 118.3 MB*

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = null, second = null;
        int idx=1;
        for(ListNode tmp = head;tmp != null;tmp = tmp.next){
            if(idx==k)first=tmp;
            idx++;
        }
        int size=idx-1;idx=0;
        for(ListNode tmp = head;tmp != null;tmp = tmp.next){
            if(size-idx==k){
                second=tmp;
                break;
            }
            idx++;
        }
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
        return head;
    }
}
```
