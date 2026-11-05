# 189. Rotate Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/rotate-array/
**Tags:** Array, Math, Two Pointers

## Approach 1 — 2024-04-08 12:56 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 57.2 MB*

```java
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
         reverse(nums, 0, nums.length - 1); 
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public static void reverse(int arr[],int left,int right){
        while(left<right){
            arr[left]=arr[left]^arr[right];
            arr[right]=arr[left]^arr[right];
            arr[left]=arr[left]^arr[right];
            left++;
            right--;
        }
    }
}
```

## Approach 2 — 2024-04-08 13:00 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 57.5 MB*

```java
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int first, int last){
        while(first<last){
            nums[first]= nums[first]^nums[last];
            nums[last] = nums[first]^nums[last];
            nums[first] =nums[first]^nums[last];
            first++;
            last--;
        } 
    }
}
```

## Approach 3 — 2024-04-08 13:00 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 58.1 MB*

```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        this.reverse(nums, 0, n-1);
        this.reverse(nums, 0, k-1);
        this.reverse(nums, k, n-1);
        
    }
    
    public void reverse(int[] nums, int first, int last){
        while(first<last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        } 
    }
    
    
}
```

## Approach 4 — 2024-04-08 13:02 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 57.4 MB*

```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        
    }
    public void reverse(int[] nums, int first, int last){
        while(first<last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        } 
    }
}
```
