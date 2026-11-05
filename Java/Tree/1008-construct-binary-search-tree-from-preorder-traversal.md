# 1008. Construct Binary Search Tree from Preorder Traversal

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
**Tags:** Array, Stack, Tree, Binary Search Tree, Monotonic Stack, Binary Tree

## Approach 1 — 2024-12-01 10:08 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42 MB*

```java
class Solution {
     public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
        if(root.val>val){
            root.left=insertIntoBST(root.left,val);
        }else{
            root.right=insertIntoBST(root.right,val);
        }
    return root;
    }
    public TreeNode bstFromPreorder(int[] p) {
        TreeNode root=new TreeNode(p[0]);
        for(int i=1;i<p.length;i++){
            insertIntoBST(root,p[i]);
        }
    return root;
    }
}
```
