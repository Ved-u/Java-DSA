# 239. Sliding Window Maximum

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/sliding-window-maximum/
**Tags:** Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue, Range Minimum/Maximum Query

## Approach 1 — 2024-09-20 09:33 (java)

*Runtime: 566 ms (faster than 5.0%) · Memory: 60.8 MB*

```java
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];// n-(k-1)=n-k+1
        int nge[]=new int[nums.length];
        Stack<Integer> stk=new Stack<>();
        nge[nge.length-1]=nums.length;
        stk.push(nums.length-1);
        for(int i=nums.length-2;i>=0;i--){
           while(stk.size()>0&&nums[i]>=nums[stk.peek()])stk.pop();
           if(stk.size()==0)nge[i]=nums.length;
           else nge[i]=stk.peek();
           stk.push(i);
        }int j=0;
        for(int i=0;i<ans.length;i++){
            if(j>i+k-1)j=i;
            int max=nums[j];
            while(j<i+k){
                max=nums[j];
                j=nge[j];
            }
            ans[i]=max;
        }
    return ans;
    }
}
```
