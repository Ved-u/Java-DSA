# 501. Find Mode in Binary Search Tree

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-mode-in-binary-search-tree/
**Tags:** Tree, Depth-First Search, Binary Search Tree, Binary Tree

## Approach 1 — 2026-09-17 21:37 (java)

*Runtime: 12 ms · Memory: 46.5 MB*

```java
class Solution {
    HashMap<Integer,Integer> fillMapFromTree(TreeNode root){
        HashMap<Integer,Integer> freq = new HashMap<>();
        Queue<TreeNode> nodeQ = new ArrayDeque<>();
        nodeQ.offer(root);
        while(!nodeQ.isEmpty()){
           TreeNode curr = nodeQ.poll();
            if(curr.left!=null)nodeQ.add(curr.left);
            if(curr.right!=null)nodeQ.add(curr.right);
            int x = curr.val;
            if(freq.containsKey(x))freq.put(x,freq.get(x)+1);
            else freq.put(x,1);
        }
        return freq;
    } 
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> freq = fillMapFromTree(root);
        int max = Integer.MIN_VALUE;
        for(Integer x:freq.keySet()){
            max = Math.max(max,freq.get(x));
        }
        ArrayList<Integer> ansTemp = new ArrayList<>();
        for(Integer x:freq.keySet()){
            if(freq.get(x)==max)ansTemp.add(x);
        }
        int[] ans = new int[ansTemp.size()];
        for(int i=0;i<ans.length;i++)
            ans[i] = ansTemp.get(i);
        return ans;      
    }
}
```
