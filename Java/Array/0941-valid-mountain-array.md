# 941. Valid Mountain Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/valid-mountain-array/
**Tags:** Array

## Approach 1 — 2024-09-16 11:13 (java)

*Runtime: 2 ms (faster than 86.0%) · Memory: 44.8 MB*

```java
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)return false;
        boolean check=false;
    if(arr[0]>=arr[1]||arr[arr.length-1]>=arr[arr.length-2])return false;
        for(int i=1;i<arr.length-1;i++){
            if(check){
                if(arr[i]<=arr[i+1])return false;
            }else{
                if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])check=true;
                else if(arr[i]>=arr[i+1])return false;
            }
        }
    return true;
    }
}
```
