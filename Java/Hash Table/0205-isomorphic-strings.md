# 205. Isomorphic Strings

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/isomorphic-strings/
**Tags:** Hash Table, String

## Approach 1 — 2024-04-02 09:26 (java)

*Runtime: 70 ms (faster than 6.9%) · Memory: 42.4 MB*

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        ArrayList checkS=new ArrayList<>();
        ArrayList checkT=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!(checkS.contains(s.charAt(i))))checkS.add(s.charAt(i));
            if(!(checkT.contains(t.charAt(i))))checkT.add(t.charAt(i));
            if(checkS.indexOf(s.charAt(i))!=checkT.indexOf(t.charAt(i)))return false;
        }
    return true;      
    }
}
```

## Approach 2 — 2024-04-02 09:30 (java)

*Runtime: 6 ms (faster than 86.2%) · Memory: 42.3 MB*

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;

        int [] tempS = new int[127];
        int [] tempT = new int[127];
        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(tempS[charS] != tempT[charT])
                return false;

            tempS[charS] = i + 1;
            tempT[charT] = i + 1;
        }
        return true;
    }
}
```

## Approach 3 — 2024-11-15 09:46 (java)

*Runtime: 10 ms (faster than 62.3%) · Memory: 42 MB*

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            char y=t.charAt(i);
           if(map.containsKey(x)){
                if(map.get(x)!=y)return false;
           }else if(map.containsValue(y))return false;
           else map.put(x,y);
        }
    return true;
    }
}
```

## Approach 4 — 2024-11-15 10:06 (java)

*Runtime: 10 ms (faster than 62.3%) · Memory: 42.2 MB*

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            char y=t.charAt(i);
           if(map.containsKey(x)){
                if(map.get(x)!=y)return false;
           }else if(set.contains(y))return false;
           else {
            map.put(x,y);
            set.add(y);
           } 
        }
    return true;
    }
}
```

## Approach 5 — 2024-11-15 10:07 (java)

*Runtime: 11 ms (faster than 59.4%) · Memory: 42.7 MB*

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i); 
            if (map.containsKey(x)) {
                if (map.get(x) != y) return false; 
            } else {
                if (set.contains(y)) return false; 
                map.put(x, y);  
                set.add(y);     
            }
        }
    return true;
    }
}
```
