# 2894. Divisible and Non-divisible Sums Difference

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
**Tags:** Math

## Approach 1 — 2024-01-25 11:23 (java)

*Runtime: 1 ms (faster than 93.9%) · Memory: 40.7 MB*

```java
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num2=num2+i;
            }else{
                num1=num1+i;
            }
        }return num1-num2;
    }
}
```
