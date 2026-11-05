# 1528. Shuffle String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/shuffle-string/
**Tags:** Array, String

## Approach 1 — 2024-03-30 11:21 (java)

*Runtime: 1 ms (faster than 71.7%) · Memory: 44.4 MB*

```java
class Solution {
    public String restoreString(String s, int[] indices) {
        char[]ans=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ans[indices[i]]=s.charAt(i);
        }
    return new String(ans);    
    }
}
```

## Approach 2 — 2024-03-30 11:22 (java)

*Runtime: 1 ms (faster than 71.7%) · Memory: 44.2 MB*

```java
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++) result[indices[i]] = s.charAt(i);
        return new String(result);
    }
}
```
