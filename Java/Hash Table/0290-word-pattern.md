# 290. Word Pattern

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/word-pattern/
**Tags:** Hash Table, String

## Approach 1 — 2026-04-01 18:34 (java)

*Runtime: 1 ms (faster than 86.5%) · Memory: 42.8 MB*

```java
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set=new HashSet<>();
        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length)return false;
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arr[i]))return false;
            }else if(set.contains(arr[i])){
                return false;
            }
            else{
                map.put(pattern.charAt(i),arr[i]);
            }
            set.add(arr[i]);
        }
        return true;
    }
}
```
