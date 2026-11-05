# 2785. Sort Vowels in a String

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/sort-vowels-in-a-string/
**Tags:** String, Sorting

## Approach 1 — 2024-04-26 14:44 (java)

*Runtime: 41 ms (faster than 63.7%) · Memory: 49.5 MB*

```java
import java.util.*;
class Solution {
    public String sortVowels(String s) {
        char[] temp = s.toCharArray();
        List<Integer> vowelIndices = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            char ch = Character.toLowerCase(temp[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelIndices.add(i);
                vowels.add(temp[i]);
            }
        }
        Collections.sort(vowels);
        for (int i = 0; i < vowelIndices.size(); i++) {
            temp[vowelIndices.get(i)] = vowels.get(i);
        }
        return new String(temp);
    }
}
```

## Approach 2 — 2024-04-26 14:48 (java)

*Runtime: 41 ms (faster than 63.7%) · Memory: 49.5 MB*

```java
import java.util.*;
class Solution {
    public String sortVowels(String s) {
        char[] ans = s.toCharArray();
        List<Integer> vowelIndx = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            char ch = Character.toLowerCase(ans[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelIndx.add(i);
                vowels.add(ans[i]);
            }
        }
        Collections.sort(vowels);
        for (int i = 0; i < vowelIndx.size(); i++) {
            ans[vowelIndx.get(i)] = vowels.get(i);
        }
        return new String(ans);
    }
}
```
