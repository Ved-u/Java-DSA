# 235. Lowest Common Ancestor of a Binary Search Tree

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
**Tags:** Tree, Depth-First Search, Binary Search Tree, Binary Tree, Binary Lifting, Lowest Common Ancestor

## Approach 1 — 2024-11-30 21:34 (java)

*Runtime: 5 ms (faster than 100.0%) · Memory: 45.6 MB*

```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root.val==p.val||root.val==q.val)return root;
    if((root.val>p.val&&root.val<q.val)||(root.val<p.val&&root.val>q.val))
        return root;
    else if(root.val<p.val&&root.val<q.val)
        return lowestCommonAncestor(root.right,p,q);
    return lowestCommonAncestor(root.left,p,q);
    }
}
```

## Approach 2 — 2024-11-30 21:40 (java)

*Runtime: 5 ms (faster than 100.0%) · Memory: 45.1 MB*

```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root.val<p.val&&root.val<q.val)return lowestCommonAncestor(root.right,p,q);
    else if(root.val>p.val&&root.val>q.val)return lowestCommonAncestor(root.left,p,q);
    else return root;
    }
}
```
