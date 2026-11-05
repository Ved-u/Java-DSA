# 1636. Sort Array by Increasing Frequency

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sort-array-by-increasing-frequency/
**Tags:** Array, Hash Table, Sorting

## Approach 1 — 2024-09-14 13:10 (java)

*Runtime: 7 ms (faster than 76.0%) · Memory: 44.8 MB*

```java
class Solution {
    public int[] frequencySort(int[] nums) {
        int freq[][] = new int[201][2];
        for (int x : nums) {
            freq[x + 100][1]++;
        }
        int indx = -100;
        for (int i = 0; i < freq.length; i++) {
            freq[i][0] =indx++;
        }
        Arrays.sort(freq, (a, b) -> Integer.compare(a[1], b[1]));
        indx = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] == 0) continue;
            int j = i;
            while (j + 1<freq.length && freq[j][1] == freq[j + 1][1]) j++;
            for (int p = j; p >= i; p--) {
                while (freq[p][1]-- > 0) {
                    nums[indx++] = freq[p][0];
                }
            }
            i = j;
        }
    return nums;
    }
}
```

## Approach 2 — 2024-09-14 14:03 (java)

*Runtime: 8 ms (faster than 62.0%) · Memory: 44.5 MB*

```java
class Solution {
    public int[] frequencySort(int[] nums) {
       int freq[][]=new int[201][2];
       for(int x:nums){
            freq[x+100][1]++;
       }
       int k=-100;
       for(int i=0;i<freq.length;i++){
            freq[i][0]=k++;
       }k=0;
       Arrays.sort(freq,(a,b)->Integer.compare(a[1],b[1]));
       for(int i=0;i<freq.length;i++){
            if(freq[i][1]==0)continue;
            int j=i;
            while(j+1<freq.length&&freq[j][1]==freq[j+1][1])j++;
            for(int p=j;p>=i;p--){
                while(freq[p][1]-->0){
                    nums[k++]=freq[p][0];
                }
            }
            i=j;
       }
    return nums; 
    }
}
```
