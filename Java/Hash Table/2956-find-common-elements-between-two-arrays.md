# 2956. Find Common Elements Between Two Arrays

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-common-elements-between-two-arrays/
**Tags:** Array, Hash Table

## Approach 1 — 2024-07-16 16:21 (java)

*Runtime: 4 ms (faster than 88.7%) · Memory: 45.4 MB*

```java
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1=0,ans2=0;
        int ans[]=new int[2];
        for(int x:nums1){
            for(int y:nums2){
                if(x==y){
                    ans1++;
                    break;
                }    
            }
        }for(int x:nums2){
            for(int y:nums1){
                if(x==y){
                    ans2++;
                    break;
                }    
            }
        }
        ans[0]=ans1;
        ans[1]=ans2;
    return ans;    
    }
}
```

## Approach 2 — 2024-07-16 16:27 (java)

*Runtime: 2 ms (faster than 96.3%) · Memory: 45.5 MB*

```java
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[]ar1=new int[101];
        int[]ar2=new int[101];
        int[]ans=new int[2];
        for(int i=0;i<nums1.length;i++) ar1[nums1[i]]++;
        for(int i=0;i<nums2.length;i++) ar2[nums2[i]]++;
        for(int i=0;i<nums1.length;i++){
            if(ar2[nums1[i]]>0) ans[0]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(ar1[nums2[i]]>0) ans[1]++;
        }
        return ans;
    }
}
```
