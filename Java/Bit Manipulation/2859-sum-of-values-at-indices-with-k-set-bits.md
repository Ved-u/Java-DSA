# 2859. Sum of Values at Indices With K Set Bits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/
**Tags:** Array, Bit Manipulation

## Approach 1 — 2024-07-06 10:00 (java)

*Runtime: 3 ms (faster than 13.4%) · Memory: 44.4 MB*

```java
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            int temp=i,count=0;
            while(temp>0){
                if(temp%2==1)count++;
                temp/=2;
            }
            if(count==k)ans+=nums.get(i);
        }
    return ans;    
    }
}
```
