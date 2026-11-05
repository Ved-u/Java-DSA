# 884. Uncommon Words from Two Sentences

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/uncommon-words-from-two-sentences/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2024-06-28 19:27 (java)

*Runtime: 2 ms (faster than 99.6%) · Memory: 41.9 MB*

```java
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> ans=new ArrayList<>();
       String str[]=s1.split(" ");
       String str2[]=s2.split(" ");   
       for(int i=0;i<str.length;i++){
        if((!exist(str,str[i],i))&&(!existOther(str2,str[i])))
            ans.add(str[i]);
       }
       for(int i=0;i<str2.length;i++){
        if((!exist(str2,str2[i],i))&&(!existOther(str,str2[i])))
            ans.add(str2[i]);
       }
    return ans.toArray(new String[0]); 
    }
    public static boolean exist(String arr[],String str,int indx){
        for(int i=0;i<arr.length;i++){
            if(i==indx)continue;
            if(arr[i].equals(str))return true;
        }    
    return false;
    }
    public static boolean existOther(String arr[],String str){
        for(int i=0;i<arr.length;i++)
            if(arr[i].equals(str))return true;
    return false;
    }
}
```
