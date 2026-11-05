# 2864. Maximum Odd Binary Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-odd-binary-number/
**Tags:** Math, String, Greedy

## Approach 1 — 2024-03-30 12:38 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 43.3 MB*

```java
class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] ans=new char[s.length()];
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count++;
        }
        if(count>0){
            ans[ans.length-1]='1';
            count--;
        }else ans[ans.length-1]='0';
        for(int i=0;i<ans.length-1;i++){
            if(count>0)ans[i]='1';
            else ans[i]='0';
        count--;    
        }
    return new String(ans);    
    }
}
```
