# 832. Flipping an Image

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/flipping-an-image/
**Tags:** Array, Two Pointers, Bit Manipulation, Matrix, Simulation

## Approach 1 — 2024-10-08 11:17 (java)

*Runtime: 1 ms (faster than 42.8%) · Memory: 44.5 MB*

```java
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int l=0,r=image.length-1;
            while(l<r){
                image[i][l]=image[i][l]^image[i][r];
                image[i][r]=image[i][l]^image[i][r];
                image[i][l]=image[i][l]^image[i][r];
                l++;r--;
            }
            for(int j=0;j<image.length;j++){
                image[i][j]=(image[i][j]==0)?1:0;
            }
        }
    return image;
    }
}
```
