# 1422. Maximum Score After Splitting a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-score-after-splitting-a-string/
**Tags:** String, Prefix Sum

## Approach 1 — 2024-08-14 23:38 (java)

*Runtime: 8 ms (faster than 12.3%) · Memory: 45.2 MB*

```java
class Solution {
    public int maxScore(String s) {
        int ans=0;
        for(int i=1;i<s.length();i++){
ans=Math.max(ans,score(s.substring(0,i),s.substring(i,s.length())));
        }
    return ans;    
    }
    public int score(String s,String str){
        int ans=0;
        for(char x:s.toCharArray()){
            if(x=='0')ans++;
        }for(char x:str.toCharArray()){
            if(x=='1')ans++;
        }
    return ans;    
    }
}
```
