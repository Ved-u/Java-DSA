# 2248. Intersection of Multiple Arrays

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/intersection-of-multiple-arrays/
**Tags:** Array, Hash Table, Sorting, Counting

## Approach 1 — 2024-03-11 17:10 (java)

*Runtime: 2 ms (faster than 99.9%) · Memory: 44.7 MB*

```java
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int freq[] = new int[1001];
        for(int i = 0; i < nums.length; i++){
            for(int j =0; j < nums[i].length; j++){
                freq[nums[i][j]]++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <  freq.length; i++){
            if(freq[i] == nums.length) ans.add(i);
        }
        return ans;
    }
}
```

## Approach 2 — 2024-03-11 17:23 (java)

*Runtime: 2 ms (faster than 99.9%) · Memory: 44.5 MB*

```java
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int count[]=new int[1001];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                count[nums[i][j]]++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<count.length;i++){
            if(count[i]==nums.length)ans.add(i);
        }
        return ans;
    }
}
```
