# 1317. Convert Integer to the Sum of Two No-Zero Integers

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
**Tags:** Math

## Approach 1 — 2025-09-14 20:15 (java)

*Runtime: 15 ms (faster than 5.6%) · Memory: 43.4 MB*

```java
class Solution {
    public int[] getNoZeroIntegers(int n) {
        boolean num[]=new boolean[10002];
        int ans[]=new int[2];
        for(int i=1;i<n;i++){
            if(check(i))num[i]=true;
        }
        for(int i=0;i<num.length;i++){
            if(num[i]==true){
                if(num[n-i]){
                    ans[0]=i;
                    ans[1]=n-i;
                    return ans;
                }
            }
        }
        return ans;
    }
    public boolean check(int n){
        while(n>0){
            if(n%10==0)return false;
            n/=10;
        }
    return true;
    }
}
```

## Approach 2 — 2025-09-14 20:18 (java)

*Runtime: 14 ms (faster than 5.6%) · Memory: 43 MB*

```java
class Solution {
    public int[] getNoZeroIntegers(int n) {
        boolean num[]=new boolean[10000];
        int ans[]=new int[2];
        for(int i=1;i<n;i++){
            if(check(i))num[i]=true;
        }
        for(int i=0;i<num.length;i++){
            if(num[i]==true){
                if(num[n-i]){
                    ans[0]=i;
                    ans[1]=n-i;
                    return ans;
                }
            }
        }
        return ans;
    }
    public boolean check(int n){
        while(n>0){
            if(n%10==0)return false;
            n/=10;
        }
    return true;
    }
}
```

## Approach 3 — 2025-09-14 20:26 (java)

*Runtime: 13 ms (faster than 5.6%) · Memory: 42.6 MB*

```java
class Solution {
    public int[] getNoZeroIntegers(int n) {
        boolean num[]=new boolean[n];
        int ans[]=new int[2];
        for(int i=1;i<n;i++){
            if(check(i))num[i]=true;
        }
        for(int i=0;i<num.length;i++){
            if(num[i]==true){
                if(num[n-i]){
                    ans[0]=i;
                    ans[1]=n-i;
                    return ans;
                }
            }
        }
        return ans;
    }
    public boolean check(int n){
        while(n>0){
            if(n%10==0)return false;
            n/=10;
        }
    return true;
    }
}
```
