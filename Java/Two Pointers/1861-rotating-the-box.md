# 1861. Rotating the Box

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/rotating-the-box/
**Tags:** Array, Two Pointers, Matrix

## Approach 1 — 2026-05-06 13:13 (java)

*Runtime: 35 ms (faster than 6.2%) · Memory: 124.9 MB*

```java
class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] ans=new char[box[0].length][box.length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=box[box.length-1-j][i];
            }
        }
        for(int i=ans.length-1;i>=0;i--){
            for(int j=0;j<ans[0].length;j++){
                if(ans[i][j]=='#'||ans[i][j]=='*')continue;
                int idx=i;
                while(idx>=0){
                    if(ans[idx][j]=='*')break; 
                    if(ans[idx][j]=='#'){
                        ans[i][j]='#';
                        ans[idx][j]='.';
                        break;
                    } 
                    idx--;
                }
            }
        }
        return ans;
    }
}
```
