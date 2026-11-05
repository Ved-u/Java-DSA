# 1309. Decrypt String from Alphabet to Integer Mapping

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
**Tags:** String

## Approach 1 — 2024-05-09 13:57 (java)

*Runtime: 6 ms (faster than 6.5%) · Memory: 41.7 MB*

```java
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        char[] ch = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                ans.delete(ans.length() - 2, ans.length());
                String str = "" + s.charAt(i - 2) + s.charAt(i - 1);
                ans.append(ch[Integer.parseInt(str)]);
            } else {
                ans.append(ch[s.charAt(i) - '0']);
            }
        }
        return ans.toString();
    }
}
```

## Approach 2 — 2024-05-09 14:00 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int num;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)=='#'){
                num=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
                i-=2;
            }else num=s.charAt(i)-'0';
            sb.append((char)(num+96));
        }
        return sb.reverse().toString();
    }
}
```
