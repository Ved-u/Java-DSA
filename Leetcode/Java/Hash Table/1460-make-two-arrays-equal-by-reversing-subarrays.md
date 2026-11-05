# 1460. Make Two Arrays Equal by Reversing Subarrays

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/
**Tags:** Array, Hash Table, Sorting

## Approach 1 — 2024-08-03 16:22 (java)

*Runtime: 4 ms (faster than 77.0%) · Memory: 44.2 MB*

```java
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
       Arrays.sort(target); 
       Arrays.sort(arr);
       for(int i=0;i<target.length;i++)
        if(arr[i]!=target[i])return false;
    return true;
    }
}
```

## Approach 2 — 2024-08-03 16:26 (java)

*Runtime: 2 ms (faster than 87.4%) · Memory: 44.1 MB*

```java
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
       int freqT[]=new int[1001];
       int freqA[]=new int[1001];
       for(int x:target)
        freqT[x]++;
        for(int x:arr)
            freqA[x]++;
       for(int i=0;i<freqT.length;i++){
        if(freqT[i]!=freqA[i])return false;
       }     
    return true;
    }
}
```
