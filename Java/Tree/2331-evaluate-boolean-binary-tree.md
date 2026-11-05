# 2331. Evaluate Boolean Binary Tree

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/evaluate-boolean-binary-tree/
**Tags:** Tree, Depth-First Search, Binary Tree

## Approach 1 — 2026-09-23 20:46 (java)

*Runtime: 0 ms · Memory: 46.3 MB*

```java
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null||root.right==null)return root.val==0?false:true;
        if(root.val==2){
            return evaluateTree(root.left)||evaluateTree(root.right);
        }else{
            return evaluateTree(root.left)&&evaluateTree(root.right);
        }        
    }
}
```
