# 7. Reverse Integer

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/reverse-integer/
**Tags:** Math

## Approach 1 — 2024-02-20 22:32 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
class Solution {
    public int reverse(int x) {
        int temp=Math.abs(x);
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int digits;
        int mod;
        long ans=0;
        while(temp>0){
            digits=temp%10;
            ans=ans*10+digits;
            temp=temp/10;
        }
       if(ans<min||ans>max)return 0;
        if(x<0) ans=-ans;
        return (int)ans;
    }
}
```
