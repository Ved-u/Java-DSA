# 2351. First Letter to Appear Twice

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/first-letter-to-appear-twice/
**Tags:** Hash Table, String, Bit Manipulation, Counting

## Approach 1 — 2026-07-19 10:29 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.9 MB*

```java
class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(set.contains(x))return x;
            set.add(x);
        }
        return '-';
    }
}
```
