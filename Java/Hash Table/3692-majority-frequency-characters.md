# 3692. Majority Frequency Characters

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/majority-frequency-characters/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2025-12-10 07:39 (java)

*Runtime: 5 ms (faster than 55.8%) · Memory: 45.2 MB*

```java
class Solution {
    public String majorityFrequencyGroup(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        HashMap<Integer,List<Character>> map=new HashMap<>();
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0)continue;
            if(map.containsKey(freq[i])){
                char y=(char)('a'+i);
                List<Character> temp=map.get(freq[i]);
                //check char exists in list
                boolean flag=false;
                for(Character x:temp){
                    if(x.equals(y)){
                        flag=true;
                        break;
                    }
                }
                if(!flag)temp.add(y);
            }else{
                List<Character> temp = new ArrayList<>();
                char x=(char)('a'+i);
                temp.add(x);
                map.put(freq[i],temp);
            }
        }   
        //find max key 
        Integer size=0,max=0;
        for(var x:map.keySet()){
            List<Character> temp=map.get(x);
            if(size<temp.size()){
                max=x;
                size=temp.size();
            }
            else if(size==temp.size()){
                max=Math.max(max,x);
            }
        }
        List<Character> temp=map.get(max);
        String ans="";
        for(Character x:temp){
            ans = ans+x;
        }
        return ans;
    }
}
```
