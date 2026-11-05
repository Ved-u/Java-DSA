# 2520. Count the Digits That Divide a Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-the-digits-that-divide-a-number/
**Tags:** Math

## Approach 1 — 2024-01-26 11:42 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
class Solution {
    public int countDigits(int num) {
        int divide=0;
        int digits;
        int num1=num;
        while(num1>0){
            digits=num1%10;
            if(num%digits==0){
                divide++;
            }
            num1=num1/10;
        }
        return divide;
    }
}
```
