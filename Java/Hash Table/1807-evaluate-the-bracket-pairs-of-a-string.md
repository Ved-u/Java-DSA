# 1807. Evaluate the Bracket Pairs of a String

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/
**Tags:** Array, Hash Table, String

## Approach 1 — 2026-09-26 10:30 (java)

*Runtime: 32 ms · Memory: 90.7 MB*

```java
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> x:knowledge){
            map.put(x.get(0),x.get(1));
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                int si=i+1;
                while(s.charAt(i)!=')')i++;
                String key=s.substring(si,i);
                if(map.get(key)==null)ans.append("?");
                else ans.append(map.get(key));
            }else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
```
