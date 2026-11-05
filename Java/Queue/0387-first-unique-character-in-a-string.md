# 387. First Unique Character in a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/first-unique-character-in-a-string/
**Tags:** Hash Table, String, Queue, Counting

## Approach 1 — 2026-06-24 18:14 (java)

*Runtime: 47 ms (faster than 5.4%) · Memory: 47.4 MB*

```java
class Solution {
    public int firstUniqChar(String s) {//list 1st index fi 2nd index freq
        HashMap<Character,List<Integer>> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(map.containsKey(x))
                map.get(x).set(1,map.get(x).get(1)+1);
            else map.put(x,new ArrayList<>(Arrays.asList(i,1)));
        }
        for(char x: map.keySet()){
            if(map.get(x).get(1)==1)return map.get(x).get(0);
        }
        return -1;
    }
}
```
