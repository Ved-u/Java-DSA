# 1154. Day of the Year

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/day-of-the-year/
**Tags:** Math, String

## Approach 1 — 2024-08-04 19:41 (java)

*Runtime: 7 ms (faster than 96.1%) · Memory: 44.8 MB*

```java
class Solution {
    public int dayOfYear(String date){
        int month=Integer.parseInt(date.substring(5,7));
        int year=Integer.parseInt(date.substring(0,4));
        int day=Integer.parseInt(date.substring(8,date.length()));
        int ans=0;
        if(month>2&&isLeapYear(year))ans++;
        ans+=day;
    if(month>1)ans+=31;
    if(month>2)ans+=28;
    if(month>3)ans+=31;
    if(month>4)ans+=30;
    if(month>5)ans+=31;
    if(month>6)ans+=30;
    if(month>7)ans+=31;
    if(month>8)ans+=31;
    if(month>9)ans+=30;
    if(month>10)ans+=31;
    if(month>11)ans+=30;
    return ans;    
    }
    public boolean isLeapYear(int year){
        if(year%4==0)
            if(year%100==0)return year%400==0;
            else return true;
        else return false;
    }
}
```
