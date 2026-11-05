# 1431. Kids With the Greatest Number of Candies

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
**Tags:** Array

## Approach 1 — 2024-02-03 20:36 (java)

*Runtime: 1 ms (faster than 95.8%) · Memory: 42.1 MB*

```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
```
