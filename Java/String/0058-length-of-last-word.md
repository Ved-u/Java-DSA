# 58. Length of Last Word

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/length-of-last-word/
**Tags:** String

## Approach 1 — 2024-04-01 17:45 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.6 MB*

```java
class Solution {
    public int lengthOfLastWord(String s) {
       boolean check=false;
       int ans=0;
       for(int i=s.length()-1;i>=0;i--){
            if(check==true&&s.charAt(i)==' ')return ans;
            if(s.charAt(i)!=' '){
                check=true;
                ans++;
            }  
       }
    return ans;   
    }
}
```
