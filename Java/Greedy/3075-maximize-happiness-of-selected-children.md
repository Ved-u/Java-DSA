# 3075. Maximize Happiness of Selected Children

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximize-happiness-of-selected-children/
**Tags:** Array, Greedy, Sorting

## Approach 1 — 2024-05-09 23:43 (java)

*Runtime: 35 ms (faster than 98.3%) · Memory: 61.8 MB*

```java
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       long ans=0;
       int count=0;
       Arrays.sort(happiness);
       for(int i=happiness.length-1;i>=(happiness.length-k);i--){
            if(happiness[i]-count<=0){
                ans+=0;
                count++;
            }else
                ans+=(happiness[i]-count++);
       }
    return ans;    
    }
}
```
