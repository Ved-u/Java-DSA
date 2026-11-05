# 3838. Weighted Word Mapping

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/weighted-word-mapping/
**Tags:** Array, String, Simulation

## Approach 1 — 2026-03-07 20:10 (java)

*Runtime: 2 ms (faster than 96.8%) · Memory: 46.4 MB*

```java
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++){
            char x = (char) ('z' - weight(words[i],weights)%26);
            // x += 'a';
            ans.append(x);
        }
        return ans.toString();
    }
    int weight(String x, int[] w){
        int ans = 0;
        for(char y:x.toCharArray()){
            ans+=w[y-'a'];
        }
        return ans;
    }
}
```
