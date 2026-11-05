# 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
**Tags:** Math, Greedy

## Approach 1 — 2024-08-13 18:50 (java)

*Runtime: 3 ms (faster than 23.8%) · Memory: 41.6 MB*

```java
class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> fibo=new ArrayList<>();
        int first=0,second=1,next;
        while(first<=1000000002){
            fibo.add(first);
            next=first+second;
            first=second;
            second=next;
        }if(fibo.contains(k))return 1;
        int ans=0;
        while(k>0){
            for(int i=fibo.size()-1;i>=0;i--){
                if(fibo.get(i)<=k){
                    ans++;
                    k-=fibo.get(i);
                    break;
                }    
            }
        }
    return ans;    
    }
}
```
