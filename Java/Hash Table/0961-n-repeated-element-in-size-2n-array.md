# 961. N-Repeated Element in Size 2N Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
**Tags:** Array, Hash Table, Pigeonhole Principle

## Approach 1 — 2026-01-11 22:52 (java)

*Runtime: 3 ms (faster than 39.1%) · Memory: 47.1 MB*

```java
class Solution {
    public int repeatedNTimes(int[] nums) {
        int freq[]=new int[10000];
        for(int x:nums){
            freq[x]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==nums.length/2)return i;
        }
        return -1;
    }
}
```
