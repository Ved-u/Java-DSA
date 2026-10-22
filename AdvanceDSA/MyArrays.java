package AdvanceDSA;
public class MyArrays {
    public static int[] searchInSortedMatrix(int[][] mat,int key) {// use the (0,m-1) or (n-1,0) as starting pos in N x M matrix
        int n=mat.length,m=mat[0].length;
        int currRow=n-1,currCol=0;
        int[] ans = {-1,-1};
        while(currRow>=0&&currCol<=m-1){
            int currElement = mat[currRow][currCol];
            if(currElement==key){
                ans[0]=currRow;
                ans[1]=currCol;
                return ans;
            }else if(currElement>key){// move up
                currRow--;
            }else{//currElement < key so move right
                currCol++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
