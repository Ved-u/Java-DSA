# 897. Increasing Order Search Tree

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/increasing-order-search-tree/
**Tags:** Stack, Tree, Depth-First Search, Binary Search Tree, Binary Tree

## Approach 1 — 2026-09-24 16:09 (java)

*Runtime: 0 ms · Memory: 43.1 MB*

```java
class Solution {
    // boolean isRootFound = false;
    // TreeNode ans = null;
    // public TreeNode increasingBST(TreeNode root) {
    //     if(root==null)return null;
    //     TreeNode left = increasingBST(root.left);
    //     while(root.left!=null&&root.left.right==null)root.left.right = root;
    //     root.left = null;
    //     TreeNode right = increasingBST(root.right);
    //     if(left==null&&isRootFound==false){
    //         isRootFound = true;
    //         ans = root;
    //     }
    //     return ans;
    // }
    TreeNode makeTree(List<TreeNode> list){
        for(int i=0;i<list.size()-1;i++){
            TreeNode root = list.get(i);
            root.left = null;
            root.right = list.get(i+1);
        }
        list.get(list.size()-1).left = null;
        return list.get(0);
    }
    void parseTree(List<TreeNode> list, TreeNode root){
        if(root==null)return;
        parseTree(list,root.left);
        list.add(root);
        parseTree(list,root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        parseTree(list,root);
        return makeTree(list);
    }
}
```
