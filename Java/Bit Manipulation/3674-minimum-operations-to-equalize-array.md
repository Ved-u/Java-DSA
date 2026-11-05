# 3674. Minimum Operations to Equalize Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-operations-to-equalize-array/
**Tags:** Array, Bit Manipulation, Brainteaser

## Approach 1 — 2025-09-07 08:18 (java)

*Runtime: 1 ms (faster than 67.2%) · Memory: 43.4 MB*

```java
class Solution {
    public int minOperations(int[] nums) {
       // int ans=0;
        //ans=rec(nums,0,nums.length-1);
        boolean check=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                check=false;
                break;
            }
        }
        if(check)return 0;
        else return 1;
        //return ans;
    }
    // public int rec(int nums[],int l,int r){
    //     //if(l>r)return 0;
    //     if(l==r)return 1;
    //     if(l<0||r>nums.length-1||l>r)return 0;
    //     int and=nums[l];
    //     for(int i=l;i<=r;i++){
    //         and=and&nums[i];
    //     }
    //     for(int i=l;i<=r;i++){
    //         nums[i]=and;
    //     }
    //     bool check=true;
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i]!=nums[i-1]){
    //             check=false;
    //             break;
    //         }
    //     }
    //     if(check){
            
    //     }else{
            
    //     }
    //     //return Math.min(rec())
    // }
}
```
