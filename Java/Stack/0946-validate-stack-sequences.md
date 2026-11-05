# 946. Validate Stack Sequences

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/validate-stack-sequences/
**Tags:** Array, Stack, Simulation

## Approach 1 — 2026-04-11 15:04 (java)

*Runtime: 2 ms (faster than 87.9%) · Memory: 46.2 MB*

```java
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int pu = 0, po = 0, n = pushed.length;
        while (pu < n && po < n) {
            st.push(pushed[pu++]);
            while(!st.isEmpty()&&st.peek() == popped[po]) {
                st.pop();
                po++;
            }
        }
        // if(pu<n)return false;
        while(po<n){
            if(st.pop()!=popped[po++])return false;
        }
        return true;
    }
}
```
