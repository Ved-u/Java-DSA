# 2037. Minimum Number of Moves to Seat Everyone

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
**Tags:** Array, Greedy, Sorting, Counting Sort

## Approach 1 — 2024-06-13 10:28 (java)

*Runtime: 3 ms (faster than 95.2%) · Memory: 43.6 MB*

```java
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
            ans+=(Math.abs(seats[i]-students[i]));
        }
    return ans;
    }
}
```
