# 965. Univalued Binary Tree

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/univalued-binary-tree/
**Tags:** Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Approach 1 — 2026-09-21 21:00 (java)

*Runtime: 0 ms · Memory: 42.8 MB*

```java
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)return true;
        return isUnivalTree(root.left) &&
                isUnivalTree(root.right) &&
                (root.left == null || root.left.val == root.val) &&
                (root.right == null || root.right.val == root.val);
    }
}
```
