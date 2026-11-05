# 3184. Count Pairs That Form a Complete Day I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2024-06-16 08:04 (java)

*Runtime: 1 ms (faster than 99.6%) · Memory: 42.4 MB*

```java
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int ans=0;
        for(int i=0;i<hours.length;i++){
            for(int j=i+1;j<hours.length;j++){
                if((hours[i]+hours[j])%24==0)ans++;
            }
        }
     return ans;   
    }
}
```
