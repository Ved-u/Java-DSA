# 2409. Count Days Spent Together

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-days-spent-together/
**Tags:** Math, String

## Approach 1 — 2026-10-24 14:58 (java)

*Runtime: 1 ms · Memory: 42.6 MB*

```java
class Solution {
    static int[] monDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int aa,al,ba,bl;
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int ans=0;
        aa = getAbsoluteDay(arriveAlice);
        al = getAbsoluteDay(leaveAlice);
        ba = getAbsoluteDay(arriveBob);
        bl = getAbsoluteDay(leaveBob);
        int start = Math.min(aa,ba);
        int end = Math.max(bl,al);
        for(int i=start;i<=end;i++){
            if(isAliceInLondon(i)&&isBobInLondon(i))ans++;
        }
        return ans;
    }
    private boolean isAliceInLondon(int day){
        if(aa<=day&&day<=al)return true;
        return false;
    }
    private boolean isBobInLondon(int day){
        if(ba<=day&&day<=bl)return true;
        return false;
    }
    private int getAbsoluteDay(String x){
        int ans=0;
        String arr[] = x.split("-");
        int month = Integer.parseInt(arr[0])-1;
        ans += Integer.parseInt(arr[1]);
        for(int i=0;i<month;i++){
            ans+=monDays[i];
        }
        return ans;
    }
}
```

## Approach 2 — 2026-10-24 15:05 (java)

*Runtime: 0 ms · Memory: 42.3 MB*

```java
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] arr={0,31,59,90,120,151,181,212,243,273,304,334};
        int aa=arr[Integer.valueOf(arriveAlice.substring(0,2))-1]+Integer.valueOf(arriveAlice.substring(3,5));
        int la=arr[Integer.valueOf(leaveAlice.substring(0,2))-1]+Integer.valueOf(leaveAlice.substring(3,5));
        int ab=arr[Integer.valueOf(arriveBob.substring(0,2))-1]+Integer.valueOf(arriveBob.substring(3,5));
        int lb=arr[Integer.valueOf(leaveBob.substring(0,2))-1]+Integer.valueOf(leaveBob.substring(3,5));
        int start=Math.max(aa,ab);
        int end=Math.min(la,lb);
        return Math.max(0,end-start+1);
    }
}
```
