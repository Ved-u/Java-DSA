# 1360. Number of Days Between Two Dates

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-days-between-two-dates/
**Tags:** Math, String

## Approach 1 — 2026-10-29 15:59 (java)

*Runtime: 2 ms · Memory: 42.4 MB*

```java
class Solution {
    static int[] monDays={0,31,59,90,120,151,181,212,243,273,304,334};
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(absDays(date1)-absDays(date2));
    }
    int absDays(String date){
        String arr[] = date.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);
        int ans=0;
        for(int i=1971;i<year;i++){
            if(isLeapYear(i))ans+=366;
            else ans+=365;
        }
        if(month>2&&isLeapYear(year))ans+=monDays[month-1]+1;
        else ans+=monDays[month-1];
        ans+=day;
        return ans;
    }
    boolean isLeapYear(int year){
        if(year%4==0&&(year%400==0||year%100!=0))return true;
        return false;
    }
}
```
