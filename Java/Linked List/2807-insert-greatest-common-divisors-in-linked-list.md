# 2807. Insert Greatest Common Divisors in Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
**Tags:** Linked List, Math, Number Theory

## Approach 1 — 2024-09-10 19:32 (java)

*Runtime: 2 ms (faster than 60.7%) · Memory: 44.4 MB*

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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       // if(head.next==null)return head;
        for(ListNode t=head;t.next!=null;t=t.next.next){
            ListNode temp=new ListNode(gcd(t.val,t.next.val));
            temp.next=t.next;
            t.next=temp;
        }
    return head;
    }
      public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

## Approach 2 — 2024-09-14 14:09 (java)

*Runtime: 2 ms (faster than 60.7%) · Memory: 45 MB*

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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        for(ListNode t=head;t.next!=null;t=t.next.next){
            ListNode temp=new ListNode(gcd(t.val,t.next.val));
            temp.next=t.next;
            t.next=temp;
        }
    return head;
    }
    public static int gcd(int a, int b) {
       while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
       }
    return a;
    }
}
```
