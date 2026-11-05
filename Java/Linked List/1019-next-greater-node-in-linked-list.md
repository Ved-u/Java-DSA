# 1019. Next Greater Node In Linked List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/next-greater-node-in-linked-list/
**Tags:** Array, Linked List, Stack, Monotonic Stack

## Approach 1 — 2026-06-17 12:35 (java)

*Runtime: 1024 ms (faster than 5.0%) · Memory: 50.3 MB*

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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for(ListNode tmp = head;tmp != null;tmp = tmp.next){
            list.add(tmp.val);
        }
        int[] ans = new int[list.size()];
        // ans[ans.length-1] = list.get(list.size()-1);
        // for(int i = ans.length-2;i >=0 ;i--){
        //     int max = Math.max(list.get(i),list.get(i+1));
        //     ans[i] = (list.get(i) == max)? 0 : max;
        // }
        for(int i=0;i<ans.length;i++){
            for(int j=i+1;j<ans.length;j++){
                if(list.get(j)>list.get(i)){
                    ans[i] = list.get(j);
                    break;
                }
            }
        }
        return ans;
    }
}
```
