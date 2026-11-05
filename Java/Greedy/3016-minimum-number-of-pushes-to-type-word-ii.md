# 3016. Minimum Number of Pushes to Type Word II

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/
**Tags:** Hash Table, String, Greedy, Sorting, Counting

## Approach 1 — 2026-07-31 17:32 (java)

*Runtime: 94 ms (faster than 5.2%) · Memory: 48.1 MB*

```java
class Solution {
    class Pair{
        int freq;
        char x;
        public Pair(char x,int freq){
            this.x=x;
            this.freq=freq;
        }
    }
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<word.length();i++){
            if(map.get(word.charAt(i))==null)map.put(word.charAt(i),1);
            else map.put(word.charAt(i),map.get(word.charAt(i))+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        Pair[][] arr = new Pair[4][8];
        outer: for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                Map.Entry<Character,Integer> entry = list.get(ans);
                Pair p = new Pair(entry.getKey(),entry.getValue());
                arr[i][j] = p;
                ans++;
                if(ans==list.size())break outer;
            }
        }
        ans=0;
        outer: for(int i=1;i<=arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                Pair p = arr[i-1][j];
                if(p == null)break outer;
                ans+=p.freq*i;
            }
        }
        return ans;
    }
}
```
