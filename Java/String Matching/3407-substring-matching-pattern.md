# 3407. Substring Matching Pattern

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/substring-matching-pattern/
**Tags:** String, String Matching

## Approach 1 — 2026-03-30 17:16 (java)

*Runtime: 3 ms (faster than 27.1%) · Memory: 44.5 MB*

```java
class Solution {
    public boolean hasMatch(String s, String p) {
        String arr[] = p.split("\\*");

        if (arr.length == 0) return true;
        else if (arr.length == 1) return s.contains(arr[0]);

        if (arr[0].equals("") && arr[1].equals("")) return true;
        if (arr[1].equals("")) return s.contains(arr[0]);
        if (arr[0].equals("")) return s.contains(arr[1]);

        int idx = s.indexOf(arr[0]);
        if (idx == -1) return false;   // 🔥 critical fix

        String str = s.substring(idx + arr[0].length());
        return str.contains(arr[1]);
    }
}
```

## Approach 2 — 2026-03-30 17:17 (java)

*Runtime: 3 ms (faster than 27.1%) · Memory: 44.4 MB*

```java
class Solution {
    public boolean hasMatch(String s, String p) {
        String arr[]=p.split("\\*");
        if(arr.length==0)return true;
        else if(arr.length==1)return s.contains(arr[0]);
        if(arr[0].equals("")&&arr[1].equals(""))return true;
        if(arr[1].equals(""))return s.contains(arr[0]);
        if(arr[0].equals(""))return s.contains(arr[1]);
        int idx=s.indexOf(arr[0]);
        if (idx == -1) return false;  
        String str=s.substring(idx+arr[0].length());
    return str.contains(arr[1]);
    }
}
```
