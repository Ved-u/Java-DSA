# 222. Count Complete Tree Nodes

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-complete-tree-nodes/
**Tags:** Binary Search, Bit Manipulation, Tree, Binary Tree

## Approach 1 — 2026-04-29 07:57 (java)

*Runtime: 7 ms (faster than 0.6%) · Memory: 49.6 MB*

```java
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int ans=0;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            ans++;
            if(temp.right!=null)stack.push(temp.right);
            if(temp.left!=null)stack.push(temp.left);
        }
        return ans;
    }
}
```

## Approach 2 — 2026-04-29 07:57 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 49.3 MB*

```java
class Solution {
    public int countNodes(TreeNode root) {
        return counter(root);
    }
    public int counter(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = counter(root.left);
        int right = counter(root.right);
        return left+right+1;
    }
}
```
