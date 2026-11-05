# 3852. Smallest Pair With Different Frequencies

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/smallest-pair-with-different-frequencies/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2026-03-17 16:48 (java)

*Runtime: 6 ms (faster than 59.1%) · Memory: 47.3 MB*

```java
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int ans[] = {-1,-1};
        int freq[]=new int[101];
        for(int x:nums){
            freq[x]++;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    if(freq[nums[i]]!=freq[nums[j]]){
                        ans[0]=nums[i];
                        ans[1]=nums[j];
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
```
