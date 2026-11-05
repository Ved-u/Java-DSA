# 1980. Find Unique Binary String

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-unique-binary-string/
**Tags:** Array, Hash Table, String, Backtracking

## Approach 1 — 2026-03-09 22:24 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.9 MB*

```java
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < nums.length; i++){
            if(nums[i].charAt(i) == '0')
                ans.append('1');
            else
                ans.append('0');
        }

        return ans.toString();
    }
}
```
