# 1047. Remove All Adjacent Duplicates In String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
**Tags:** String, Stack

## Approach 1 — 2024-06-21 21:28 (java)

*Runtime: 5 ms (faster than 98.0%) · Memory: 44.4 MB*

```java
class Solution {
    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        int slow = 0;
        for (int fast = 0; fast < s.length(); fast++) {
            chars[slow] = chars[fast];
            if (slow > 0 && chars[slow] == chars[slow - 1]) slow -= 2;
        slow++;
        }
    return new String(chars, 0, slow);
    }
}
```

## Approach 2 — 2024-06-21 21:34 (java)

*Runtime: 13 ms (faster than 80.7%) · Memory: 44.9 MB*

```java
class Solution {
    public String removeDuplicates(String s) {
    StringBuilder sb = new StringBuilder();
    int sl = s.length();
    for(int i=0;i<sl;i++)
        if(sb.length()>0&&sb.charAt(sb.length()-1)==s.charAt(i))
            sb.deleteCharAt(sb.length()-1); 
        else sb.append(s.charAt(i));
    return sb.toString();
    }
}
```
