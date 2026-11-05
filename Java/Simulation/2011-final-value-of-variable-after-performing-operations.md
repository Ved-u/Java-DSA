# 2011. Final Value of Variable After Performing Operations

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
**Tags:** Array, String, Simulation

## Approach 1 — 2024-03-28 10:24 (java)

*Runtime: 1 ms (faster than 84.3%) · Memory: 42.3 MB*

```java
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("++X") || operations[i].equals("X++")) {
                ans += 1;
            } else if(operations[i].equals("--X") || operations[i].equals("X--")) {
                ans -= 1;
            }
        }    
        return ans;  
    }
}
```

## Approach 2 — 2024-03-28 10:25 (java)

*Runtime: 1 ms (faster than 84.3%) · Memory: 42.6 MB*

```java
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("++X") || operations[i].equals("X++")) {
                ans++;
            } else if(operations[i].equals("--X") || operations[i].equals("X--")) {
                ans--;
            }
        }    
        return ans;  
    }
}
```
