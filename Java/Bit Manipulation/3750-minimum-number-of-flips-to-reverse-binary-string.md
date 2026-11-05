# 3750. Minimum Number of Flips to Reverse Binary String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-number-of-flips-to-reverse-binary-string/
**Tags:** Math, Two Pointers, String, Bit Manipulation

## Approach 1 — 2025-11-22 20:10 (java)

*Runtime: 4 ms (faster than 18.9%) · Memory: 44 MB*

```java
class Solution {
    public int minimumFlips(int n) {
        int ans=0;
        String num=bin(n);
        String rev=new StringBuilder(num).reverse().toString();
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)!=rev.charAt(i))ans++;
        }
        return ans;
    }
    String bin(int n){
        StringBuilder s=new StringBuilder();
        while(n>0){
            s.append(""+n%2);
            n/=2;
        }
        return s.toString();
    }
}
```
