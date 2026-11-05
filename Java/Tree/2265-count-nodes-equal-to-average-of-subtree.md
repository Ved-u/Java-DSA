# 2265. Count Nodes Equal to Average of Subtree

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
**Tags:** Tree, Depth-First Search, Binary Tree

## Approach 1 — 2026-09-10 21:28 (java)

*Runtime: 1 ms · Memory: 46.3 MB*

```java
class Solution {
    int[] avg(TreeNode root){
        if(root==null)return new int[]{0,0,0};
        int[] left = avg(root.left);
        int[] right = avg(root.right);
        int curr[] = new int[3];//count,sum, ans
        curr[0] = left[0]+right[0]+1;
        curr[1] = left[1]+right[1]+root.val;
        curr[2] = left[2]+right[2];
        if(root.val==curr[1]/curr[0])curr[2]++;
        return curr;
    }
    public int averageOfSubtree(TreeNode root) {
        int info[] = avg(root);
        return info[2];
    }
}
```
