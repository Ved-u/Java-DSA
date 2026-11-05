# 2326. Spiral Matrix IV

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/spiral-matrix-iv/
**Tags:** Array, Linked List, Matrix, Simulation

## Approach 1 — 2024-08-08 14:28 (java)

*Runtime: 7 ms (faster than 39.3%) · Memory: 56.5 MB*

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][]=new int[m][n];
        int startRow=0;
        int endCol=matrix[0].length-1;
        int endRow=matrix.length-1;
        int startCol=0;
        ListNode t=head;
        while(startCol<=endCol&&startRow<=endRow){
            //top
            for(int j=startCol;j<=endCol;j++){
                if(t!=null){
                matrix[startCol][j]=t.val;
                t=t.next;
                }else matrix[startCol][j]=-1;
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                if(t!=null){
                matrix[i][endCol]=t.val;
                t=t.next;
                }else matrix[i][endCol]=-1;
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow)break;
                if(t!=null){
                matrix[endRow][j]=t.val;
                t=t.next;
                }else matrix[endRow][j]=-1;
            }
            //left
            for(int i=endRow-1;i>startRow;i--){
                if(startCol==endCol)break;
                if(t!=null){
                matrix[i][startCol]=t.val;
                t=t.next;
                }else matrix[i][startCol]=-1;
            }
            //update variables
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    return matrix;
    }
}
```
