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
