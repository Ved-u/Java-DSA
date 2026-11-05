# 404. Sum of Left Leaves

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-left-leaves/
**Tags:** Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Approach 1 — 2026-07-24 12:02 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.1 MB*

```java
class Solution {
    public boolean sumOfLeftLeaves(TreeNode root, int sum[]){
        if(root == null)return false;
        if(root.left==null&&root.right==null)return true;
        boolean left = sumOfLeftLeaves(root.left,sum);
        boolean right = sumOfLeftLeaves(root.right,sum);
        if(left)sum[0]+=root.left.val;
        return false;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int sum [] = new int[1];
        sumOfLeftLeaves(root,sum);
        return sum[0];
    }
}
```
