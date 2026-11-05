# 13. Roman to Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/roman-to-integer/
**Tags:** Hash Table, Math, String

## Approach 1 — 2024-11-09 21:31 (java)

*Runtime: 6 ms (faster than 29.0%) · Memory: 44.6 MB*

```java
class Solution {
    public int romanToInt(String s) {
        // Map of Roman numeral symbols to values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = 0;
        // Traverse the string from left to right
        for (int i = 0; i < s.length(); i++) {
            // If current value is less than the next value, subtract it
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                ans -= map.get(s.charAt(i));
            } else {
                // Otherwise, add the current value
                ans += map.get(s.charAt(i));
            }
        }
    return ans;
    }
}
```
