# 881. Boats to Save People

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/boats-to-save-people/
**Tags:** Array, Two Pointers, Greedy, Sorting, Timsort

## Approach 1 — 2024-05-14 17:25 (java)

*Runtime: 16 ms (faster than 98.6%) · Memory: 53.7 MB*

```java
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans=0;    
        int left=0;
        int right=people.length-1;
        Arrays.sort(people);
       // if(people[0]+people[people.length-1]<=limit)return people.length/2;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                ans++;
                left++;
                right--;
            }else if(people[left]+people[right]>limit){
                ans++;
                right--;
            }
        }
    return ans;   
    }
}
```
