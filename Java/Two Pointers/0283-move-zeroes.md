# 283. Move Zeroes

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/move-zeroes/
**Tags:** Array, Two Pointers

## Approach 1 — 2024-03-07 23:00 (java)

*Runtime: 2 ms (faster than 93.1%) · Memory: 46.1 MB*

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int ans[]=new int[nums.length];
        int count=1;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[ans.length-count++]=nums[i];
               // count++;
            }else{
                ans[count2++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}
```

## Approach 2 — 2024-03-07 23:04 (java)

*Runtime: 2 ms (faster than 93.1%) · Memory: 46 MB*

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j++]=0;
        }
    }
}
```

## Approach 3 — 2024-03-07 23:04 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 46.2 MB*

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;

        for (int n : nums) {
            if (n != 0) {
                nums[zeroIndex++] = n;
            }
        }

        while (zeroIndex < nums.length) {
            nums[zeroIndex++] = 0;
        }
    }
}
```
