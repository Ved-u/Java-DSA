# 3162. Find the Number of Good Pairs I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-number-of-good-pairs-i/
**Tags:** Array, Hash Table

## Approach 1 — 2024-07-03 22:52 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 42.5 MB*

```java
class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int ans=0;
        for(int x:nums1)
            for(int y:nums2)
                if(x%(y*k)==0)ans++;
    return ans;    
    }
}
```

## Approach 2 — 2024-07-03 22:54 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 43 MB*

```java
class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int ans=0;
        for(int x:nums1){
            if(x%k!=0)continue;
            for(int y:nums2){
                if(x%(y*k)==0)ans++;
            }
        }
    return ans;    
    }
}
```

## Approach 3 — 2024-07-03 22:54 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 42.5 MB*

```java
class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i]%k != 0) continue;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i]%(nums2[j]*k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
```
