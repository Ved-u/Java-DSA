# 14. Longest Common Prefix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/longest-common-prefix/
**Tags:** Array, String, Trie

## Approach 1 — 2024-08-30 20:02 (java)

*Runtime: 1 ms (faster than 58.6%) · Memory: 41.8 MB*

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
    int left=0,right=strs[0].length()-1;
    String ans="";
    while(left<=right){
        boolean check=true;
        String str=strs[0].substring(left,right+1);
        for(String x:strs){
            if(x.indexOf(str)!=0){
                check=false;
                break;
            }
        }
        if(check)return str;
        right--;
      }
    return ans;  
    }
}
```

## Approach 2 — 2024-08-30 20:05 (java)

*Runtime: 1 ms (faster than 58.6%) · Memory: 41.5 MB*

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len = strs.length;
        int i = 0;
        String s = strs[0];
        String s1 = strs[len - 1];
        while (i < s.length() && i < s1.length()) {
            if (s.charAt(i) == s1.charAt(i)) i++;
            else break;
        }
    return strs[0].substring(0, i);
    }
}
```

## Approach 3 — 2026-05-01 14:56 (java)

*Runtime: 6 ms (faster than 5.4%) · Memory: 43.6 MB*

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        boolean flag=true;
        int idx=0;
        while(flag){
            if(idx>=strs[0].length())break;
            String str=ans.toString()+strs[0].charAt(idx++);
            for(String x:strs){
                if(x.indexOf(str)!=0){
                    flag=false;
                    break;
                }
            }
            if(flag)ans.append(str.charAt(str.length()-1));
        }
        return ans.toString();
    }
}
```
