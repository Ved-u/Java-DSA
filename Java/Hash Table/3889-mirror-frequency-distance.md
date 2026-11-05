# 3889. Mirror Frequency Distance

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/mirror-frequency-distance/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2026-04-05 22:25 (java)

*Runtime: 394 ms (faster than 5.3%) · Memory: 65.5 MB*

```java
class Solution {
    public int mirrorFrequency(String s) {
        int ans=0;
        StringBuilder m=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            m.append(mirror(x));
        }
        HashMap<Character,Integer> maps=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(maps.containsKey(x))maps.put(x,maps.get(x)+1);
            else maps.put(x,1);
        }
        HashSet<Character> set=new HashSet<>();
        for(Character x:maps.keySet()){
            if(set.contains(x))continue;
            char y=mirror(x);
            if(maps.get(y)==null)ans+=maps.get(x);
            else ans+=Math.abs(maps.get(x)-maps.get(y));
            set.add(y);
        }
        return ans;
    }
    char mirror(char x) {
        if (Character.isDigit(x)) return (char) ('0' + ('9' - x)); 
        return (char) ('a' + ('z' - x));
    }
}
```

## Approach 2 — 2026-04-05 22:27 (java)

*Runtime: 255 ms (faster than 17.7%) · Memory: 68.5 MB*

```java
class Solution {
    public int mirrorFrequency(String s) {
        int ans=0;
        // StringBuilder m=new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     char x=s.charAt(i);
        //     m.append(mirror(x));
        // }
        HashMap<Character,Integer> maps=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(maps.containsKey(x))maps.put(x,maps.get(x)+1);
            else maps.put(x,1);
        }
        HashSet<Character> set=new HashSet<>();
        for(Character x:maps.keySet()){
            if(set.contains(x))continue;
            char y=mirror(x);
            if(maps.get(y)==null)ans+=maps.get(x);
            else ans+=Math.abs(maps.get(x)-maps.get(y));
            set.add(y);
        }
        return ans;
    }
    char mirror(char x) {
        if (Character.isDigit(x)) return (char) ('0' + ('9' - x)); 
        return (char) ('a' + ('z' - x));
    }
}
```
