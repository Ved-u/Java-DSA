# 2788. Split Strings by Separator

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/split-strings-by-separator/
**Tags:** Array, String

## Approach 1 — 2024-06-10 23:24 (java)

*Runtime: 6 ms (faster than 89.8%) · Memory: 44.9 MB*

```java
class Solution {
  public List<String> splitWordsBySeparator(List<String> words, char sep){
    List<String> result = new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    for (String word : words) {
        sb.delete(0, sb.length());
        for(char x:word.toCharArray()){
            if(x!=sep)sb.append(x);
            else{
                if(sb.length()>0){
                result.add(sb.toString());
                sb.delete(0, sb.length());
                }
            }
        }
        if(sb.length()>0)
            result.add(sb.toString());
    }
    return result;
    }
}
```
