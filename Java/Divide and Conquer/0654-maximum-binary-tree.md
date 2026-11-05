# 654. Maximum Binary Tree

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-binary-tree/
**Tags:** Array, Divide and Conquer, Stack, Tree, Monotonic Stack, Binary Tree, Cartesian Tree

## Approach 1 — 2026-09-19 10:35 (java)

*Runtime: 3 ms · Memory: 46.8 MB*

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null||nums.length==0)return null;
        int maxIdx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxIdx]){
                maxIdx = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxIdx]);
        int[] numLeft = Arrays.copyOfRange(nums,0,maxIdx);
        int[] numRight = Arrays.copyOfRange(nums,maxIdx+1,nums.length);
        root.left = constructMaximumBinaryTree(numLeft);
        root.right = constructMaximumBinaryTree(numRight);
        return root;
    }
}
```
