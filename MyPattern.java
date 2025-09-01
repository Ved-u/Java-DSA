public class MyPattern {
    public static void alphabetsTriangle(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        ;
    }

    public static void triangle10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // 1st part
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // $
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            // new line
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // 2nd part
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // $
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            // new line
            System.out.println();
        }
    }
    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // numbers
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void rightUpHalfPyramid(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightDownHalfPyramid(int r) {
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramidNo(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = (i - 1); l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void hollowTraingle(int r) {
        for (int i = 1; i <= r; i++) {
            // outer spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == r || j == 1 || j == 2 * i - 1) {
                    System.out.print(i);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void oneZeroRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(int l, int b) {
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 1 || i == b || j == 1 || j == l)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void rotatedTraingle(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // stars
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            // new line
            System.out.println();
        }
    }

    public static void floyedsTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(count++ + " ");
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // stars
            for (int j = 1; j <= n; j++)
                System.out.print("$");
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // *
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void palindromePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // dec no
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            // inc no
            for (int j = 2; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    public static void sqaureNumbers(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.format("%02d ", count++);
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void primeNoTraingle(int r) {
        int[] primeNos = new int[(r * r + r) / 2];
        int prime = 2;
        boolean isPrime;
        int count = 0;
        while (count < primeNos.length) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(prime); j++) {
                if (prime % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primeNos[count++] = prime;
            prime++;
        }
        count = 0;
        for (int i = 1; i <= r; i++) {
            // spaces
            for (int j = 1; j <= r - i; j++)
                System.out.print(" ");
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(primeNos[count++] + " ");
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=(2*i)-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void starPattern(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == j || i + j == r + 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void diamondAlphabetPattern(int r) {
        char ch = 'A';
        // top half
        for (int i = 1; i <= r; i++) {
            // outside spaces
            for (int j = r; j > i; j--) {
                System.out.print(" ");
            }
            // char
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            ch = 'A';
        }
        // bottom half
        for (int i = r-1; i >=1; i--) {
           // outside spaces
           for (int j = r; j > i; j--) {
            System.out.print(" ");
            }
            // char
            for (int k = 0; k < i * 2 - 1; k++) {
            System.out.print(ch);
            ch++;
            }
            System.out.println();
            ch = 'A';
        }
    }

    public static void plusStarPattern(int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (i == r / 2) {
                    System.out.print("*");
                } else {
                    if (j == r / 2)
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void hourGlass(int n){
        int count=1;
        boolean flag=false;
        int totalElements=(8*n)-7;
        //top
        for(int i=1;i<=n;i++){
            //spapces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=n-i+1;j>=1;j--){
                if(count<=9){
                    System.out.print(count+++" ");
                    totalElements--;
                }
                else if(flag==false){
                    System.out.print(0+" ");
                    flag=true;
                    totalElements--;
                }else{
                    System.out.print(9+" ");
                    flag=false;
                    totalElements--;
                }     
            }
            System.out.println();
        }count=9;
        //bottom
        for(int i=n-1;i>=1;i--){
            //spapces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=n-i+1;j>=1;j--){
                if(totalElements>9){
                    if(flag==false){
                        System.out.print(0+" ");
                        flag=true;
                        totalElements--;
                    }else{
                        System.out.print(9+" ");
                        flag=false;
                        totalElements--;
                    }  
                }else{
                    System.out.print(count--+" ");
                }
              }  
            System.out.println();
            }
    }
    public static void numberPyramidPalindrome(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //numbers
            int count=1;
            for(int j=1;j<=(2*i)-1;j++){
                if(j<=((2*i)-1)/2)
                    System.out.print(count+++" ");
                else    
                    System.out.print(count--+" ");   
            }
            System.out.println();
        }
    }
    public static void rect(int r,int c) {
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1||i==r||j==1||j==c)
                    System.out.print("*");
                else 
                    System.out.print(" ");    
            }
            System.out.println();
        }
    }
    public static void invertedTraingular(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }//stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyramid(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void numRect(int r,int c) {
        for(int i=1;i<=r;i++){
           //i-c
           for(int j=i;j<=c;j++){
                System.out.print(j+" ");
           } 
           //1-i
           for(int j=1;j<i;j++){
            System.out.print(j+" ");
           }
           System.out.println();
        }
    }
    public static void numRectangle(int r,int c) {
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
    public static void alternate12(int r,int c) {
        for(int i=1;i<=r;i++){
            for(int  j=1;j<=c;j++){
                if((i+j)%2==0)System.out.print(1+" ");
                else System.out.print(2+" ");
            }
            System.out.println();
        }
    }
    public static void numericalTraingle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }public static void palindrmePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for(int j=1;j<=n-i;j++)System.out.print(" ");
            //1-i
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //i-1 to 1
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void hollowTringle(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(i==1||i==n||j==1||j==2*i-1)System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void circle(int r) {
        for (int i = 0; i <= 2 * r; i++) {
            for (int j = 0; j <= 2 * r; j++) {
                int x = i - r;
                int y = j - r;
                if (x * x + y * y <= r * r + r * 0.8) { // Adjusting to make a better circle shape
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
   
   public static void alphabetdiamond(int n) {
        char ch='A';
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++)System.out.print(" ");
            //alphabets
            ch='A';
            for(int j=1;j<=2*i-1;j++)System.out.print(ch++);
            System.out.println();
        } for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++)System.out.print(" ");
            //alphabets
            ch='A';
            for(int j=1;j<=2*i-1;j++)System.out.print(ch++);
            System.out.println();
        }
   }
   public static void plus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2||j==n/2)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
   }
   public static boolean isPrime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0)return false;
        }
    return true;    
   }
   public static void primePyramid(int n) {
    int prime=2;
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n-i;j++)System.out.print(" ");
            //prime
            for(int j=1;j<=2*i-1;j++){
                System.out.print(prime+" ");
                for(int k=prime+1;true;k++){
                    if(isPrime(k)){
                        prime=k;
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
    public static void pyramidNumbers(int n) {
      /*1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14 15 */
       // int count=1;
       for (int i = 1; i <= n; i++) {
        int number = i; // Initialize the first number in the row
        int increment = n - 1; // The difference between consecutive numbers in the row

        for (int j = 1; j <= i; j++) {
            System.out.print(number + " ");
            number += increment;
            increment--; // Decrement the increment for the next number in the row
        }
        System.out.println(); // Move to the next line after printing all numbers in the current row
    }
    }
    public static void halfDiamond(int r) {
     
    for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
            System.out.print("*");
            }
            System.out.println(); 
        }
    for (int i = r-1; i >= 1; i--) {
            for (int j = 1; j <= r; j++) {
            System.out.print("*");
            }
            System.out.println(); 
        }
    }
    public static void starNoRect(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = r; j >= 1; j--) {
              if(j==i)System.out.print("*");
              else System.out.print(j);
            }
            System.out.println(); 
        }
    }
    public static void hollowTraingleInverted(int r) {   
    for (int i = r; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
            if(i==r||i==1||j==i||j==1)System.out.print("* ");
    else System.out.print("  ");
            }
            System.out.println(); 
        }
    }
    public static void palindromeTraingle(int n) {
        char ch;
        for(int i=1;i<=n;i++){
            ch='A';
            for(int j=1;j<=i;j++)
                System.out.print(ch+++" ");
            ch--;    
            for(int j=i-1;j>=1;j--)
                System.out.print(--ch+" ");    
            System.out.println();    
        }
    }


    public static void main(String[] args) {
      palindromeTraingle(5);
    }
}