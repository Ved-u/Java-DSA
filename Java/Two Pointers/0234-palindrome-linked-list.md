# 234. Palindrome Linked List

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/palindrome-linked-list/
**Tags:** Linked List, Two Pointers, Stack, Recursion

## Approach 1 — 2024-07-28 16:52 (java)

*Runtime: 3 ms (faster than 99.8%) · Memory: 65.2 MB*

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
    private static final int[] digits = new int[100000];
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        int size = -1;
        for (ListNode node = head; node != null; node = node.next) {
            digits[++size] = node.val;
        }
        for (int index = 0; index < size; index++) {
            if (digits[index] != digits[size--]) {
                return false;
            }
        }
        return true;
    }
}
```

## Approach 2 — 2024-07-28 16:34 (java)

*Runtime: 9 ms (faster than 13.8%) · Memory: 67.8 MB*

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
    public boolean isPalindrome(ListNode head){
        if(head.next==null)return true;
        ListNode mid=middle(head);
        mid.next=reverse(mid.next);
        ListNode t1=head;
        ListNode t2=mid.next;
        while(t2!=null){
            if(t1.val!=t2.val)return false;
            t1=t1.next;
            t2=t2.next;
        }
    return true;
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head.next==null)return head;
        ListNode newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
    return newHead;    
    }
}
```

## Approach 3 — 2024-07-28 16:45 (java)

*Runtime: 2 ms (faster than 99.9%) · Memory: 65.3 MB*

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
    private static final int[] digits = new int[100000];
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        int size = -1;
        for (ListNode node = head; node != null; node = node.next) {
            digits[++size] = node.val;
        }
        for (int index = 0; index < size; index++) {
            if (digits[index] != digits[size--]) return false;
        }
        return true;
    }
}
```

## Approach 4 — 2024-07-28 16:46 (java)

*Runtime: 5 ms (faster than 43.2%) · Memory: 58.3 MB*

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
    //private static final 
    public boolean isPalindrome(ListNode head) {
        int[] digits = new int[100000];
        if (head.next == null) return true;
        int size = -1;
        for (ListNode node = head; node != null; node = node.next) {
            digits[++size] = node.val;
        }
        for (int index = 0; index < size; index++) {
            if (digits[index] != digits[size--]) return false;
        }
        return true;
    }
}
```

## Approach 5 — 2024-07-28 16:48 (java)

*Runtime: 7 ms (faster than 27.9%) · Memory: 56.1 MB*

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
    ArrayList<Integer> temp=new ArrayList<>();
    public boolean isPalindrome(ListNode head) {
        int count=0;
        for(ListNode t=head;t!=null;t=t.next){
            temp.add(t.val);
            count++;
        }
        for(ListNode t=head;t!=null;t=t.next){
            if(t.val!=temp.get(--count))return false;
        }
    return true;    
    }
}
```

## Approach 6 — 2024-07-28 16:51 (java)

*Runtime: 4 ms (faster than 69.3%) · Memory: 56 MB*

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
     int[] digits = new int[100000];
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        int size = -1;
        for (ListNode node = head; node != null; node = node.next) {
            digits[++size] = node.val;
        }
        for (int index = 0; index < size; index++) {
            if (digits[index] != digits[size--]) {
                return false;
            }
        }
        return true;
    }
}
```

## Approach 7 — 2024-07-28 16:51 (java)

*Runtime: 3 ms (faster than 99.8%) · Memory: 65.4 MB*

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
    static int[] digits = new int[100000];
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        int size = -1;
        for (ListNode node = head; node != null; node = node.next) {
            digits[++size] = node.val;
        }
        for (int index = 0; index < size; index++) {
            if (digits[index] != digits[size--]) {
                return false;
            }
        }
        return true;
    }
}
```

## Approach 8 — 2024-07-28 16:52 (java)

*Runtime: 3 ms (faster than 99.8%) · Memory: 65.5 MB*

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
    private static int[] digits = new int[100000];
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        int size = -1;
        for (ListNode node = head; node != null; node = node.next) {
            digits[++size] = node.val;
        }
        for (int index = 0; index < size; index++) {
            if (digits[index] != digits[size--]) {
                return false;
            }
        }
        return true;
    }
}
```
