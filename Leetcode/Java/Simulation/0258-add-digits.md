# 258. Add Digits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/add-digits/
**Tags:** Math, Simulation, Number Theory

## Approach 1 — 2025-12-06 10:23 (java)

*Runtime: 1 ms (faster than 98.8%) · Memory: 42.5 MB*

```java
class Solution {
    public int addDigits(int num) {
        int digits=0,sum=0;
        while(num>0){
            sum+=num%10;
            digits++;
            num/=10;
        }
        if(digits<=1)return sum;
        return addDigits(sum);
    }
}
```
