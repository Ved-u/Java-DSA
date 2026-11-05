# 226. Invert Binary Tree

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/invert-binary-tree/
**Tags:** Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Approach 1 — 2024-11-28 08:51 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.4 MB*

```java
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode l=root.left;
        TreeNode r=root.right;
        root.left=invertTree(r);
        root.right=invertTree(l);
    return root;
    }
}
```
