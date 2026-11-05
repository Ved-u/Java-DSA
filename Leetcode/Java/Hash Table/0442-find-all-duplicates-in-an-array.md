# 442. Find All Duplicates in an Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-all-duplicates-in-an-array/
**Tags:** Array, Hash Table, Sorting

## Approach 1 — 2024-03-25 21:35 (java)

*Runtime: 6 ms (faster than 92.4%) · Memory: 53.2 MB*

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int count[]=new int[100001];
        for(int x:nums){
            count[x]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>1)ans.add(i);
        }
        return ans;
    }
}
```

## Approach 2 — 2024-03-25 21:36 (java)

*Runtime: 6 ms (faster than 92.4%) · Memory: 54.1 MB*

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int count[]=new int[100001];
        for(int x:nums){
            count[x]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==2)ans.add(i);
        }
        return ans;
    }
}
```

## Approach 3 — 2024-03-25 21:37 (java)

*Runtime: 3 ms (faster than 99.9%) · Memory: 55.3 MB*

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     List<Integer> res = new ArrayList<Integer>();
     int[]count = new int[nums.length+1];
     for(int freq : nums) 
            count[freq]++;

     for( int i =1 ; i <= nums.length ; i++)
    {
        if(count[i] == 2){
            res.add(i);
        }
     }
     return res;  
    }
}
```
