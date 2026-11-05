# 3926. Count Valid Word Occurrences

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-valid-word-occurrences/
**Tags:** Array, Hash Table, String, Counting

## Approach 1 — 2026-05-28 19:45 (java)

*Runtime: 778 ms (faster than 5.1%) · Memory: 130.1 MB*

```java
class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        int[] ans = new int[queries.length];
        StringBuilder sb = new StringBuilder();
        for(String x: chunks){
            sb.append(x);
        } 
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='-'){
                if(i-1>=0&&i+1<sb.length()&&Character.isLetter(sb.charAt(i-1))&&Character.isLetter(sb.charAt(i+1)))continue;
                else sb.setCharAt(i,' ');
            }
        } 
        String arr[]=sb.toString().split(" ");
        for(String x:arr){
            x=x.trim();
            if(x.equals(""))continue;
            System.out.println(x);
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }  
        for(int i=0;i<ans.length;i++){
            if(map.containsKey(queries[i]))ans[i]=map.get(queries[i]);
            else ans[i]=0;
        }
        return ans;
    }
}
```
