# 1382. Balance a Binary Search Tree

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/balance-a-binary-search-tree/
**Tags:** Divide and Conquer, Greedy, Tree, Depth-First Search, Binary Search Tree, Binary Tree

## Approach 1 — 2026-09-22 19:43 (java)

*Runtime: 2 ms · Memory: 47.9 MB*

```java
class Solution {
    void sortedArray(TreeNode root, List<TreeNode> ans){
        if(root==null)return;
        sortedArray(root.left,ans);
        ans.add(root);
        sortedArray(root.right,ans);
    }
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        sortedArray(root,ans);
        return helper(ans,0,ans.size()-1);
    }
    TreeNode helper(List<TreeNode> ans,int l,int r){
        int size = r-l+1;
        if(size==0||l>r||l<0||r<0)return null;
        int mid = l + size/2;
        TreeNode root = ans.get(mid);
        root.left = helper(ans,l,mid-1);
        root.right = helper(ans,mid+1,r);
        return root;
    }
}
```
