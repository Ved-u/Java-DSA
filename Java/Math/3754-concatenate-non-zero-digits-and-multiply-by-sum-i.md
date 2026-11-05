# 3754. Concatenate Non-Zero Digits and Multiply by Sum I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/
**Tags:** Math

## Approach 1 — 2025-11-23 08:09 (java)

*Runtime: 3 ms (faster than 18.9%) · Memory: 43.2 MB*

```java
class Solution {
    public long sumAndMultiply(int n) {
        long x=0,sum=0;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            if(n%10!=0){
            sum+=n%10;
            sb.append(""+n%10);
            }
            n/=10;
        }
        if(sb.length()==0)return 0;
        x=Long.parseLong(sb.reverse().toString());
        return x*sum;
    }
}
```

## Approach 2 — 2026-07-07 09:14 (java)

*Runtime: 4 ms (faster than 11.6%) · Memory: 42.5 MB*

```java
class Solution {
    public long sumAndMultiply(int n) {
        String str =""+n;
        StringBuilder num=new StringBuilder();
        int sum=0;
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x=='0')continue;
            num.append(x);
            sum+=x-'0';
        }
        if(num.isEmpty())return 0;
        return Long.parseLong(num.toString())*sum;
    }
}
```
