# 4079. Prime Subset Selection I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/prime-subset-selection-i/
**Tags:** 

## Approach 1 — 2026-10-11 09:31 (java)

*Runtime: 503 ms · Memory: 48.2 MB*

```java
class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans = new ArrayList<>();
        int sum=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                sum+=i;
                if(sum<=s){
                    ans.add(i);
                }else break;
               
            }
        }
        return ans;
    }
    boolean isPrime(int n){
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
```

## Approach 2 — 2026-10-12 19:46 (java)

*Runtime: 493 ms · Memory: 48.1 MB*

```java
class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans = new ArrayList<>();
        int sum=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                sum+=i;
                if(sum<=s){
                    ans.add(i);
                }else break; 
            }
        }
        return ans;
    }
    boolean isPrime(int n){
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
```
