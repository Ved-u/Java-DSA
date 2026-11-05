# 1342. Number of Steps to Reduce a Number to Zero

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
**Tags:** Math, Bit Manipulation

## Approach 1 — 2024-10-01 14:33 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.5 MB*

```java
class Solution {
    public int numberOfSteps(int num) {
        int ans=0;
        while(num>0){
            if(num%2==0)num/=2;
            else num--;
            ans++;
        }
    return ans;
    }
}
```
