# 1476. Subrectangle Queries

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/subrectangle-queries/
**Tags:** Array, Design, Matrix

## Approach 1 — 2024-07-13 20:51 (java)

*Runtime: 31 ms (faster than 8.1%) · Memory: 49.8 MB*

```java
class SubrectangleQueries {
    List<List<Integer>> arr=new ArrayList<>();

    public SubrectangleQueries(int[][] rectangle) {
        for(int i=0;i<rectangle.length;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<rectangle[i].length;j++){
                temp.add(rectangle[i][j]);
            }
            arr.add(temp);
        }
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                arr.get(i).set(j,newValue);
            }
        }
    }
    
    public int getValue(int row, int col) {
        return arr.get(row).get(col);
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
```

## Approach 2 — 2024-07-13 20:54 (java)

*Runtime: 20 ms (faster than 94.3%) · Memory: 48.2 MB*

```java
class SubrectangleQueries {
    int[][] rec;
    public SubrectangleQueries(int[][] rectangle){
        this.rec=rectangle;
    } 
    public void updateSubrectangle(int r1,int c1,int r2,int c2,int nV){
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                this.rec[i][j]=nV;
            }
        }
    }
    public int getValue(int row,int col) {
        return this.rec[row][col];
    }
}
```
