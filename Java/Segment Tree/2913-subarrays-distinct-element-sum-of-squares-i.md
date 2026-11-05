# 2913. Subarrays Distinct Element Sum of Squares I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/
**Tags:** Array, Hash Table, Binary Indexed Tree, Segment Tree

## Approach 1 — 2026-10-15 20:35 (java)

*Runtime: 101 ms · Memory: 46.4 MB*

```java
class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                HashSet<Integer> set = new HashSet<>();
                for(int k=i;k<=j;k++){
                    set.add(nums.get(k));
                }
                ans+=set.size()*set.size();
            }
        }
        return ans;
    }
}
```

## Approach 2 — 2026-10-15 20:36 (java)

*Runtime: 4 ms · Memory: 45 MB*

```java
class Solution {
    public int sumCounts(List<Integer> nums) {
        int result = 0;
        int n = nums.size(); 
        for(int i =0; i< n; i++) {
            int count = 0;
            boolean[] visited = new boolean[101];
            for(int j=i; j< n; j++) {
                int num = nums.get(j);
                if(!visited[num]) {
                    visited[num] = true;
                    count++;
                }
                result += count*count;
            }
            
        }
        return result;
    }
}
```
