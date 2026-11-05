# 2652. Sum Multiples

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-multiples/
**Tags:** Math

## Approach 1 — 2024-01-25 11:47 (java)

*Runtime: 3 ms (faster than 93.8%) · Memory: 41 MB*

```java
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
       for(int i=1;i<=n;i++){
           if(i%3==0||i%5==0||i%7==0){
               sum+=i;
           }
       }
        return sum;
    }
}
```

## Approach 2 — 2024-01-25 11:47 (java)

*Runtime: 2 ms (faster than 96.8%) · Memory: 41.2 MB*

```java
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
       for(int i=3;i<=n;i++){
           if(i%3==0||i%5==0||i%7==0){
               sum+=i;
           }
       }
        return sum;
    }
}
```
