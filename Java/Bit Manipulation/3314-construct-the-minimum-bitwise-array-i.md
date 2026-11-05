# 3314. Construct the Minimum Bitwise Array I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/
**Tags:** Array, Bit Manipulation

## Approach 1 — 2026-03-25 21:43 (java)

*Runtime: 3 ms (faster than 59.2%) · Memory: 46.9 MB*

```java
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            ans[i]=val(nums.get(i));
        }
        return ans;
    }
    int val(int n){
        for(int i=0;i<n;i++){
            if((i|(i+1))==n)return i;
        }
        return -1;
    }
}
```
