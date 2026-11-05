# 563. Binary Tree Tilt

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/binary-tree-tilt/
**Tags:** Tree, Depth-First Search, Binary Tree, DP on Trees

## Approach 1 — 2026-09-18 21:08 (java)

*Runtime: 0 ms · Memory: 46.5 MB*

```java
class Solution {
    int parse(TreeNode root, int[] ans){
        if(root==null)return 0;
        int left = parse(root.left,ans);
        int right = parse(root.right,ans);
        ans[0]+=Math.abs(left-right);
        return left+right+root.val;
    }
    public int findTilt(TreeNode root) {
        int[] ans = new int[1];
        parse(root,ans);
        return ans[0];
    }
}
```
