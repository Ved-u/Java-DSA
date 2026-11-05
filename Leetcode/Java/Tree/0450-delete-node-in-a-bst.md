# 450. Delete Node in a BST

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/delete-node-in-a-bst/
**Tags:** Tree, Binary Search Tree, Binary Tree

## Approach 1 — 2024-11-30 21:00 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 46.3 MB*

```java
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val>key)root.left=deleteNode(root.left,key);
        else if(root.val<key)root.right=deleteNode(root.right,key);
        else{
            if(root.left==null&&root.right==null)return null;
            if(root.right==null)return root.left;
            if(root.left==null)return root.right;
            TreeNode IS= getInorderSuccesor(root.right);
            root.val=IS.val;
            root.right=deleteNode(root.right,IS.val);
        }
    return root;
    }   
    public static TreeNode getInorderSuccesor(TreeNode root){
        if(root==null)return null;
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}
```
