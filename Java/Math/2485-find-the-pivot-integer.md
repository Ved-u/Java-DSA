# 2485. Find the Pivot Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-pivot-integer/
**Tags:** Math, Prefix Sum

## Approach 1 — 2024-02-25 20:09 (java)

*Runtime: 1 ms (faster than 79.1%) · Memory: 40.6 MB*

```java
class Solution {
    public int pivotInteger(int n) {
       if(n==1)return 1;
       int lsum=0;
       for(int i=1;i<=n;i++){
           lsum+=i;
       }int count=0;
       for(int i=1;i<=n;i++){
           count+=i;
           if(count==lsum)return i;
           lsum-=i;
       }
       return -1;
    }
}
```

## Approach 2 — 2024-03-13 19:51 (java)

*Runtime: 2 ms (faster than 27.1%) · Memory: 41.7 MB*

```java
class Solution {
    public int pivotInteger(int n) {
       if(n==1)return 1;
       int ans[]=new int[n+1];
       int temp[]=new int[n+1];
       int sum=0;
       for(int i=1;i<=n;i++){
        sum+=i;
        ans[i]=sum;
       }sum=0;
      // int count=1;
       for(int i=n;i>=1;i--){
        sum+=i;
        temp[i]=sum;
       }
       for(int i=1;i<=n;i++){
        if(ans[i]==temp[i])return i;
       }
       return -1;
    }
}
```
