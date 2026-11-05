# 1323. Maximum 69 Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-69-number/
**Tags:** Math, Greedy

## Approach 1 — 2024-01-26 15:10 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.7 MB*

```java
class Solution {
    public int maximum69Number (int num) {
        int arr[]=new int[4];
        int digits;
        int i=3;
        int ans=0;
        int mod=1;
        while(num>0){
            digits=num%10;
            arr[i]=digits;
            i--;
            num=num/10;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==6){
                arr[j]=9;
                break;
            }
        }
        for(int j=3;j>=0;j--){
            ans=ans+(mod*arr[j]);
            mod=mod*10;
        }
        return ans;
    }
}
```
