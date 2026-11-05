# 3591. Check if Any Element Has Prime Frequency

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-any-element-has-prime-frequency/
**Tags:** Array, Hash Table, Math, Counting, Number Theory

## Approach 1 — 2026-04-16 12:06 (java)

*Runtime: 1 ms (faster than 97.0%) · Memory: 44.4 MB*

```java
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int freq[]=new int[101];
        for(int x:nums)
            freq[x]++;
        for(int x:freq){
            if(x>1&&isPrime(x))return true;
        }
        return false;
    }
    boolean isPrime(int x){
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)return false;
        }
        return true;
    }
}
```
