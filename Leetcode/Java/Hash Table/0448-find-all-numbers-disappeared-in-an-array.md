# 448. Find All Numbers Disappeared in an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
**Tags:** Array, Hash Table

## Approach 1 — 2024-09-24 11:24 (java)

*Runtime: 3 ms (faster than 99.9%) · Memory: 54.8 MB*

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int freq[]=new int[nums.length+1];
        for(int x:nums){
            freq[x]++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(freq[i]==0)ans.add(i);
        }
    return ans;
    }
}
```
