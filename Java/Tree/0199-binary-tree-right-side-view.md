# 199. Binary Tree Right Side View

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/binary-tree-right-side-view/
**Tags:** Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Approach 1 — 2024-11-28 10:55 (java)

*Runtime: 1 ms (faster than 78.9%) · Memory: 42.2 MB*

```java
class Solution {
    public int height(TreeNode root){
        if(root==null||(root.left==null&&root.right==null))return 0;
    return 1+Math.max(height(root.left),height(root.right));
    }
    public void preorder(TreeNode root,List<Integer> ans,int level){
        if(root==null)return;
        ans.set(level,root.val);
        preorder(root.left,ans,level+1);
        preorder(root.right,ans,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        int height=height(root)+1;
        for(int i=0;i<height;i++){
            ans.add(0);
        }
        preorder(root,ans,0);
    return ans;
    }
}
```

## Approach 2 — 2025-01-01 18:56 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.2 MB*

```java
class Solution {
    private void helper(TreeNode root, int level, List<Integer> ans){
        if(root==null)return;
        if(level==ans.size()) ans.add(root.val);
        helper(root.right, level+1, ans);
        helper(root.left, level+1, ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;
    }
}
```
