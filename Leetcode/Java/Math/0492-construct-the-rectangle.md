# 492. Construct the Rectangle

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/construct-the-rectangle/
**Tags:** Math

## Approach 1 — 2026-06-18 18:55 (java)

*Runtime: 226 ms (faster than 5.1%) · Memory: 42.4 MB*

```java
class Solution {
    public int[] constructRectangle(int area) {
        int ans[] = new int[2];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=area;i++){
            int w=area/i;
            if(w*i!=area)continue;
            if(w<=i){
                if(i-w<min){
                    min=w-i;
                    ans[0]=i;
                    ans[1]=w;
                }
            }
        }
        return ans;
    }
}
```

## Approach 2 — 2026-06-18 18:56 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.5 MB*

```java
class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        for (int i = (int)(Math.sqrt(area)); i >= 1 ; i--) {
            if (area % i == 0) {
                ans[1] = i;
                ans[0] = area / i;
                break;
            }
        }
        return ans;
    }
}
```
