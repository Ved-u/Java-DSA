# 1436. Destination City

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/destination-city/
**Tags:** Array, Hash Table, String

## Approach 1 — 2024-11-08 22:52 (java)

*Runtime: 2 ms (faster than 99.8%) · Memory: 43.5 MB*

```java
class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> x:paths){
            map.put(x.get(0),x.get(1));
        }
        String ans=" ";
        for(var x:map.keySet()){
            if(map.get(map.get(x))==null)return map.get(x);
        }
    return ans;
    }
}
```
