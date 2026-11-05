# 3997. Count Dominant Nodes in a Binary Tree

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-dominant-nodes-in-a-binary-tree/
**Tags:** Tree, Depth-First Search, Binary Tree

## Approach 1 — 2026-07-24 11:04 (java)

*Runtime: 9 ms (faster than 82.9%) · Memory: 172.9 MB*

```java
class Solution {
    public int countDominantNodes(TreeNode root,int arr[]){
        if(root==null)return 0;
        int left = countDominantNodes(root.left, arr);
        int right = countDominantNodes(root.right, arr);
        int max = Math.max(Math.max(left,right),root.val);
        if(max == root.val){
            arr[0]++;
        }
        return max;
    }
    public int countDominantNodes(TreeNode root) {
        int arr[] = new int[1];
        countDominantNodes(root, arr);
        return arr[0];
    }
}
```
