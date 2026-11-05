# 437. Path Sum III

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/path-sum-iii/
**Tags:** Tree, Depth-First Search, Binary Tree

## Approach 1 — 2024-11-29 12:18 (java)

*Runtime: 19 ms (faster than 32.4%) · Memory: 43.1 MB*

```java
class Solution {
    public int helper(TreeNode root, long targetSum){
        if(root==null)return 0;
        int count=0;
        if(root.val==targetSum)count++;
    return count+helper(root.left,targetSum-root.val)+helper(root.right,targetSum-root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        int count=helper(root,targetSum);
        count+=pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    return count;
    }
}
```
