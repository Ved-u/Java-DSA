# 451. Sort Characters By Frequency

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/sort-characters-by-frequency/
**Tags:** Hash Table, String, Sorting, Heap (Priority Queue), Bucket Sort, Counting

## Approach 1 — 2026-04-17 23:51 (java)

*Runtime: 15 ms (faster than 54.8%) · Memory: 46.6 MB*

```java
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(map.get(x)==null)map.put(x,1);
            else map.put(x,map.get(x)+1);
        }
        StringBuilder ans=new StringBuilder();
        while(true){
            int max=0;
            char ch='-';
            for(Character x:map.keySet()){
                if(map.get(x)>max){
                    max=map.get(x);
                    ch=x;
                }
            }
            if(ch=='-')break;
            while(max>0){
                ans.append(ch);
                max--;
            }
            map.remove(ch);
        }
        return ans.toString();
    }
}
```
