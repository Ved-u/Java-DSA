# 617. Merge Two Binary Trees

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/merge-two-binary-trees/
**Tags:** Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Approach 1 — 2026-10-22 15:59 (java)

*Runtime: 0 ms · Memory: 46.5 MB*

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null)return null;
        else if(root1!=null&&root2!=null){
            root1.val+=root2.val;
            root1.left = mergeTrees(root1.left,root2.left);
            root1.right = mergeTrees(root1.right,root2.right);
        }else if(root1==null){
            return root2;
        }
        return root1;
    }
}
```

## Approach 2 — 2026-10-22 16:10 (java)

*Runtime: 0 ms · Memory: 46.8 MB*

```java
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null)return null;
        else if(root1!=null&&root2!=null){
            root1.val+=root2.val;
            root1.left = mergeTrees(root1.left,root2.left);
            root1.right = mergeTrees(root1.right,root2.right);
        }else if(root1==null) return root2;
        return root1;
    }
}
```
