# 3866. First Unique Even Element

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/first-unique-even-element/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2026-03-17 16:42 (java)

*Runtime: 1 ms (faster than 98.1%) · Memory: 46.1 MB*

```java
class Solution {
    public int firstUniqueEven(int[] nums) {
        int freq[]=new int[101];
        for(int x:nums)freq[x]++;
        for(int x:nums){
            if(x%2==0&&freq[x]==1)return x;
        }
        return -1;
    }
}
```
