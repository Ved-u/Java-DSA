# 2798. Number of Employees Who Met the Target

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-employees-who-met-the-target/
**Tags:** Array

## Approach 1 — 2024-02-03 20:06 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.2 MB*

```java
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
      int emp=0;
      for(int i=0;i<hours.length;i++){
          if(hours[i]>=target){
              emp++;
          }
      }  
      return emp;
    }
}
```
