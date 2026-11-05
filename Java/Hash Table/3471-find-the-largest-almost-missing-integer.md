# 3471. Find the Largest Almost Missing Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-largest-almost-missing-integer/
**Tags:** Array, Hash Table

## Approach 1 — 2026-08-18 11:33 (java)

*Runtime: 1 ms · Memory: 44.5 MB*

```java
class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans=-1;
        int freq[]=new int[51];
        for(int x:nums){
            freq[x]++;
        }
        if(k==1){
            for(int i=0;i<freq.length;i++){
                if(freq[i]==1){
                    ans=Math.max(ans,i);
                }
            }
        }else if(k==nums.length){
            for(int i=0;i<freq.length;i++){
                if(freq[i]>=1)ans=Math.max(ans,i);
            }
        }else{
            if(freq[nums[0]]==1&&freq[nums[nums.length-1]]==1){
                ans=Math.max(nums[0],nums[nums.length-1]);
            }else if(freq[nums[0]]==1){
                ans=nums[0];
            }
            else if(freq[nums[nums.length-1]]==1){
                ans=nums[nums.length-1];
            }
        }
        return ans;
    }
}
```
