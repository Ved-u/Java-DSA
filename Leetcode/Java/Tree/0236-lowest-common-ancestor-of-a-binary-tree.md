# 236. Lowest Common Ancestor of a Binary Tree

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
**Tags:** Tree, Depth-First Search, Binary Tree, Binary Lifting, Lowest Common Ancestor

## Approach 1 — 2024-11-27 19:51 (java)

*Runtime: 480 ms (faster than 5.3%) · Memory: 44.8 MB*

```java
class Solution {
    public boolean contains(TreeNode root,TreeNode node){
        if(root==null)return false;
        if(root==node)return true;
    return contains(root.left,node)||contains(root.right,node);
    }
public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
    if(p==root||q==root)return root;
    if(p==q)return p;
    boolean leftp=contains(root.left,p);
    boolean rightq=contains(root.right,q);
    if((leftp&&rightq)||(!leftp&&!rightq))return root;
    if(leftp&&!rightq)return lowestCommonAncestor(root.left,p,q);
    if(!leftp&&rightq)return lowestCommonAncestor(root.right,p,q);
    return null;
    }
}
```
