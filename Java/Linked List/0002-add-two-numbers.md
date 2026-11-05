# 2. Add Two Numbers

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/add-two-numbers/
**Tags:** Linked List, Math, Recursion

## Approach 1 — 2024-08-04 20:12 (java)

*Runtime: 2 ms (faster than 33.4%) · Memory: 43.9 MB*

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(100);
        ListNode t=ans;
        int carry=0;
        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                int add=l1.val+l2.val+carry;
                if(add>9){
                    carry=add/10;
                    add=add%10;
                }else carry=0;
                ListNode temp=new ListNode(add);
                t.next=temp;
                l1=l1.next;
                l2=l2.next;
            }else if(l1!=null){
                int add=l1.val+carry;
                if(add>9){
                     carry=add/10;
                    add=add%10;
                }else carry=0;
                ListNode temp=new ListNode(add);
                t.next=temp;
                l1=l1.next;
            }else {
                int add=l2.val+carry;
                if(add>9){
                    carry=add/10;
                    add=add%10;
                }else carry=0;
                ListNode temp=new ListNode(add);
                t.next=temp;
                l2=l2.next;
            }    
            t=t.next;
        }
        if(carry>0){
            ListNode temp=new ListNode(carry);
            t.next=temp;
        }
    return ans.next;    
    }
}
```

## Approach 2 — 2024-08-24 08:32 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.2 MB*

```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            tail.next = new ListNode(sum % 10);
            carry = sum / 10;
            tail = tail.next;
        }
        if (carry > 0) tail.next = new ListNode(carry);
    return dummy.next;
    }
}
```

## Approach 3 — 2026-08-08 13:09 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 46.1 MB*

```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(100);
        ListNode t=ans;
        int carry=0;
        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                int add=l1.val+l2.val+carry;
                if(add>9){
                    carry=add/10;
                    add=add%10;
                }else carry=0;
                ListNode temp=new ListNode(add);
                t.next=temp;
                l1=l1.next;
                l2=l2.next;
            }else if(l1!=null){
                int add=l1.val+carry;
                if(add>9){
                     carry=add/10;
                    add=add%10;
                }else carry=0;
                ListNode temp=new ListNode(add);
                t.next=temp;
                l1=l1.next;
            }else {
                int add=l2.val+carry;
                if(add>9){
                    carry=add/10;
                    add=add%10;
                }else carry=0;
                ListNode temp=new ListNode(add);
                t.next=temp;
                l2=l2.next;
            }    
            t=t.next;
        }
        if(carry>0){
            ListNode temp=new ListNode(carry);
            t.next=temp;
        }
    return ans.next;    
    }
}
```
