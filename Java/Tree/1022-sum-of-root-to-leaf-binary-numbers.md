# 1022. Sum of Root To Leaf Binary Numbers

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
**Tags:** Tree, Depth-First Search, Binary Tree

## Approach 1 — 2026-03-23 22:34 (java)

*Runtime: 6 ms (faster than 9.8%) · Memory: 44.8 MB*

```java
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        transform(root);
        return sum(root,0);
    }
    int sum(TreeNode root,int sum) {
        if(root==null)return sum;
        if(root.left==null&&root.right==null){
            return sum+=root.val;
        }
        return sum(root.left,sum)+sum(root.right,sum);
    }
    void transform(TreeNode root) {
        if((root.left==null&&root.right==null))return;
        if(root.left!=null){
            String bin =Integer.toBinaryString(root.val);
            bin+=root.left.val;
            root.left.val=Integer.parseInt(bin,2);
            transform(root.left);
        }
        if(root.right!=null){
            String bin =Integer.toBinaryString(root.val);
            bin+=root.right.val;
            root.right.val=Integer.parseInt(bin,2);
            transform(root.right);
        }
    }
}
```
