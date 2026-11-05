# 1365. How Many Numbers Are Smaller Than the Current Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
**Tags:** Array, Hash Table, Sorting, Counting Sort

## Approach 1 — 2024-07-05 15:07 (java)

*Runtime: 3 ms (faster than 86.2%) · Memory: 44.2 MB*

```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int freq[]=new int[101];
        int ans[]=new int[nums.length];
        for(int x:nums)
            freq[x]++;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums[i];j++)
                if(freq[j]>0)count+=freq[j];
            ans[i]=count;    
        }    
    return ans;    
    }
}
```

## Approach 2 — 2024-08-02 18:20 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 44.3 MB*

```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[102];
        for(int n:nums)
            arr[n+1]++;
        for(int i=1;i<102;i++)
            arr[i]+=arr[i-1];
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            res[i]=arr[nums[i]];
    return res;
    }
}
```
