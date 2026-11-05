# 383. Ransom Note

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/ransom-note/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2025-12-11 08:33 (java)

*Runtime: 20 ms (faster than 7.4%) · Memory: 47.2 MB*

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mag=new HashMap<>();
        HashMap<Character,Integer> ransom=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char x=ransomNote.charAt(i);
            if(ransom.containsKey(x)){
                ransom.put(x,ransom.get(x)+1);
            }else{
                ransom.put(x,1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            char x=magazine.charAt(i);
            if(mag.containsKey(x)){
                mag.put(x,mag.get(x)+1);
            }else{
                mag.put(x,1);
            }
        }
        for(var x:ransom.keySet()){
            if(!mag.containsKey(x))return false;
            if(mag.get(x)<ransom.get(x))return false;
        }
        return true;
    }
}
```
