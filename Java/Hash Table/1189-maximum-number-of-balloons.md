# 1189. Maximum Number of Balloons

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-number-of-balloons/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2026-06-22 09:45 (java)

*Runtime: 3 ms (faster than 73.6%) · Memory: 43 MB*

```java
class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[] = new int[26];
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)-'a']++;
        }
        int ans=0;
        while(freq['b'-'a']-->0&&freq['a'-'a']-->0&&freq['l'-'a']-->0&&freq['l'-'a']-->0&&freq['o'-'a']-->0&&freq['o'-'a']-->0&&freq['n'-'a']-->0)ans++;
        return ans;
    }
}
```
