# 2053. Kth Distinct String in an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/kth-distinct-string-in-an-array/
**Tags:** Array, Hash Table, String, Counting

## Approach 1 — 2024-06-28 12:04 (java)

*Runtime: 74 ms (faster than 12.6%) · Memory: 43.8 MB*

```java
class Solution {
    public String kthDistinct(String[] arr, int k) {
       int count=0;
       boolean check;
       for(int i=0;i<arr.length;i++){
            check=true;
            for(int j=0;j<arr.length;j++){
                if(i==j)continue;
                if(arr[i].equals(arr[j])){
                    check=false;
                    break;
                }
            }
            if(check)
            if(++count==k)return arr[i];
       } 
    return "";    
    }
}
```

## Approach 2 — 2024-06-28 12:08 (java)

*Runtime: 70 ms (faster than 14.7%) · Memory: 44.1 MB*

```java
class Solution {
    public String kthDistinct(String[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isDistinct(arr, i)) {
                count++;
                if (count == k) 
                    return arr[i]; 
            }
        }
    return "";
    }
    private boolean isDistinct(String[] arr, int index) {
        for (int j = 0; j < arr.length; j++) 
            if (index != j && arr[index].equals(arr[j])) 
                return false;
    return true;
    }
}
```
