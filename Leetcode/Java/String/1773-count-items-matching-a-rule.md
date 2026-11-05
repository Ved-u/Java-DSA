# 1773. Count Items Matching a Rule

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-items-matching-a-rule/
**Tags:** Array, String

## Approach 1 — 2024-04-16 08:28 (java)

*Runtime: 5 ms (faster than 34.9%) · Memory: 51.2 MB*

```java
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type")){
                if(items.get(i).get(0).equals(ruleValue)) ans++;
            }
            else if(ruleKey.equals("color")){
               if(items.get(i).get(1).equals(ruleValue))  ans++;
            }
            else if(ruleKey.equals("name")){
                if(items.get(i).get(2).equals(ruleValue)) ans++;
            }
        }
    return ans;    
    }
}
```
