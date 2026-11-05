# 993. Cousins in Binary Tree

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/cousins-in-binary-tree/
**Tags:** Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Approach 1 — 2026-09-25 19:33 (java)

*Runtime: 1 ms · Memory: 43.1 MB*

```java
class Solution {
    void depth(TreeNode root, int x, int y, int[] depth, int currDepth,
                HashMap<Integer,Integer> map){
        //{X'sDepth, Y'sDepth}
        if(root==null)return;
        if(root.left!=null)map.put(root.left.val,root.val);
        if(root.right!=null)map.put(root.right.val,root.val);
        depth(root.left,x,y,depth,currDepth+1,map);
        depth(root.right,x,y,depth,currDepth+1,map);
        currDepth++;
        if(root.val==x)depth[0] = currDepth;
        if(root.val==y)depth[1] = currDepth;
        return;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] depth = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();//Node,parent
        depth(root,x,y,depth,0,map);
        if(map.get(x)==map.get(y))return false;
        return depth[0]==depth[1];
    }
}
```

## Approach 2 — 2026-09-25 19:34 (java)

*Runtime: 1 ms · Memory: 43.6 MB*

```java
class Solution {
    void depth(TreeNode root, int x, int y, int[] depth, int currDepth,
                HashMap<Integer,Integer> map){
        //{X'sDepth, Y'sDepth}
        if(root==null)return;
        if(root.left!=null)map.put(root.left.val,root.val);
        if(root.right!=null)map.put(root.right.val,root.val);
        depth(root.left,x,y,depth,currDepth+1,map);
        depth(root.right,x,y,depth,currDepth+1,map);
        currDepth++;
        if(root.val==x)depth[0] = currDepth;
        if(root.val==y)depth[1] = currDepth;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] depth = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();//Node,parent
        depth(root,x,y,depth,0,map);
        if(map.get(x)==map.get(y))return false;
        return depth[0]==depth[1];
    }
}
```

## Approach 3 — 2026-09-25 19:36 (java)

*Runtime: 1 ms · Memory: 43.2 MB*

```java
class Solution {
    void depth(TreeNode root, int x, int y, int[] depth, int currDepth,
                HashMap<Integer,Integer> map){
        //{X'sDepth, Y'sDepth}
        if(root==null)return;
        if(root.left!=null)map.put(root.left.val,root.val);
        if(root.right!=null)map.put(root.right.val,root.val);
        depth(root.left,x,y,depth,currDepth+1,map);
        depth(root.right,x,y,depth,currDepth+1,map);
        if(root.val==x)depth[0] = currDepth;
        if(root.val==y)depth[1] = currDepth;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] depth = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();//Node,parent
        depth(root,x,y,depth,0,map);
        if(map.get(x)==map.get(y))return false;
        return depth[0]==depth[1];
    }
}
```
