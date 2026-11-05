# 46. Permutations

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/permutations/
**Tags:** Array, Backtracking

## Approach 1 — 2024-11-19 20:15 (java)

*Runtime: 1 ms (faster than 88.9%) · Memory: 44.5 MB*

```java
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] check=new boolean[nums.length];
        helper(nums,ds,ans,check);
    return ans;
    }
    public void helper(int nums[],List<Integer> ds,List<List<Integer>> ans,boolean[] check){
        if(ds.size()==nums.length){
            List<Integer> temp=new ArrayList<>(ds);
            ans.add(temp);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(check[i]==false){
                check[i]=true;
                ds.add(nums[i]);
                helper(nums,ds,ans,check);
                check[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}
```

## Approach 2 — 2024-11-19 20:44 (java)

*Runtime: 1 ms (faster than 88.9%) · Memory: 44.1 MB*

```java
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,ans,0);
    return ans;
    }
    public void helper(int nums[],List<List<Integer>> ans,int idx){
        if(idx==nums.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int x:nums){
                temp.add(x);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
                swap(nums,i,idx);
                helper(nums,ans,idx+1);
                swap(nums,i,idx);
        }
    }
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
```
