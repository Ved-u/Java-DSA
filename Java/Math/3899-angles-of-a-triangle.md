# 3899. Angles of a Triangle

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/angles-of-a-triangle/
**Tags:** Array, Math, Geometry

## Approach 1 — 2026-04-12 08:25 (java)

*Runtime: 3 ms (faster than 97.0%) · Memory: 49.6 MB*

```java
class Solution {
    public double[] internalAngles(int[] sides) {
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];
        if(a+b>c&&a+c>b&&b+c>a){
            double[] ans=new double[3];
            ans[0]=Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
            ans[1]=Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
            ans[2]=Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*a*b)));
            Arrays.sort(ans);
            return ans;
        }
        else return new double[0];
    }
}
```
