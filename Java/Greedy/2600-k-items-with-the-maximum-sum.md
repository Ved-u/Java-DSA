# 2600. K Items With the Maximum Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/k-items-with-the-maximum-sum/
**Tags:** Math, Greedy

## Approach 1 — 2024-08-17 19:21 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 41.1 MB*

```java
class Solution {
    public int kItemsWithMaximumSum(int one, int zero, int nige, int k) {
        if(one>=k)return k;
        else if(one+zero>=k)return one;
    int ans=0;
    for(int i=1;i<=k;i++){
        if(one-->0)ans++;
        else if(zero-->0)ans+=0;
        else ans--;
    }
    return ans;
    }
}
```

## Approach 2 — 2024-08-17 19:22 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 40.9 MB*

```java
class Solution {
    public int kItemsWithMaximumSum(int numOnes,int numZeros,int numNegOnes,int k){
        if(k<=numOnes) return k;
        else if(k<=numOnes+numZeros) return numOnes;
    return numOnes+(k-numOnes-numZeros)*(-1);
    }
}
```
