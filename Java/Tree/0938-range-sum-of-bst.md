# 938. Range Sum of BST

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/range-sum-of-bst/
**Tags:** Tree, Depth-First Search, Binary Search Tree, Binary Tree

## Approach 1 — 2026-09-16 20:11 (java)

*Runtime: 1 ms · Memory: 54 MB*

```java
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)return 0;
        int left=rangeSumBST(root.left,low,high);
        int right=rangeSumBST(root.right,low,high);
        if(root.val>=low&&root.val<=high)return left+right+root.val;
        return left+right;
    }
}
```

## Approach 2 — 2026-09-16 20:12 (java)

*Runtime: 0 ms · Memory: 54.2 MB*

```java
class Solution {
    public int rangeSumBST(TreeNode root, int lo, int hi) {
        if(root == null) return 0;
        //if val small than target then goes to right 
        if(root.val<lo) return rangeSumBST(root.right,lo,hi);
        //if val greater than target then goes to left 
        if(root.val>hi) return rangeSumBST(root.left,lo,hi);
        return root.val + rangeSumBST(root.right,lo,hi) +rangeSumBST(root.left,lo,hi);
    }
}
```

## Approach 3 — 2026-09-16 20:13 (java)

*Runtime: 0 ms · Memory: 53.8 MB*

```java
class Solution {
    public int rangeSumBST(TreeNode root, int lo, int hi) {
        if(root == null) return 0;
        if(root.val<lo) return rangeSumBST(root.right,lo,hi);
        if(root.val>hi) return rangeSumBST(root.left,lo,hi);
        return root.val + rangeSumBST(root.right,lo,hi) +rangeSumBST(root.left,lo,hi);
    }
}
```
