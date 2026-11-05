# 2843.   Count Symmetric Integers

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-symmetric-integers/
**Tags:** Math, Enumeration

## Approach 1 — 2024-08-09 22:39 (java)

*Runtime: 1493 ms (faster than 5.2%) · Memory: 44.8 MB*

```java
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++)
            if(isSymetric(i))ans++;
    return ans;    
    }
    public boolean isSymetric(int n){
        int count=0;
        int copy=n;
        while(n>0){
            count++;
            n/=10;
        }
        if(count%2==1)return false;
        count/=2;
        n=copy;
        copy=0;
        int sum=0;
        while(n>0){
            if(count>0)sum+=n%10;
            else copy+=n%10;
            count--;
            n/=10;
        }
        System.out.println(sum+" "+copy);
    return copy==sum;   
    }
}
```
