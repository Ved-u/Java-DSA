import java.util.ArrayList;
public class MyRecursion {
    public static void recursionExample(int n){
        if(n>0){
            recursionExample(n-1);
            System.out.println(n);
        }
    }

    public static void decnum(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        decnum(n-1);
    }

    public static void incnum(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        incnum(n-1);
        System.out.print(n+" ");
    }

    public static int recursionFactorial(int n){
        if(n==0){
            return 1;
        } 
        int fnm=recursionFactorial(n-1);
        int fact=n*fnm;
        return fact;
    }

    public static int sumNaturalN(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumNaturalN(n-1);
        int sum=n+snm1;
        return sum;
    }

    public static boolean isArraySorted(int arr[],int i){
       if(i==arr.length-1){
        return true;
       }
        if(arr[i]>=arr[i+1]){
            return false;
        }
        return isArraySorted(arr, i+1);
    }

    public static int searchArr(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
      if(arr[i]==key){
        return i;
      }
      return searchArr(arr, key, i+1);
    }

    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
      if(isFound==-1 && arr[i]==key){
        return i;
      }
      return isFound;
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x, n-1);
        int xn=x*xnm1;
        return xn;
    }

    public static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower(x, n/2);
        int answer=halfPower*halfPower;
        if(n%2==1){
            answer=x*answer;
        }
        return answer;
    }

    public static int tillingProblem(int n){
        //base case
        if(n==0 ||n==1){
            return 1;
        }
        //choice
            //horizontal choice
            int fnm2=tillingProblem(n-2);
            //vertical choice
            int fnm1=tillingProblem(n-1);
            return fnm2+fnm1;
    }

    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }else{
           map[currChar-'a']=true;
           removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int arrangeFrnds(int n){
        if(n==1||n==2){
            return n;
        }
        //choice
            //single
            int nm1=arrangeFrnds(n-1);
            //commited
            int nm2=arrangeFrnds(n-2);
            int pairingWays=(n-1)*nm2;
            int totalWays=nm1+pairingWays;
            return totalWays;
    }

    public static void printBinaryStrings(int n,int lastdigit,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryStrings(n-1, 0, str+"0"); 
            if(lastdigit==0){
                 printBinaryStrings(n-1,1, str+"1");
            }   
    }
    public static int oneToN(int n) {
        if(n==1) return n;
        return oneToN(n-1)+n;
    }
    public static int factorail(int n) {
        if(n==0||n==1){
            return 1;
        }
        return factorail(n-1)*n;
    }
    
    public static int nthFibonacci(int n) {
        if(n==0||n==1)return n; 
    return nthFibonacci(n-1)+nthFibonacci(n-2);       
    }

    public static int maxArray(int arr[],int indx) {
        if(indx==0)return arr[0];
    return Math.max(maxArray(arr, indx-1),arr[indx]);    
    }

    public static int sumArray(int arr[],int indx) {
       if(indx==0)return arr[indx];
       return sumArray(arr, indx-1)+arr[indx];
    }

    public static int search(int arr[],int target,int indx) {
        if(indx==arr.length)return -1;
        if(arr[indx]==target)return indx; 
    return search(arr, target, indx+1);    
    }

    public static ArrayList<Integer> searchOptimized(int[] arr, int target, int indx) {
        ArrayList<Integer> results = new ArrayList<>();  
        if (indx == arr.length)return results;
        if (arr[indx] == target)results.add(indx);
        results.addAll(searchOptimized(arr, target, indx + 1));
    return results;
    }

    public static int searchLat(int arr[],int target,int indx) {
        if(indx==-1)return -1;
        if(arr[indx]==target)return indx; 
    return searchLat(arr, target, indx-1);    
    }
    
    public static boolean isSorted(int arr[],int indx) {
        if(indx==1){
            if(arr[indx]>=arr[indx-1])return true;
            else return false;
        }
        if(isSorted(arr, indx-1)&&(arr[indx-1]<=arr[indx]))return true;
    return false;    
    }

    public static String removeOccourence(String str,char a,int pos) { //veedant e
       StringBuilder sb=new StringBuilder();
       if(pos==str.length())    return sb.toString();
       if(str.charAt(pos)!=a)   sb.append(str.charAt(pos));
       sb.append(removeOccourence(str, a, pos+1));
    return sb.toString();   
    }

    public static void reverseString(String str,int pos) {
        if(pos==0){
            System.out.print(str.charAt(pos));
            return;
        }
        System.out.print(str.charAt(pos));
        reverseString(str, pos-1);
    }

    public static String reverse(String str) {
        if(str.length()==0)return str;
        return reverse(str.substring(1))+str.charAt(0);
    }

    public static boolean reverse(String str,int left,int right) {
        if(left>=right)return true;
        return (str.charAt(left)==str.charAt(right)&&reverse(str, left+1, right-1));
    } 

    public static void palindrome(int n) {
        if(n==reverse(n, 0))System.out.println("palindrome");
        else System.out.println("not");
    } 

    public static int reverse(int n,int var) {
        if(n==0)return var;
        var=(var*10)+(n%10);
        return reverse(n/10, var);
    } 

    public static ArrayList<String> subString(String str) {
        ArrayList<String> ans=new ArrayList<>();
        if(str.length()==0){
            ans.add("");
            return ans;
        }
        char ch=str.charAt(0);
        ArrayList<String> small=subString(str.substring(1));
        for(String x:small){
            ans.add(x);
            ans.add(ch+x);
        }
    return ans;    
    } 
    
    public static void printSubStringOptimized(String str,String curr) {//abc ""
        if(str.length()==0){
            System.out.print(curr+" ");
            return;
        }
        char ch=str.charAt(0);
        printSubStringOptimized(str.substring(1),curr+ch);//choses to add
        printSubStringOptimized(str.substring(1),curr);//not chooses to add  
    }

    public static void subArraySum(int[] arr,int sum,int indx) {
        if(indx==arr.length){
            System.out.print(sum+" ");
            return;
        }    
        subArraySum(arr, sum+arr[indx], indx+1);
        subArraySum(arr, sum, indx+1);
    }

    public static int frog(int[] arr,int indx) {
        if(indx==arr.length-1)return 0;
        if(indx==arr.length-2)return Math.abs(arr[indx]-arr[indx+1]);
        return Math.min(Math.abs(arr[indx]-arr[indx+1])+frog(arr, indx+1),Math.abs(arr[indx]-arr[indx+2])+frog(arr, indx+2));
    }

    public static void keypad(String dig,String res) {
        String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(dig.length()==0){
            System.out.print(res+" ");
            return;
        }
        int curr=dig.charAt(0)-'0';
        String temp=keys[curr];
        for(int i=0;i<temp.length();i++){
            keypad(dig.substring(1), res+temp.charAt(i));
        }  
    }
    
    public static int fibonacci(int n) {
        if(n==0||n==1){
           return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
   }

   public static int fact(int n) {
          if(n==0||n==1)return 1; 
         // System.out.println(n);
          return fact(n-1)*n;
   }

   public static void oneToNFact(int n) {
       if(n==1||n==0){
           System.out.println(n);
           return;
       } 
       System.out.println(fact(n));
       oneToNFact(n-1);
   } 

    public static int oneToNFactSum(int n) {
       if(n==1||n==0){
           return 1;
       }
       return oneToNFactSum(n-1)+fact(n);
   }  

   public static int oneToNFiboSum(int n) {
       if(n==0||n==1){
           return n;
       }
       return oneToNFiboSum(n-1)+fibonacci(n);
   }

   public static int sumOfDigits(int n) {
       if(n==0){
           return 0;
       }
       return sumOfDigits(n/10)+n%10;
   }

   public static int pPowQ(int p,int q) {
       if(q==0){
           return 1;
       }
   return pPowQ(p, q-1)*p;    
   }

   public static int pPowQOptimized(int p,int q) {
       if(q==1)     return p;  
        int pow=pPowQOptimized(p, q/2);
       if(q%2==0)   return pow*pow;
   return p*pow*pow;    
   }

    public static int recursionArmstrong(int n,int digits) {
       if(n==0) return 0;
       return pPowQOptimized(n%10, digits)+recursionArmstrong(n/10, digits);
   }

   public static void kTimesN(int num,int k) {
       if(k==1){
           System.out.print(num+" ");
           return;
       }
       kTimesN(num, k-1);
       System.out.print(num*k+" ");
   }

   public static int alternateSum(int n) {
       if(n==1){
           return 1;
       }
       if(n%2==0){
           return alternateSum(n-1)-n;
       }  
   return alternateSum(n-1)+n;      
   }

   public static int GCD(int a,int b) {
      if(b==0) {
       return a;
      }
      return GCD(b,a%b);
   }
   
   public static int nxm(int n,int m) {
       if(m==1)return n;
   return  nxm(n, m-1)+n;   
   }

   public static void printArray(int[] arr,int indx) {
       if(indx==arr.length){
           return;
       }
       System.out.print(arr[indx]+" ");
       printArray(arr,indx+1);
   }
   public static void ap(int n) {
        if(n<0){
            System.out.print(n+" ");
            return; 
        }
       System.out.print(n+" ");
       ap(n-5);
       System.out.print(n+" "); 
   }public static int mthSum(int n,int m) {
        if(m==1)return oneToN(n);
        return mthSum(mthSum(n, m-1), 1);
   }public static int countDigits(int n) {
        int count=0;
        if(n<=0)return 0;
        count++;
        count+=countDigits(n/10);
    return count;
   }
   public static int armStrong(int n,int count) {
        if(n==0)return 0;
        return power(n%10, count)+armStrong(n/10, count);
   }
   public static boolean isArmStrong(int n) {
        return armStrong(n,countDigits(n))==n;
   }
   public static int axb(int a,int b) {
        if(b==1)return a;
        return axb(a, b-1)+a;
   }
   public static boolean isPrime(int n,int div) {
        if(n==2)return true;
        if(div==2&&n%2!=0)return true;
        if(n%div!=0&&isPrime(n, div-1))return true;
       else return false; 
   }
   public static int decToBin(int dec) {
        if(dec==0||dec==1)return dec;
       return  (decToBin(dec/2)*10)+dec%2;
   }
   public static int grayCode(int bin) {
        if(bin==1||bin==0)return bin;
        int prev=bin%10;
        int gray=grayCode(bin/10);
        bin/=10;
        int curr=bin%10;
        return (gray*10)+(prev^curr);
   }
    public static int paths(int m, int n, int cRow, int cCol) {
        if (cRow > m || cCol > n)  return 0;
        if (cRow == m-1 && cCol == n-1) return 1;
        int choice1 = paths(m, n, cRow+1, cCol);
        int choice2 = paths(m, n, cRow, cCol+1);
        return choice1 + choice2;
    }
    public static int[] next(int[] arr,int[] arr1,int indx) {
        if(indx==arr1.length-1){
            arr1[indx]=arr[indx+1]+arr[indx];
            return arr1;
        }
        arr1[indx]=arr[indx+1]+arr[indx];
        next(arr, arr1, indx+1);
      return arr1;  
    }
    public static void sumTraingle(int arr[]) {
        if(arr.length==1){
            System.out.print(arr[0]+" ");
            System.out.println();
            return;
        }
        int arr1[]=new int[arr.length-1];
        sumTraingle(next(arr, arr1, 0));
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void printCombinations(int[] arr, int n, int r) {
        int[] data = new int[r]; // temporary array to store current combination
        combinationUtil(arr, n, r, 0, data, 0);
    }

    // Utility function to generate all combinations
    private static void combinationUtil(int[] arr, int n, int r, int index, int[] data, int i) {
        // When combination is ready to be printed
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }

        // When no more elements are there to put in data[]
        if (i >= n) {
            return;
        }

        // Current is included, put next at next location
        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1, data, i + 1);

        // Current is excluded, replace it with next (Note that
        // i+1 is passed, but index is not changed)
        combinationUtil(arr, n, r, index, data, i + 1);
    }
    public static void alternate(int[] a,int b[],int indx,int no) {
        if(indx>b.length-1||indx>a.length-1)return;
        if(no==b.length-1){
            System.out.println(b[indx]);
            return;
        }
    }
    public static String alternateString(String a,String b,int indx) {
        if(indx>a.length()-1&&indx>b.length()-1)return "";
        if(indx<a.length()&&indx<b.length()){
            return ""+a.charAt(indx)+b.charAt(indx)+alternateString(a, b, indx+1);
        }else if(indx<a.length()){
            return ""+a.charAt(indx)+alternateString(a, b, indx+1);
        }else return ""+b.charAt(indx)+alternateString(a, b, indx+1);
    }
    public static String subString(String s,int indx) {
        if(indx>s.length()-1)return "";
        if(Character.isUpperCase(s.charAt(indx)))return s.substring(indx, s.length());
        return subString(s, indx+1);  
    }
    public static int countConsonants(String s,int indx) {
        int count=0;
        if(indx>s.length()-1)return 0;
        if(!MyString.isvowel(s.charAt(indx)))count++;
        return count+=countConsonants(s, indx+1);
    }
    public static int countLowercase(String s,int indx) {
        int count=0;
        if(indx>s.length()-1)return 0;
        if(Character.isLowerCase(s.charAt(indx)))count++;
        return count+=countLowercase(s, indx+1);
    }public static int aoi(String s,int indx) {
        if(indx<=-1)return 0;
    return (aoi(s, indx-1)*10)+s.charAt(indx)-'0';
    }
    public static void printNum(int curr,int next) {
        
    }
    public static void digitsNumber(int n,int curr,int next) {
        if(n==0)return;
        if(next==9){
            System.out.println(curr+""+next);
            return;
        }
        digitsNumber(n, curr, next);
    }
    public static void printNDigitNumber(int start, String out, int n) {
        if (n == 0) {
            System.out.print(out + " ");
            return;
        }
        for (int i = start; i <= 9; i++) {
            String str = out + Integer.toString(i);
            printNDigitNumber(i + 1, str, n - 1);
        }
    }
    public static void insertionSort(int[] arr,int indx) {
        if(indx==0)return;
        if(arr[indx]>arr[indx-1])return;
        if(arr[indx]<arr[indx-1]){
            arr[indx]=arr[indx]^arr[indx-1];
            arr[indx-1]=arr[indx]^arr[indx-1];
            arr[indx]=arr[indx]^arr[indx-1];
        }insertionSort(arr, indx-1);
    }
    public static void recursiveInsertionSort(int[] arr,int indx) {
        if(indx>arr.length-1)return;
        insertionSort(arr, indx);
        recursiveInsertionSort(arr, indx+1);
    }
    public static void main(String[] args) { 
     
    }
}