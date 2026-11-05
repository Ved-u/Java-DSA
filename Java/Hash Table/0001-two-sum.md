# 1. Two Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/two-sum/
**Tags:** Array, Hash Table

## Approach 1 — 2024-01-28 13:22 (java)

*Runtime: 97 ms (faster than 6.0%) · Memory: 44.8 MB*

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
       for(int i=0;i<nums.length;i++){
           for(int j=1;j<nums.length;j++){
               if(i==j){
                   continue;
               }
               if((nums[i]+nums[j])==target){
                  ans[0]=i;
                  ans[1]=j;
               }
           } 
       }
       return ans;
    }
}
```

## Approach 2 — 2024-02-20 22:06 (java)

*Runtime: 99 ms (faster than 6.0%) · Memory: 44.7 MB*

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
       for(int i=0;i<nums.length;i++){
           for(int j=1;j<nums.length;j++){
               if(i!=j&&(nums[i]+nums[j])==target){
                  ans[0]=i;
                  ans[1]=j;
               }
           } 
       }
       return ans;
    }
}
```

## Approach 3 — 2024-08-03 21:01 (java)

*Runtime: 4 ms (faster than 50.5%) · Memory: 44.9 MB*

```java
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] main, int target) {
        int nums[] = main.clone();
        Arrays.sort(nums); 
        int ans[] = new int[2];
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                ans[0] = nums[left];
                ans[1] = nums[right];
                break;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        
        int[] result = new int[2];
        boolean foundFirst = false;
        
        for (int i = 0; i < main.length; i++) {
            if (!foundFirst && main[i] == ans[0]) {
                result[0] = i;
                foundFirst = true;
            } else if (main[i] == ans[1]) {
                result[1] = i;
            }
        }
        
        // Ensure the correct order
        if (result[0] > result[1]) {
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }

        return result;   
    }
}
```

## Approach 4 — 2024-08-03 21:04 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.6 MB*

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
     for(int i=1;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
            int a=j-i;
            if(nums[a]+nums[j]==target)return new int[]{a,j};
        }
     }
    return new int[] {0};
    }
}
```

## Approach 5 — 2024-11-16 17:34 (java)

*Runtime: 2 ms (faster than 99.4%) · Memory: 44.8 MB*

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        if(map.containsKey(target-nums[i]))
            return new int[]{i,map.get(target-nums[i])};
        else map.put(nums[i],i);
     }
    return new int[]{0,0};
    }
}
```

## Approach 6 — 2025-01-16 18:03 (java)

*Runtime: 4 ms (faster than 50.5%) · Memory: 44.2 MB*

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
    return new int[] {};
    }
}
```
