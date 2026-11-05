# 3289. The Two Sneaky Numbers of Digitville

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/
**Tags:** Array, Hash Table, Math

## Approach 1 — 2024-09-15 08:04 (java)

*Runtime: 1 ms (faster than 98.7%) · Memory: 44.8 MB*

```java
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[]=new int[2];
        int freq[]=new int[101];
        for(int x:nums){
            freq[x]++;
        }int indx=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2)ans[indx++]=i;
        }
    return ans;
    }
}
```
