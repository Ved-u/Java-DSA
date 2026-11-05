# 1452. People Whose List of Favorite Companies Is Not a Subset of Another List

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/people-whose-list-of-favorite-companies-is-not-a-subset-of-another-list/
**Tags:** Array, Hash Table, String

## Approach 1 — 2026-05-30 18:28 (java)

*Runtime: 315 ms (faster than 58.6%) · Memory: 68.2 MB*

```java
class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<HashSet<String>> list = new ArrayList<>();
        for (List<String> companies : favoriteCompanies) 
            list.add(new HashSet<>(companies));
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean subset = false;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                if (list.get(j).size() < list.get(i).size())continue;
                if (list.get(j).containsAll(list.get(i))) {
                    subset = true;
                    break;
                }
            }
            if (!subset)ans.add(i);
        }
        return ans;
    }
}
```
