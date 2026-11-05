# 3541. Find Most Frequent Vowel and Consonant

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2025-09-14 19:40 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42.5 MB*

```java
class Solution {
    public int maxFreqSum(String s) {
        int vowel[]=new int[26];
        int conso[]=new int[26];
        for(char x:s.toCharArray()){
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                vowel[x-'a']++;
            }else{
                conso[x-'a']++;
            }
        }
        int maxV=0;
        int maxC=0;
        for(int i=0;i<vowel.length;i++){
            maxV=Math.max(maxV,vowel[i]);
        }
        for(int i=0;i<conso.length;i++){
            maxC=Math.max(maxC,conso[i]);
        }
        return maxV+maxC;
    }
}
```
