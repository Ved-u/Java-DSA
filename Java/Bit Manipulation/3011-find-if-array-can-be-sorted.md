# 3011. Find if Array Can Be Sorted

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-if-array-can-be-sorted/
**Tags:** Array, Bit Manipulation, Sorting

## Approach 1 — 2024-11-06 21:41 (java)

*Runtime: 89 ms (faster than 5.0%) · Memory: 44.9 MB*

```java
class Solution {
    public boolean canSortArray(int[] nums) {
        //bubble sort
        boolean swap=true;
       while(swap){
            swap=false;
            for(int i=0;i<nums.length-1;i++){
                if(setBits(nums[i],nums[i+1])){
                    if(nums[i]>nums[i+1]){
                        swap=true;
                        int temp=nums[i];
                        nums[i]=nums[i+1];
                        nums[i+1]=temp;
                    }
                }
            }
       }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])return false;
        }
    return true;
    }
    public boolean setBits(int n1,int n2){
        int one1=0,one2=0;
        String str=Integer.toBinaryString(n1);
        String str2=Integer.toBinaryString(n2);
        for(char x:str.toCharArray()){
            if(x=='1')one1++;
        }
         for(char x:str2.toCharArray()){
            if(x=='1')one2++;
        }
    return one1==one2;
    }
}
```
