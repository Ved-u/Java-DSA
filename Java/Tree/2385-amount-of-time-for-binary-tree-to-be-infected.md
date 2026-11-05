# 2385. Amount of Time for Binary Tree to Be Infected

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
**Tags:** Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Approach 1 — 2024-11-30 13:12 (java)

*Runtime: 141 ms (faster than 7.7%) · Memory: 92.2 MB*

```java
class Solution {
    public void search(HashMap<TreeNode,TreeNode> p,TreeNode root,int s,Queue<TreeNode> q){
        if(root==null)return;
        if(root.val==s)q.add(root);
        if(root.left!=null)p.put(root.left,root);
        if(root.right!=null)p.put(root.right,root);
        search(p,root.left,s,q);
        search(p,root.right,s,q);
    }
    public int amountOfTime(TreeNode root, int start) {
        int max=0;
        HashMap<TreeNode,TreeNode> parent=new HashMap<>();//child,parent
        HashMap<TreeNode,Integer> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        search(parent,root,start,q);
        TreeNode infected=q.peek();
        visited.put(infected,0);
        while(!q.isEmpty()){
            TreeNode t=q.remove();
            int level=visited.get(t);
            if(t.left!=null&&!visited.containsKey(t.left)){
                q.add(t.left);
                visited.put(t.left,level+1);
            }if(t.right!=null&&!visited.containsKey(t.right)){
                q.add(t.right);
                visited.put(t.right,level+1);
            }
        if(parent.containsKey(t)&&!visited.containsKey(parent.get(t))){
            q.add(parent.get(t));
            visited.put(parent.get(t),level+1);
        }  
            max=Math.max(max,level);   
        }
    return max;
    }
}
```

## Approach 2 — 2024-11-30 13:18 (java)

*Runtime: 141 ms (faster than 7.7%) · Memory: 91.3 MB*

```java
class Solution {
    public void search(HashMap<TreeNode,TreeNode> p,TreeNode root,int s,Queue<TreeNode> q){
        if(root==null)return;
        if(root.val==s)q.add(root);
        if(root.left!=null)p.put(root.left,root);
        if(root.right!=null)p.put(root.right,root);
        search(p,root.left,s,q);
        search(p,root.right,s,q);
    }
    public int amountOfTime(TreeNode root, int start) {
        int level=0;
        HashMap<TreeNode,TreeNode> parent=new HashMap<>();//child,parent
        HashMap<TreeNode,Integer> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        search(parent,root,start,q);
        TreeNode infected=q.peek();
        visited.put(infected,0);
        while(!q.isEmpty()){
            TreeNode t=q.remove();
            level=visited.get(t);
            if(t.left!=null&&!visited.containsKey(t.left)){
                q.add(t.left);
                visited.put(t.left,level+1);
            }if(t.right!=null&&!visited.containsKey(t.right)){
                q.add(t.right);
                visited.put(t.right,level+1);
            }
        if(parent.containsKey(t)&&!visited.containsKey(parent.get(t))){
            q.add(parent.get(t));
            visited.put(parent.get(t),level+1);
        }  
            //max=Math.max(max,level);   
        }
    return level;
    }
}
```
