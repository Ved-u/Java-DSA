# 3046. Split the Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/split-the-array/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2024-02-26 23:40 (java)

*Runtime: 1 ms (faster than 98.6%) · Memory: 42.6 MB*

```java
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] arr=new int[101];
        for(int i:nums) arr[i]++;
        for(int i:arr){
            if(i>2) return false;
        }
        return true;
    }
}
```

## Approach 2 — 2024-02-26 23:40 (java)

*Runtime: 1 ms (faster than 98.6%) · Memory: 42.5 MB*

```java
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq = new int[101];
        for (int num: nums) {
            freq[num]++;
            if (freq[num] > 2) return false;
        }
        return true;
    }
}
```
