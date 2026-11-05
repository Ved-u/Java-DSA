# 2404. Most Frequent Even Element

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/most-frequent-even-element/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2024-08-15 22:14 (java)

*Runtime: 25 ms (faster than 30.0%) · Memory: 44.2 MB*

```java
class Solution {
    public int mostFrequentEven(int[] nums) {
        boolean check=true; 
        int freq[]=new int[100001];
        for(int x:nums){
            if(x%2==0){
                freq[x]++;
                check=false;
            }    
        }
        if(check)return -1;
        int ans=0,count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                if(freq[i]>count){
                    count=freq[i];
                    ans=i;
                }
            }
        }
    return ans;
    }
}
```

## Approach 2 — 2024-08-15 22:15 (java)

*Runtime: 25 ms (faster than 30.0%) · Memory: 44.9 MB*

```java
class Solution {
    public int mostFrequentEven(int[] nums) {
        boolean check=true; 
        int freq[]=new int[100001];
        for(int x:nums){
            if(x%2==0){
                freq[x]++;
                check=false;
            }    
        }
        if(check)return -1;
        int ans=0,count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0&&freq[i]>count){
                    count=freq[i];
                    ans=i;
            }
        }
    return ans;
    }
}
```
