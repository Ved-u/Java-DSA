# 2028. Find Missing Observations

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-missing-observations/
**Tags:** Array, Math, Simulation

## Approach 1 — 2024-09-05 23:04 (java)

*Runtime: 3 ms (faster than 100.0%) · Memory: 62.4 MB*

```java
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalSum = mean * (n + m);
        int observedSum = 0;
        
        for (int roll : rolls) {
            observedSum += roll;
        }
        
        int missingSum = totalSum - observedSum;
        
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }
        
        int base = missingSum / n;
        int remainder = missingSum % n;
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = base + (i < remainder ? 1 : 0);
        }
        
        return result;
    }
}
```

## Approach 2 — 2024-11-13 16:41 (java)

*Runtime: 2 ms (faster than 100.0%) · Memory: 60.4 MB*

```java
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = 0;
        for(int roll : rolls) {
            sum += roll;
        }
        int remainingSum = (m + n) * mean - sum;
        if(remainingSum > 6*n || remainingSum < n) return new int[] {};
        int base = remainingSum / n;
        int remainder = remainingSum % n;
        int[] result = new int[n];
        for(int i=0; i < remainder; i++) {
            result[i] = base + 1;
        }
        for(int i=remainder; i< n; i++) {
            result[i] = base;
        }
        return result;
    }
}
```
