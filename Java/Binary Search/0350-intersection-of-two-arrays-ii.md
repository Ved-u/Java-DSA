# 350. Intersection of Two Arrays II

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/intersection-of-two-arrays-ii/
**Tags:** Array, Hash Table, Two Pointers, Binary Search, Sorting

## Approach 1 — 2024-07-02 22:35 (java)

*Runtime: 2 ms (faster than 95.2%) · Memory: 43.5 MB*

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        int []freq1=new int[1001];
        int []freq2=new int[1001];
        for(int x:nums1)
            freq1[x]++;
        for(int x:nums2)
            freq2[x]++;
        for(int i=0;i<freq1.length;i++)
            if(freq1[i]>0&&freq2[i]>0)
                for(int j=1;j<=Math.min(freq1[i],freq2[i]);j++)
                    ans.add(i);
        int uttar[]=new int[ans.size()];
        int count=0;
        for(Integer x:ans)
            uttar[count++]=x.intValue();;
    return uttar;
    }
}
```
