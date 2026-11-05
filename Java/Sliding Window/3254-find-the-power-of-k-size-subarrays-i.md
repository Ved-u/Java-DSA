# 3254. Find the Power of K-Size Subarrays I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/
**Tags:** Array, Sliding Window

## Approach 1 — 2024-08-17 20:12 (java)

*Runtime: 2 ms (faster than 62.7%) · Memory: 45.4 MB*

```java
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        int left=0,right=left+k-1;
        int count=0;
        while(right<nums.length){
            ans[count++]=power(nums,left++,right++);
        }
    return ans;
    }
    public int power(int num[],int left,int right){
        int ans=num[left];
        for(int i=left+1;i<=right;i++){
            if(num[i]>ans)ans=num[i];
            if(num[i]!=num[i-1]+1)return -1;
        }
    return ans;
    }
}
```
