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

## Approach 2 — 2024-11-29 12:26 (java)

*Runtime: 2 ms (faster than 99.9%) · Memory: 44.3 MB*

```java
class Solution {
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        helper(root, 0L, targetSum, map);
        return count;
    }
    private void helper(TreeNode root, Long curSum, int targetSum, HashMap<Long, Integer> map) {
        if (root == null) return;
        curSum += root.val;
        if(map.containsKey(curSum-targetSum))count+=map.get(curSum-targetSum);
        map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        helper(root.left, curSum, targetSum, map);
        helper(root.right, curSum, targetSum, map);
        map.put(curSum, map.get(curSum) - 1);
    }
}
```
