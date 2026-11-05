# 2423. Remove Letter To Equalize Frequency

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/remove-letter-to-equalize-frequency/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2026-05-22 20:07 (java)

*Runtime: 1 ms (faster than 39.5%) · Memory: 43 MB*

```java
class Solution {
    public boolean equalFrequency(String word) {
        int freq[]=new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']--;
            if(equal(freq))return true;
            freq[word.charAt(i)-'a']++;            
        }
        return false;
    }
    boolean equal(int freq[]){
        HashSet<Integer> set=new HashSet<>();
        for(int x:freq){
            if(x>0)set.add(x);
        }
        if(set.size()==1)return true;
        return false;
    }
}
```
