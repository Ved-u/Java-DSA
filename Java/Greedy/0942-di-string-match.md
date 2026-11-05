# 942. DI String Match

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/di-string-match/
**Tags:** Array, Two Pointers, String, Greedy

## Approach 1 — 2024-05-29 18:38 (java)

*Runtime: 3 ms (faster than 48.3%) · Memory: 45.5 MB*

```java
class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int left = 0, right = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') 
                ans[i] = left++;
             else 
                ans[i] = right--;  
        }
        ans[s.length()] = left; 
    return ans;
    }
}
```
