# 3. Longest Substring Without Repeating Characters

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/longest-substring-without-repeating-characters/
**Tags:** Hash Table, String, Sliding Window

## Approach 1 — 2025-06-14 10:58 (java)

*Runtime: 5 ms (faster than 98.2%) · Memory: 44.8 MB*

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int maxLen = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If character already seen and inside current window, move left
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);  // update latest index of character
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return (maxLen);
    }
}
```
