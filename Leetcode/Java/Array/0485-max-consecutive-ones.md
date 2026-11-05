# 485. Max Consecutive Ones

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/max-consecutive-ones/
**Tags:** Array

## Approach 1 — 2024-03-07 22:40 (java)

*Runtime: 2 ms (faster than 98.5%) · Memory: 45.8 MB*

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ans++;
            }else{
                if(ans>temp){
                    temp=ans;  
                }
                ans=0;
            }
        }
        if(ans>temp)return ans;
        return temp;
    }
}
```
