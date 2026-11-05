# 3074. Apple Redistribution into Boxes

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/apple-redistribution-into-boxes/
**Tags:** Array, Greedy, Sorting

## Approach 1 — 2024-03-10 18:36 (java)

*Runtime: 2 ms (faster than 94.5%) · Memory: 41.8 MB*

```java
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int Apple=0;
        int min=0;
        for(int i=0;i<apple.length;i++){
            Apple=Apple+apple[i];
        }
        Arrays.sort(capacity);
        if(capacity[capacity.length-1]>=Apple)return 1;
        for(int i=capacity.length-1;i>=0;i--){
            if(Apple<=0)break;
            if(Apple>=capacity[i]){
                Apple=Apple-capacity[i];
                min++;
            }else{
                min++;
                break;
            }
        }
        return min;
    }
}
```
