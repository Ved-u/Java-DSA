# 2942. Find Words Containing Character

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-words-containing-character/
**Tags:** Array, String

## Approach 1 — 2024-02-04 10:44 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.8 MB*

```java
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        String check;
        for(int i=0;i<words.length;i++){
            check=words[i];
            for(int j=0;j<check.length();j++){
                if(check.charAt(j)==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
        
    }
}
```
