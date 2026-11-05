# 42. Trapping Rain Water

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/trapping-rain-water/
**Tags:** Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack

## Approach 1 — 2024-03-21 17:01 (java)

*Runtime: 1 ms (faster than 67.6%) · Memory: 46.2 MB*

```java
class Solution {
    public int trap(int[] height) {
        int width=1;
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int ans=0;//total rainwater
        int trappedRainwater;//rainwater above bar
        for(int i=0;i<height.length;i++){
            trappedRainwater=Math.min(leftMax[i],rightMax[i]);
            ans+=(trappedRainwater-height[i])*width;
        }
    return ans;
    }
}
```

## Approach 2 — 2024-03-21 17:03 (java)

*Runtime: 1 ms (faster than 67.6%) · Memory: 46 MB*

```java
class Solution {
    public int trap(int[] height) {
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++)
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        int ans=0;
        for(int i=0;i<height.length;i++)
          ans+=((Math.min(leftMax[i],rightMax[i]))-height[i]);
    return ans;
    }
}
```
