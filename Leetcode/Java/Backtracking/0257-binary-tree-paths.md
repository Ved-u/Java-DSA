# 257. Binary Tree Paths

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/binary-tree-paths/
**Tags:** String, Backtracking, Tree, Depth-First Search, Binary Tree

## Approach 1 — 2024-11-27 19:14 (java)

*Runtime: 9 ms (faster than 21.2%) · Memory: 42.9 MB*

```java
class Solution {
    public void helper(TreeNode root,List<String> ans,String s){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        helper(root.left,ans,s+root.val+"->");
        helper(root.right,ans,s+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        helper(root,ans,"");
    return ans;
    }
}
```
