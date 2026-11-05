# 173. Binary Search Tree Iterator

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/binary-search-tree-iterator/
**Tags:** Stack, Tree, Design, Binary Search Tree, Binary Tree, Iterator

## Approach 1 — 2024-12-01 12:38 (java)

*Runtime: 18 ms (faster than 55.2%) · Memory: 48.4 MB*

```java
class BSTIterator {
    int indx;
    List<Integer> al;
    public void inorder(List<Integer> al,TreeNode root){
        if(root==null)return;
        inorder(al,root.left);
        al.add(root.val);
        inorder(al,root.right);
    }
    public BSTIterator(TreeNode root) {
        al=new ArrayList<>();
        indx=-1;
        inorder(al,root);
    }
    public int next() {
        return al.get(++indx);
    }
    public boolean hasNext() {
    return indx+1<=al.size()-1;
    }
}
```

## Approach 2 — 2024-12-01 12:43 (java)

*Runtime: 16 ms (faster than 99.5%) · Memory: 48.1 MB*

```java
class BSTIterator {
    Queue<TreeNode> queue;
    public BSTIterator(TreeNode root) {
        queue = new LinkedList<>();
        helper(root);
    }
    public void helper(TreeNode root) {
        if (root == null)return;
        helper(root.left);
        queue.add(root);
        helper(root.right);
    }
    public int next() {
        return queue.poll().val;
    }
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
```
