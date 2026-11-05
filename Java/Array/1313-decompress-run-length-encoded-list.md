# 1313. Decompress Run-Length Encoded List

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/decompress-run-length-encoded-list/
**Tags:** Array

## Approach 1 — 2024-07-18 11:19 (java)

*Runtime: 4 ms (faster than 46.2%) · Memory: 45.6 MB*

```java
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=1;j<=nums[i];j++){
                ans.add(nums[i+1]);
            }
        }
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
    return result;    
    }
}
```

## Approach 2 — 2024-07-18 11:26 (java)

*Runtime: 2 ms (faster than 57.4%) · Memory: 44.6 MB*

```java
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length=0;
        for(int i=0;i<nums.length;i+=2)
            length+=nums[i];
        int ans[]=new int[length];
        int count=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=1;j<=nums[i];j++){
                ans[count++]=nums[i+1];
            }
        }
    return ans;    
    }
}
```
