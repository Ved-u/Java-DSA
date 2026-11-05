# 3005. Count Elements With Maximum Frequency

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-elements-with-maximum-frequency/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2024-03-11 11:09 (java)

*Runtime: 1 ms (faster than 99.7%) · Memory: 41.8 MB*

```java
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        for(int num : nums) {
            freq[num]++;
        }
        int max=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=max)max=freq[i];
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max)ans=ans+freq[i];
        }
        return ans;
    }
}
```

## Approach 2 — 2024-10-27 22:54 (java)

*Runtime: 3 ms (faster than 34.6%) · Memory: 41.9 MB*

```java
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        int max=0;
        for(var e:map.entrySet()){
            if(e.getValue()>max)max=e.getValue();
        }
        for(var e:map.entrySet()){
            if(e.getValue()==max)ans++;
        }
    return ans*max;
    }
}
```
