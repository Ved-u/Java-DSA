# 4078. Three Fibonacci Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/three-fibonacci-sum/
**Tags:** 

## Approach 1 — 2026-10-11 08:18 (java)

*Runtime: 2 ms · Memory: 43.2 MB*

```java
class Solution {
    public boolean threeFibonacciSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        fibo(n,list);
        int l=0,r=l+2;
        while(r<list.size()){
            if(list.get(l)+list.get(l+1)+list.get(r)==n)return true;
            l++;r++;   
        }
        return false;
    }
    void fibo(int n,List<Integer> list){
        int first=0,second=1,next=-1;
        list.add(first);
        list.add(second);
        while(next<=n){
            next = first+second;
            first = second;
            second = next;
            list.add(next);
        }
    }
}
```
