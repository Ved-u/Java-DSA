public class Regex {
    public static void nQueens(int[][] mat) {
        int n = mat.length; 
        if(nQueensUtil(mat, 0, n) == false) {
            System.out.println("Solution does not exist");
        } else {
            printSolution(mat);
        }
        
    }
    public static void main(String[] args) {
        int arr[][] = new int[4][4];    
        System.out.println(nQueens(arr));
    }
}
