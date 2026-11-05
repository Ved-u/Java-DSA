# 21. Merge Two Sorted Lists

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/merge-two-sorted-lists/
**Tags:** Linked List, Recursion

## Approach 1 — 2024-07-25 18:18 (python)

*Runtime: 24 ms (faster than 2.8%) · Memory: 11.8 MB*

```python
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        temp1, temp2 = list1, list2
        mergedListHead = ListNode(0) # head of the merged is None
        ret = mergedListHead
        while temp1 or temp2:
            if temp1 and temp2:
                if temp1.val < temp2.val:
                    mergedListHead.next = ListNode(temp1.val)
                    temp1 = temp1.next
                else:
                    mergedListHead.next = ListNode(temp2.val)
                    temp2 = temp2.next
            elif temp1:
                mergedListHead.next = ListNode(temp1.val)
                temp1 = temp1.next
            elif temp2:
                mergedListHead.next = ListNode(temp2.val)
                temp2 = temp2.next
            mergedListHead = mergedListHead.next

        return ret.next
```
