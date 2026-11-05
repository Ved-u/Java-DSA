# 3200. Maximum Height of a Triangle

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-height-of-a-triangle/
**Tags:** Array, Enumeration

## Approach 1 — 2024-09-02 21:48 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 40.6 MB*

```java
class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
       int ans=1,tRed=red,tBlue=blue,ans1=0,ans2=0;
       //red
       boolean check=true;
       while(red>=ans||blue>=ans){
            if(check){
                if(red>=ans)red-=ans;
                else break;
            }else{
                if(blue>=ans)blue-=ans;
                else break;
            }    
            check=!check;
            ans++;
            ans1++;
       }
       //blue
       red=tRed;
       blue=tBlue;
       check=false;
       ans=1;
        while(red>=ans||blue>=ans){
            if(check){
                if(red>=ans)red-=ans;
                else break;
            }else{
                if(blue>=ans)blue-=ans;
                else break;
            }    
            check=!check;
            ans++;
            ans2++;
       }
    return Math.max(ans1,ans2);
    }
}
```
