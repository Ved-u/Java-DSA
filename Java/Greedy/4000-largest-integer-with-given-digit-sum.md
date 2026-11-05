# 4000. Largest Integer With Given Digit Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/largest-integer-with-given-digit-sum/
**Tags:** Math, Greedy

## Approach 1 — 2026-07-27 11:11 (java)

*Runtime: 186 ms (faster than 5.5%) · Memory: 42.3 MB*

```java
class Solution {
    public int largestInteger(int n, int s) {
        int max = (int)Math.pow(10,n);
        int ans = -1;
        for(int i=0;i<max;i++){
            int num = i;
            int sum = 0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            if(sum == s)ans = i;
        }
        return ans;
    }
}
```
