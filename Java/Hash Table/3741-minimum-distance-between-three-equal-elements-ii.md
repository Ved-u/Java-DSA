# 3741. Minimum Distance Between Three Equal Elements II

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/
**Tags:** Array, Hash Table

## Approach 1 — 2025-11-09 08:43 (java)

*Runtime: 126 ms (faster than 26.2%) · Memory: 276.1 MB*

```java
class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,Index> map=new HashMap<>();
        if(nums.length<3)return -1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                Index x=map.get(nums[i]);
                // if(x.i==-1)x.i=i;
                // else if(x.j==-1)x.j=i;
                // else if(x.k==-1)x.k=i;
                x.list.add(i);
                map.put(nums[i],x);
            }else{
                Index x=new Index();
                // x.i=i;
                // x.j=-1;
                // x.k=-1;
                x.list.add(i);
                map.put(nums[i],x);
            }
        }
        int min=Integer.MAX_VALUE;
        for(var x:map.keySet()){
            Index y=map.get(x);
           // if(y.i==-1||y.j==-1||y.k==-1)continue;
            int n=y.list.size();
            if(n<3)continue;
            Collections.sort(y.list);
            int i=0,j=1,k=2;
            while(k<n){
            min=Math.min(min,Math.abs(y.list.get(i)-y.list.get(j))+Math.abs(y.list.get(j)-y.list.get(k))+Math.abs(y.list.get(k)-y.list.get(i)));
                i++;j++;k++;
            }
        //min=Math.min(min,Math.abs(y.i-y.j)+Math.abs(y.j-y.k)+Math.abs(y.k-y.i));
        }
        if(min==Integer.MAX_VALUE)return -1;
        return min;
    }
}
class Index{
   // int i=-1,j=-1,k=-1;
    ArrayList<Integer> list=new ArrayList<>();
}
```

## Approach 2 — 2025-11-09 09:39 (java)

*Runtime: 122 ms (faster than 29.7%) · Memory: 275.6 MB*

```java
class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        if(nums.length<3)return -1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               ArrayList<Integer> list=map.get(nums[i]);
                list.add(i);
                map.put(nums[i],list);
            }else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        int min=Integer.MAX_VALUE;
        for(var x:map.keySet()){
           ArrayList<Integer> list=map.get(x);
            int n=list.size();
            if(n<3)continue;
            Collections.sort(list);
            int i=0,j=1,k=2;
            while(k<n){
            min=Math.min(min,Math.abs(list.get(i)-list.get(j))+Math.abs(list.get(j)-list.get(k))+Math.abs(list.get(k)-list.get(i)));
                i++;j++;k++;
            }
        }
        if(min==Integer.MAX_VALUE)return -1;
        return min;
    }
}
```
