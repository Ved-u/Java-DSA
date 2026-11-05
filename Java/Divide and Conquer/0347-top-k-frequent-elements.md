# 347. Top K Frequent Elements

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/top-k-frequent-elements/
**Tags:** Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect

## Approach 1 — 2024-08-17 18:51 (java)

*Runtime: 25 ms (faster than 6.4%) · Memory: 48.4 MB*

```java
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int freq[]=new int[2*10001];
        for(int x:nums){
            if(x>=0)freq[x]++;
            else freq[10001-x]++;
        }
        ArrayList<Integer> t=new ArrayList<>();
        int max=Integer.MIN_VALUE,indx=0;
        for(int i=1;i<=k;i++){
            max=Integer.MIN_VALUE;indx=0;
            for(int j=0;j<freq.length;j++){
                if(freq[j]>0&&freq[j]>max){
                    max=freq[j];
                    indx=j;
                }  
            }
            if(indx<=10001)t.add(indx);
            else t.add(10001-indx);
            freq[indx]=0;
        }
        int ans[]=new int[t.size()];
        int count=0;
        for(Integer x:t)
            ans[count++]=x;
    return ans;
    }
}
```
