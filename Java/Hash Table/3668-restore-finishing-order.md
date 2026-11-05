# 3668. Restore Finishing Order

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/restore-finishing-order/
**Tags:** Array, Hash Table

## Approach 1 — 2025-09-03 21:06 (java)

*Runtime: 2 ms (faster than 63.7%) · Memory: 44.9 MB*

```java
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> a=new ArrayList<>();
        List<Integer> f =new ArrayList<>();
        for(int x:friends)f.add(x);
        for(int x:order){
            if(f.contains(x))a.add(x);
        }
        int ans[]=new int[a.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=a.get(i);
        }
        return ans;
    }
}
```

## Approach 2 — 2025-09-03 21:11 (java)

*Runtime: 3 ms (faster than 18.8%) · Memory: 45.4 MB*

```java
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> a=new ArrayList<>();
        List<Integer> f =new ArrayList<>();
        for(int x:friends)f.add(x);
        for(int x:order){
            if(Collections.binarySearch(f,x)>=0)a.add(x);
        }
        int ans[]=new int[a.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=a.get(i);
        }
        return ans;
    }
}
```
