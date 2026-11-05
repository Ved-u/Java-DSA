# 2958. Length of Longest Subarray With at Most K Frequency

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
**Tags:** Array, Hash Table, Sliding Window

## Approach 1 — 2026-08-12 14:45 (java)

*Runtime: 75 ms · Memory: 94.2 MB*

```java
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans=0;
        int l=0,r=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(l<=r&&r<nums.length){
            if(map.containsKey(nums[r]))map.put(nums[r],map.get(nums[r])+1);
            else map.put(nums[r],1);
            if(map.get(nums[r])>k){
                do{
                    map.put(nums[l],map.get(nums[l])-1);
                    l++;
                }while(map.get(nums[r])>k);
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
```
