# 1876. Substrings of Size Three with Distinct Characters

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
**Tags:** Hash Table, String, Sliding Window, Counting

## Approach 1 — 2024-06-10 22:54 (java)

*Runtime: 1 ms (faster than 96.8%) · Memory: 41 MB*

```java
class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3)return 0;
        int ans=0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)!=s.charAt(i+1)&&s.charAt(i)!=s.charAt(i+2)&&
            s.charAt(i+1)!=s.charAt(i+2))ans++;
        }
    return ans;    
    }
}
```

## Approach 2 — 2024-06-10 22:55 (java)

*Runtime: 1 ms (faster than 96.8%) · Memory: 41.2 MB*

```java
class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int n = s.length();
        if (n < 3) return count;
        for (int i = 0; i <= n - 3; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);
            if (a != b && b != c && a != c)  count++;
        }
    return count;
    }
}
```
