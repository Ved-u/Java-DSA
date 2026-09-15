import java.util.ArrayList;
import java.util.List;

public class MyBackTracking {
    public static int ratMaze2Dir(int sr,int sc,int er,int ec) {
        if(sr>er||sc>ec)return 0;
        if(sr==er&&sc==ec)return 1;
        //totalways=down+right
        return ratMaze2Dir(sr+1, sc, er, ec)+ratMaze2Dir(sr, sc+1, er, ec);
    }
    public static void printRatMaze2Dir(int sr,int sc,int er,int ec,String str) {
        if(sr>er||sc>ec)return;
        if(sr==er&&sc==ec){
            System.out.println(str);
            return;
        }    
        //down
        printRatMaze2Dir(sr+1, sc, er, ec,str+"D");
        //right
        printRatMaze2Dir(sr, sc+1, er, ec,str+"R");
    }
    public static void printRatMaze4Dir(int sr,int sc,int er,int ec,String str,boolean[] []check) {
        if(sr<0||sc<0||sr>er||sc>ec)return;
        if(sr==er&&sc==ec){
            System.out.println(str);
            return;
        }
        if(check[sr][sc])return;  
        check[sr][sc]=true;  
        //down
        printRatMaze4Dir(sr+1, sc, er, ec,str+"D",check);
        //right
        printRatMaze4Dir(sr, sc+1, er, ec,str+"R",check);
        //left
        printRatMaze4Dir(sr, sc-1, er, ec,str+"L",check);
        //up
        printRatMaze4Dir(sr-1, sc, er, ec,str+"U",check);
        check[sr][sc]=false;  
    }
    public static void printRatMaze4Dir(int sr,int sc,int er,int ec,String str,int[] []maze) {
        if(sr<0||sc<0||sr>er||sc>ec)return;
        if(sr==er&&sc==ec){
            System.out.println(str);
            return;
        }
        if(maze[sr][sc]==0)return;   
        //down
        printRatMaze4Dir(sr+1, sc, er, ec,str+"D",maze);
        //right
        printRatMaze4Dir(sr, sc+1, er, ec,str+"R",maze);
         
    }
    public static void printRatMaze4Dir(int sr,int sc,int er,int ec,String str,int maze[][],boolean[] []check) {
        if(sr<0||sc<0||sr>er||sc>ec)return;
        if(sr==er&&sc==ec){
            System.out.println(str);
            return;
        }
        if(maze[sr][sc]==0)return;
        if(check[sr][sc])return;  
        check[sr][sc]=true;  
        //down
        printRatMaze4Dir(sr+1, sc, er, ec,str+"D",maze,check);
        //right
        printRatMaze4Dir(sr, sc+1, er, ec,str+"R",maze,check);
        //left
        printRatMaze4Dir(sr, sc-1, er, ec,str+"L",maze,check);
        //up
        printRatMaze4Dir(sr-1, sc, er, ec,str+"U",maze,check);
        check[sr][sc]=false;  
    }
    public static void printRatMaze4DirOptimized(int sr,int sc,int er,int ec,String str,int maze[][]) {
        if(sr<0||sc<0||sr>er||sc>ec)return;
        if(sr==er&&sc==ec){
            System.out.println(str);
            return;
        }
        if(maze[sr][sc]==0)return;
        if(maze[sr][sc]==-1)return;  
        maze[sr][sc]=-1;  
        //down
        printRatMaze4DirOptimized(sr+1, sc, er, ec,str+"D",maze);
        //right
        printRatMaze4DirOptimized(sr, sc+1, er, ec,str+"R",maze);
        //left
        printRatMaze4DirOptimized(sr, sc-1, er, ec,str+"L",maze);
        //up
        printRatMaze4DirOptimized(sr-1, sc, er, ec,str+"U",maze);
        maze[sr][sc]=1;  
    }
    public static void stringPermutation(String str,String p) {
        if(str.equals("")){
            System.out.println(p);
            return;
        }
        for(int i=0;i<str.length();i++){
            String remaining=str.substring(0,i)+str.substring(i+1);
            stringPermutation(remaining, p+str.charAt(i));
        }
    }
    public static void stringPermutation(String str,String p,List<String> l) {
        if(str.equals("")){
           l.add(p);
            return;
        }
        for(int i=0;i<str.length();i++){
            String remaining=str.substring(0,i)+str.substring(i+1);
            stringPermutation(remaining, p+str.charAt(i),l);
        }
    }
    public static void kKnights(char[] board[],int sr,int sc) {
       // if()
    }
    public static boolean isSafe(char [][] grid,int row,int col){
        int n=grid.length;
        //2 up one right
        int i=row-2,j=col+1;
        if(i>=0&&j<n&&grid[i][j]=='K')return false;
        //2 up one left
        i=row-2;j=col-1;
        if(i>=0&&j>=0&&grid[i][j]=='K')return false; 
        //2 left one up
        i=row-1;j=col-2;
        if(i>=0&&j>=0&&grid[i][j]=='K')return false;
        //2 left one down
        i=row+1;j=col-2;
        if(i<n&&j>=0&&grid[i][j]=='K')return false;
        //2 right one down
        i=row+1;j=col+2;
        if(i<n&&j<n&&grid[i][j]=='K')return false;
        //2 right one up
        i=row-1;j=col+2;
        if(i>=0&&j<n&&grid[i][j]=='K')return false;
        //2 down one right
        i=row+2;j=col+1;
        if(i<n&&j<n&&grid[i][j]=='K')return false;
        //2 down one left
        i=row+2;j=col-1;
        if(i<n&&j>=0&&grid[i][j]=='K')return false;
    return true;
    }
    static int max=0;
    public static int maxKnightsPlacement(char[] board[],int placed,int cr,int cc) {
        int n=board.length;
        if(cr==n){
            for(char x[]:board){
                for(char y:x){
                    System.out.print(y);
                }
                System.out.println();
            }
            System.out.println();
        return max=Math.max(max,placed);
        }
        if(isSafe(board,cr,cc)){
            board[cr][cc]='K';
            if(cc!=n-1)maxKnightsPlacement(board, placed+1, cr, cc+1);
            else maxKnightsPlacement(board, placed+1, cr+1,0);
            board[cr][cc]='x';
        }
        if(cc!=n-1)maxKnightsPlacement(board, placed, cr, cc+1);
        else maxKnightsPlacement(board, placed, cr+1,0);
    return max=Math.max(max,placed);
    }
    public static void main(String[] args) {
        int row=4,col=4;
        char board[][]=new char[row][col];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        System.out.println(maxKnightsPlacement(board,0,0,0));
    }
}
