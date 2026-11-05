# 3913. Sort Vowels by Frequency

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/sort-vowels-by-frequency/
**Tags:** String, Sorting, Counting

## Approach 1 — 2026-04-26 11:13 (java)

*Runtime: 32 ms (faster than 49.1%) · Memory: 49.5 MB*

```java
class Solution {
    public String sortVowels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        List<Integer> vowelIdx=new ArrayList<>();
        List<Character> fo=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            sb.append(x);
            if(isVowel(x)==false)continue;
            vowelIdx.add(i);
            if(fo.indexOf(x)==-1)fo.add(x);
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        List<Character> list=new ArrayList<>();
        Collections.sort(fo,(a,b)->{
            if(map.get(a).equals(map.get(b))){
                return 0;
            }
            return map.get(b)-map.get(a);
        });
        for(char x:fo){
            for(int i=1;i<=map.get(x);i++){
                list.add(x);
            }
        }
        int idx=0;
        for(int i=0;i<vowelIdx.size();i++){
            sb.setCharAt(vowelIdx.get(i),list.get(idx++));
        }
        return sb.toString();
    }
    boolean isVowel(char x){
        return x=='a'||x=='e'||x=='i'||x=='o'||x=='u';
    }
}
```
