# 2678. Number of Senior Citizens

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-senior-citizens/
**Tags:** Array, String

## Approach 1 — 2024-05-29 14:42 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.3 MB*

```java
class Solution {
    public int countSeniors(String[] details) {
        int ans=0,decade,year,age;
        for(String x:details){
            decade=(int)(x.charAt(11)-'0');
            year=(int)(x.charAt(12)-'0');
            age=(decade*10)+year;
            if(age>60)ans++;
        }
    return ans;    
    }
}
```
