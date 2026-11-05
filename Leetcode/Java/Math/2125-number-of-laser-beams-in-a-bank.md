# 2125. Number of Laser Beams in a Bank

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
**Tags:** Array, Math, String, Matrix

## Approach 1 — 2024-04-26 13:54 (java)

*Runtime: 11 ms (faster than 88.7%) · Memory: 44.3 MB*

```java
class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int curRow;
        int lastRow=0;
        for(int i=0;i<bank.length;i++){
            String str=bank[i];
            curRow=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                   curRow++; 
                }
            }
            if(curRow>0){
                ans+=(curRow*lastRow);
                lastRow=curRow;
            }    
        }
    return ans;    
    }
}
```
