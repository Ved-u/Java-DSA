# 61. Rotate List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/rotate-list/
**Tags:** Linked List, Two Pointers

## Approach 1 — 2024-08-20 19:03 (java)

*Runtime: 1 ms (faster than 9.8%) · Memory: 42.7 MB*

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        if(k==0)return head;
        ArrayList<Integer> t=new ArrayList<>();
        for(ListNode temp=head;temp!=null;temp=temp.next){
            t.add(temp.val);
        }
        k%=t.size();
        for(int j=1;j<=k;j++){
            int tmp=t.get(t.size()-1);
            for(int i=t.size()-1;i>0;i--){
                t.set(i,t.get(i-1));
            }
            t.set(0,tmp);
        }int count=0;
        for(ListNode temp=head;temp!=null;temp=temp.next){
            temp.val=t.get(count++);
        }
    return head;
    }
}
```

## Approach 2 — 2024-08-20 19:09 (java)

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if(k==0)return head;
        ListNode curr = head;

        int size = 0;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        k %= size;

        if (k == 0) {
            return head;
        }

        curr = head;
    
        for (int i = 1; i <= size - k - 1; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        curr = newHead;
        //traverse to the last node
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        return newHead;
    }
}
```

## Approach 3 — 2026-05-05 10:03 (java)

*Runtime: 1 ms (faster than 9.8%) · Memory: 44.7 MB*

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;
        Deque<ListNode> list=new ArrayDeque<>();
        for(ListNode tmp=head;tmp!=null;tmp=tmp.next)
            list.add(tmp);
        k%=list.size();
        for(int i=1;i<=k;i++)
            list.addFirst(list.removeLast());
        ListNode ans=list.removeFirst();
        ListNode tmp=ans;
        while(list.size()>0){
            tmp.next=list.removeFirst();
            tmp=tmp.next;
        }
        tmp.next=null;
    return ans;
    }
}
```
