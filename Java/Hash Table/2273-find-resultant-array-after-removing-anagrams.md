# 2273. Find Resultant Array After Removing Anagrams

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/
**Tags:** Array, Hash Table, String, Sorting

## Approach 1 — 2025-10-13 22:39 (java)

*Runtime: 3 ms (faster than 63.7%) · Memory: 44.6 MB*

```java
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        for (String x : words) {
            ans.add(x);
        }
        while (true) {
            boolean flag = false;
            for (int i = 1; i < ans.size(); i++) {
                if (ans.size() == 1)
                    break;
                if (isAnagram(ans.get(i), ans.get(i - 1))) {
                    ans.remove(i);
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        return ans;
    }

    boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        int[] freq = new int[26]; // 26 letters for 'a' to 'z'

        // Increment counts for 'a'
        for (char ch : a.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Decrement counts for 'b'
        for (char ch : b.toCharArray()) {
            freq[ch - 'a']--;
        }

        // If all counts are zero, it's an anagram
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
```
