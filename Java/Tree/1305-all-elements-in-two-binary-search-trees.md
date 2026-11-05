# 1305. All Elements in Two Binary Search Trees

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
**Tags:** Tree, Depth-First Search, Binary Search Tree, Sorting, Binary Tree

## Approach 1 — 2024-12-01 13:16 (java)

*Runtime: 27 ms (faster than 5.9%) · Memory: 46.1 MB*

```java
class Solution {
     public List<Integer> morisInorder(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        while(root!=null){
            if(root.left!=null){
                TreeNode pred=root.left;
                while(pred.right!=null&&pred.right!=root)pred=pred.right;
                if(pred.right==null){
                    pred.right=root;
                    root=root.left;
                }else{
                    pred.right=null;
                    ans.add(root.val);
                    root=root.right;
                }
            }else{
                ans.add(root.val);
                root=root.right;
            }
        }
    return ans;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> al1=morisInorder(root1);
            List<Integer> al2=morisInorder(root2);
            for(int x:al2){
                al1.add(x);
            }
    Collections.sort(al1);
    return al1;
    }
}
```

## Approach 2 — 2024-12-01 13:18 (java)

*Runtime: 19 ms (faster than 24.8%) · Memory: 45.9 MB*

```java
class Solution {
     public void morisInorder(TreeNode root,List<Integer> ans) {
        while(root!=null){
            if(root.left!=null){
                TreeNode pred=root.left;
                while(pred.right!=null&&pred.right!=root)pred=pred.right;
                if(pred.right==null){
                    pred.right=root;
                    root=root.left;
                }else{
                    pred.right=null;
                    ans.add(root.val);
                    root=root.right;
                }
            }else{
                ans.add(root.val);
                root=root.right;
            }
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> ans=new ArrayList<>();
            morisInorder(root1,ans);
            morisInorder(root2,ans);
    Collections.sort(ans);
    return ans;
    }
}
```

## Approach 3 — 2024-12-01 13:29 (java)

*Runtime: 23 ms (faster than 8.4%) · Memory: 46.6 MB*

```java
class Solution {
     public List<Integer> morisInorder(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        while(root!=null){
            if(root.left!=null){
                TreeNode pred=root.left;
                while(pred.right!=null&&pred.right!=root)pred=pred.right;
                if(pred.right==null){
                    pred.right=root;
                    root=root.left;
                }else{
                    pred.right=null;
                    ans.add(root.val);
                    root=root.right;
                }
            }else{
                ans.add(root.val);
                root=root.right;
            }
        }
    return ans;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> al1=morisInorder(root1);
            List<Integer> al2=morisInorder(root2);
            List<Integer> ans=new ArrayList<>();
            int i=0,j=0;
            while(i<al1.size()||j<al2.size()){
                if(i>=al1.size()){
                    ans.add(al2.get(j++));
                    continue;
                }else if(j>=al2.size()){
                    ans.add(al1.get(i++));
                    continue;
                }else if(al1.get(i)<al2.get(j)){
                    ans.add(al1.get(i++));
                }else{
                    ans.add(al2.get(j++));
                }
            }
    return ans;
    }
}
```
