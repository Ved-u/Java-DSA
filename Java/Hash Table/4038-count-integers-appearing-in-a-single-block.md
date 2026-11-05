# 4038. Count Integers Appearing in a Single Block

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-integers-appearing-in-a-single-block/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2026-08-30 18:00 (java)

*Runtime: 1 ms · Memory: 43.5 MB*

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int freq[] = new int[101];
        for(int x:nums){
            freq[x]++;
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0)continue;
            int fp=-1,lp=-1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=i)continue;
                if(fp==-1)fp=j;
                lp=j;
            }
            if(lp-fp+1==freq[i])ans++;
        }
        return ans;
    }
}
```
