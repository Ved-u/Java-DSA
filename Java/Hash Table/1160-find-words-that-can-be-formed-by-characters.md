# 1160. Find Words That Can Be Formed by Characters

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
**Tags:** Array, Hash Table, String, Counting

## Approach 1 — 2024-06-28 12:23 (java)

*Runtime: 5 ms (faster than 93.0%) · Memory: 45.1 MB*

```java
class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        int charsFreq[]=new int[26];
        int stringFreq[];
        for(char x:chars.toCharArray())
            charsFreq[x-'a']++;
        for(String x:words){
            stringFreq=new int[26];
            for(char y:x.toCharArray())
                stringFreq[y-'a']++;
            boolean check=true;    
            for(int i=0;i<charsFreq.length;i++){
                if(charsFreq[i]<stringFreq[i]){
                    check=false;
                    break;
                }
            }
            if(check)ans+=x.length();
        }  
    return ans;      
    }
}
```

## Approach 2 — 2024-06-28 12:28 (java)

*Runtime: 6 ms (faster than 89.2%) · Memory: 45 MB*

```java
class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        int charsFreq[]=new int[26];
        for(int i=0;i<chars.length();i++)
            charsFreq[chars.charAt(i)-'a']++;
        for(int i=0;i<words.length;i++){
            int stringFreq[]=new int[26];
            for(int j=0;j<words[i].length();j++)
            stringFreq[words[i].charAt(j)-'a']++;
            boolean check=true;    
            for(int j=0;j<charsFreq.length;j++){
                if(charsFreq[j]<stringFreq[j]){
                    check=false;
                    break;
                }
            }
            if(check)ans+=words[i].length();
        }  
    return ans;      
    }
}
```
