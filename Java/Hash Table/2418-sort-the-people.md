# 2418. Sort the People

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sort-the-people/
**Tags:** Array, Hash Table, String, Sorting

## Approach 1 — 2024-04-16 23:47 (java)

*Runtime: 10 ms (faster than 64.7%) · Memory: 45.4 MB*

```java
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int start=0;
        int next=start+1;
        int max;
        int maxIndex;
        while(start<heights.length){
            max=0;
            maxIndex=0;
            for(int i=next;i<heights.length;i++){
                if(heights[i]>max){
                    max=heights[i];
                    maxIndex=i;
                }
            }
            if(heights[start]<max){
                heights[start]=heights[start]^heights[maxIndex];
                heights[maxIndex]=heights[start]^heights[maxIndex];
                heights[start]=heights[start]^heights[maxIndex];
                //swap names too
                String temp=names[start];
                names[start]=names[maxIndex];
                names[maxIndex]=temp;
            }
            start++;
            next++;
        }
    return names;    
    }
}
```
