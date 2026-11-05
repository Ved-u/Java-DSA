# 2593. Find Score of an Array After Marking All Elements

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/
**Tags:** Array, Hash Table, Sorting, Heap (Priority Queue), Simulation

## Approach 1 — 2024-12-13 21:45 (java)

*Runtime: 111 ms (faster than 78.7%) · Memory: 59.9 MB*

```java
class Solution {
    public long findScore(int[] nums) {
        long ans = 0;

        // Create a 2D array to store indices and values
        int arr[][] = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = i;     // Store index
            arr[i][1] = nums[i]; // Store value
        }

        // Sort the array by value, then by index if values are equal
        Arrays.sort(arr, (a1, a2) -> {
            int compareValue = Integer.compare(a1[1], a2[1]);
            if (compareValue != 0) {
                return compareValue; // Sort by value
            } else {
                return Integer.compare(a1[0], a2[0]); // Sort by index if values are equal
            }
        });

        // Boolean array to keep track of marked indices
        boolean isMarked[] = new boolean[nums.length];

        // Iterate through the sorted array
        for (int i = 0; i < arr.length; i++) {
            if (isMarked[arr[i][0]]) continue; // Skip if the index is already marked
            ans += arr[i][1]; // Add the value to the answer
            int temp = arr[i][0];

            // Mark the neighboring indices
            if (temp < nums.length - 1) {
                isMarked[temp + 1] = true;
            }
            if (temp > 0) {
                isMarked[temp - 1] = true;
            }
        }

        return ans;
    }
}
```

## Approach 2 — 2024-12-13 21:53 (java)

*Runtime: 112 ms (faster than 78.1%) · Memory: 59.6 MB*

```java
class Solution {
    public long findScore(int[] nums) {
        long ans=0;
        int arr[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=i;
            arr[i][1]=nums[i];
        }
        Arrays.sort(arr,(a1,a2)->{
            int t=Integer.compare(a1[1],a2[1]);
            if(t==0)return Integer.compare(a1[0],a2[0]);
            return t;
        });
        boolean isMarked[]=new boolean[nums.length];
        for(int i=0;i<arr.length;i++){
            if(isMarked[arr[i][0]])continue;
            ans+=arr[i][1];
            int temp=arr[i][0];
            if(temp+1<nums.length) isMarked[temp+1]=true;
            if(temp-1>=0) isMarked[temp-1]=true;
        }
    return ans;
    }
}
```
