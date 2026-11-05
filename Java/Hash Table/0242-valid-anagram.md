# 242. Valid Anagram

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/valid-anagram/
**Tags:** Hash Table, String, Sorting

## Approach 1 — 2024-11-14 20:44 (java)

*Runtime: 18 ms (faster than 14.9%) · Memory: 44.3 MB*

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=mapMaker(s);
        HashMap<Character,Integer> map2=mapMaker(t);
    return map1.equals(map2);
    }
    HashMap<Character,Integer> mapMaker(String y){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<y.length();i++){
            char x=y.charAt(i);
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
    return map;
    }
}
```

## Approach 2 — 2024-11-14 20:50 (java)

*Runtime: 15 ms (faster than 25.6%) · Memory: 44.7 MB*

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:s.toCharArray()){
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(char x:t.toCharArray()){
            if(map.containsKey(x))map.put(x,map.get(x)-1);
            else return false;
        }
        for(var x:map.keySet()){
            if(map.get(x)!=0)return false;
        }
    return true;
    }
}
```

## Approach 3 — 2024-11-14 20:53 (java)

*Runtime: 16 ms (faster than 22.7%) · Memory: 44.6 MB*

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:s.toCharArray()){
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(char x:t.toCharArray()){
            if(map.containsKey(x))map.put(x,map.get(x)-1);
            else return false;
            if(map.get(x)==0)map.remove(x);
        }
    return map.isEmpty();
    }
}
```

## Approach 4 — 2026-05-01 14:27 (java)

*Runtime: 18 ms (faster than 14.9%) · Memory: 46.8 MB*

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> maps=new HashMap<>();
        HashMap<Character,Integer> mapt=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(maps.get(x)==null)maps.put(x,1);
            else maps.put(x,maps.get(x)+1);
        }
        for(int i=0;i<t.length();i++){
            char x=t.charAt(i);
            if(mapt.get(x)==null)mapt.put(x,1);
            else mapt.put(x,mapt.get(x)+1);
        }
        for(char x:maps.keySet()){
            if(!maps.get(x).equals(mapt.get(x)))return false;
        }
        return true;
    }
}
```

## Approach 5 — 2024-10-26 15:36 (java)

*Runtime: 2 ms (faster than 99.6%) · Memory: 43.3 MB*

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int f1[]=new int[26];
        int f2[]=new int[26];
        for(char x:s.toCharArray()){
            f1[x-'a']++;
        }
        for(char x:t.toCharArray()){
            f2[x-'a']++;
        }
        for(int i=0;i<f1.length;i++){
            if(f1[i]!=f2[i])return false;
        }
    return true;
    }
}
```

## Approach 6 — 2024-11-14 20:31 (java)

*Runtime: 21 ms (faster than 8.1%) · Memory: 43.9 MB*

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map1.containsKey(s.charAt(i)))map1.put(s.charAt(i),1);
            else map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
        }
        for(int i=0;i<t.length();i++){
            if(!map2.containsKey(t.charAt(i)))map2.put(t.charAt(i),1);
            else map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
        }
    return map1.equals(map2);
    }
}
```

## Approach 7 — 2024-11-14 20:43 (java)

*Runtime: 16 ms (faster than 22.7%) · Memory: 44.9 MB*

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=mapMaker(s);
        HashMap<Character,Integer> map2=mapMaker(t);
    return map1.equals(map2);
    }
    HashMap<Character,Integer> mapMaker(String y){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:y.toCharArray()){
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
    return map;
    }
}
```
