# 1038. Binary Search Tree to Greater Sum Tree

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
**Tags:** Tree, Depth-First Search, Binary Search Tree, Binary Tree

## Approach 1 — 2024-12-01 10:31 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.3 MB*

```java
class Solution {
     int sum=0;
    public void reverseInorder(TreeNode root){
        if(root==null)return;
        reverseInorder(root.right);
        root.val+=sum;
        sum=root.val;
        reverseInorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
         reverseInorder(root);
    return root;
    }
}
```
