# 1089. Duplicate Zeros

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/duplicate-zeros/
**Tags:** Array, Two Pointers

## Approach 1 — 2026-08-27 20:51 (java)

*Runtime: 1 ms · Memory: 47.1 MB*

```java
class Solution {
    public void duplicateZeros(int[] arr) {
        int aux[] = new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(idx==arr.length)break;
            if(arr[i]==0){
                aux[idx++]=0;
                if(idx==arr.length)break;
            }
            aux[idx++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = aux[i];
        }
    }
}
```
