# 3099. Harshad Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/harshad-number/
**Tags:** Math

## Approach 1 — 2024-04-01 17:51 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.3 MB*

```java
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int copy=x;
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        if(copy%sum==0)return sum;
    return -1;    
    }
}
```
