# 2367. Number of Arithmetic Triplets

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-arithmetic-triplets/
**Tags:** Array, Hash Table, Two Pointers, Enumeration

## Approach 1 — 2024-07-12 21:03 (java)

*Runtime: 16 ms (faster than 47.4%) · Memory: 41.1 MB*

```java
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
       int ans=0;
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[j]-nums[i]==diff&&nums[k]-nums[j]==diff)ans++;
            }
        }
       }
    return ans;    
    }
}
```

## Approach 2 — 2024-07-12 21:06 (java)

*Runtime: 1 ms (faster than 95.6%) · Memory: 41 MB*

```java
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count =0;
        for(int i =0 ; i< nums.length ; i++){
            int first = nums[i] + diff;
            if(binary(nums , first)){
                int sec = first + diff;
                if(binary(nums , sec))
                    count++;
            }
        }
    return count;
    }
    public boolean binary(int[] arr , int val){
        int start= 0 ;
        int end = arr.length -1;
        while(start <= end){
            int mid = start  +  (end - start)/2;
            if(arr[mid] == val)
                return true;
            if(val > arr[mid])
                start = mid+1;
            else
                end = mid-1; 
        }
    return false;
    }
}
```
