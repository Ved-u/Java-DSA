# 2023. Number of Pairs of Strings With Concatenation Equal to Target

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/
**Tags:** Array, Hash Table, String, Counting

## Approach 1 — 2024-08-14 21:27 (java)

*Runtime: 26 ms (faster than 27.8%) · Memory: 44.9 MB*

```java
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j&&(nums[i]+nums[j]).equals(target))ans++;
            }
        }
    return ans;
    }
}
```

## Approach 2 — 2024-08-14 21:29 (java)

*Runtime: 17 ms (faster than 63.6%) · Memory: 44.9 MB*

```java
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i].length()+nums[j].length()==target.length()&&i!=j&&(nums[i]+nums[j]).equals(target))ans++;
            }
        }
    return ans;
    }
}
```

## Approach 3 — 2025-10-14 07:35 (java)

*Runtime: 16 ms (faster than 64.5%) · Memory: 45.3 MB*

```java
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i].length()+nums[j].length()==target.length()
                &&i!=j&&(nums[i]+nums[j]).equals(target))
                    ans++;
            }
        }
    return ans;
    }
}
```
