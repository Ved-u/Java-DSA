import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
public class MyPractice {
    public static void binToDec(int bin) {
            int ans = 0;
            int pw = 1;
            while (bin > 0) {
                ans +=(pw * bin % 10);
                bin /= 10;
                pw *= 2;
            }
            System.out.println(ans);
        }
    
    public static void leftRightShift(int a) {
        System.out.println(a << 2);
        System.out.println(a >> 2);
    }
    public static void isPositive(int n) {
        if (n > 0)
            System.out.println("positive");
        else
            System.out.println("negetive");
    }
    public static void fever(int n) {
        if (n >= 100)
            System.out.println("fever");
        else
            System.out.println("good");
    }
    public static void day(int n) {
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
    public static void evenOddSum(int n) {
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("enter no.");
            // n=sc.nextInt();
            if (n % 2 == 0)
                evenSum += n;
            else
                oddSum += n;
        } while (n != -1);
        System.out.println("evensum" + evenSum);
        System.out.println("oddsum" + oddSum);
    }
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) { 
            System.out.println(n + "x" + i + "=" + i * n);
        }
    }
    
    public static float averageThree(float a, float b, float c) {
        return (a + b + c) / 3;
    } 
    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        return false;
    }
    public static void sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        System.out.println(sum);
    }
    public static int factorial(int n){
        int fact=1;
        if(n==1||n==0)return fact;
        while(n>1){
            fact*=n;
            n--;
        }
        return fact;
    }

    public static void areaTraingle(float a,float b,float c){
        float s= (a+b+c)/2f;
        double area= Math.sqrt( (s*(s-a)*s*(s-b)*s*(s-c))  ) ;
        System.out.println("Are:"+area);
    }
    public static void timeAddition() {
        int counter = 0;
        int hr = 0;
        int min = 0;
        int sec = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Time in hh-mm-ss");
            hr += sc.nextInt();
            min += sc.nextInt();
            sec += sc.nextInt();
            while (sec >= 60) {
                min++;
                sec -= 60;
            }
            while (min >= 60) {
                hr++;
                min -= 60;
            }
            System.out.println("\n Total Answer: \n Hours: " + hr + "\n Minutes: " + min + "\n Seconds: " + sec + "\n");
            counter++;
        } while (counter <= 100);
        sc.close();
    }
    public static void swappingWithout3rd(int x,int y) {
        System.out.println("1st:" + x);
        System.out.println("2nd:" + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("1st:" + x);
        System.out.println("2nd:" + y);
    }
    public static void continousSum() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num != -1) {
            sum = sum + num;
            num = sc.nextInt();
        }
        System.out.println("uptill sum: " + sum);
        sc.close();
    }

    public static void leapYear(int n) {
        if ((n % 4 == 0 && !(n % 100 == 0)) || n % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("noot leap year");
        }
    }

    public static void armstrongNumber(int num) {
        int n = num;
        int pow = 0;
        while (n > 0) {
            pow++;
            n /= 10;
        }
        int armstrongNumber = 0;
        n = num;
        while (n > 0) {
            armstrongNumber += (int) (Math.pow(n % 10, pow));
            n /= 10;
        }
        if (armstrongNumber == num)
            System.out.println("armstrong number");
        else
            System.out.println("not a armstrong number");
    }

    public static void palindrome(int num) {
        int n = num;
        int reverseNum = 0;
        while (n > 0) {
            reverseNum = reverseNum * 10 + (n % 10);
            n /= 10;
        }
        if (reverseNum == num)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }

    public static int reverseNumber(int n) {
        int reverseNum = 0;
        while (n > 0) {
            reverseNum = reverseNum * 10 + (n % 10);
            n /= 10;
        }
        return reverseNum;
    }

    public static void arthmaticProgration(int start, int comDiff, int noTimes) {
        // genral form => a+ad+a2d+a3d+...
        int term = start;
        for (int i = 1; i <= noTimes; i++) {
            System.out.print(term + ",");
            term += comDiff;
        }
    }

    public static void geometricProgression(int start, int comRatio, int noTimes) {
        // general form => a+ar+ar^2+ar^3+...
        int term = start;
        for (int i = 1; i <= noTimes; i++) {
            System.out.print(term + ",");
            term *= comRatio;
        }
    }

    public static void fibonacciSeries(int noTerms) {
        int first = 0, second = 1, next;
        for (int i = 0; i <= noTerms; i++) {
            System.out.print(first + " ");
            next = first + second;
            second = first;
            first = next;
        }
    }

    public static void simpleIntrest(int p,int t,float r) {
        float i = (p * r * t) / 100;
        System.out.println("simple intrest:" + i);
    }
    public static void compoundIntrest(int p, double r, int n, int t) {
        // formula is CI=p*(1+(r/n))^nt
        // p=principle t=time r=anual intrest rate
        // n=number of times the intrest is compounded per unit time
        double ci;
        ci = p * Math.pow((1 + (r / n)), n * t);
        System.out.println("compund intrest is: " + ci);
    }
    public static void primeRange(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.println("prime number"+i);
            }
        }
    }

    public static void quadraticRoots(int a,int b,int c){
            int discriminant=(b*b)-(4*a*c);
            double r1,r2;
            if(discriminant>0){
                r1=(-b+Math.sqrt(discriminant))/(2*a);
                r2=(-b-Math.sqrt(discriminant))/(2*a);
                System.out.println("roots to this quadratic equation are:"+r1+" "+r2);
            }else if(discriminant==0){
                r1=-b/(2*a);
                r2=r1;
                System.out.println("roots to this quadratic equation are equal:"+r1+" "+r2);
            }else{
                 r1=-b/(2*a);
                r2=(Math.sqrt(-discriminant))/(2*a);
                System.out.println("roots to this quadratic equation are:"+"\n"+r1+"+"+r2+"i"+"\n"+r1+"-"+r2+"i");
            }
    }
    public static void mergingMasking(){
            byte a=9,b=12;
            byte c=b;
            a=(byte)(a<<4);
            c=(byte)(c|a);
            System.out.println(c);
            c=(byte)(a<<4);
            c=(byte)(c|b);
            System.out.println((c&0b11110000)>>4);
            System.out.println((c&0b00001111)>>4);
            c=(byte)(9<<4);
            c=(byte)(c|12);
            System.out.println((c&0b11110000)>>4);
            System.out.println((c&0b00001111)>>4);
    }
    public static String evenOdd(int x){
        return (x%2==0)?"Even":"Odd";
    }
    public static void numberOfDigits(int orgno){
        int n=orgno;
        int nod=0;
        while (n>0) {
            n=n/10;
            nod++;
        }
        System.out.println("number of digits in number:"+orgno+"are:"+nod);
    }    
    public static void utptillSquare(){
        int n = 25;
        for(int i = 1; i * i <= n; i++){
            System.out.print(i*i + " "); 
        }
    }
    
    public static void GCD_HCF(int a,int b){
        //GCD means Greatest-Common-Factor
        //GCD also called as HCF => Highest Common Factor
        int GCD=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0)GCD=i;
        }
        System.out.println("GCD/HCf is: "+GCD);
    }
    public static int max3No(int a,int b,int c){
        return Math.max(Math.max(a, b),c);
    }

    public static void factorialTillN(int n){
        for(int i=1;i<=n;i++){
            System.out.println(factorial(i));
        }
    }

    public static void bitwiseEvenOdd(int n){
        int bitmask=1;
        if ((n&bitmask)==0) System.out.println("even");  
            else System.out.println("odd"); 
        }
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if ((n&bitmask)==0) {
        return 0;
        } else {
        return 1;
        }
        }
    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
        }
    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        
            return n&bitmask;
    }
    public static int updateIthBit(int n,int i,int nb){
        n=clearIthBit(n, i);
        int bitmask=nb<<i;
        System.out.println(n|bitmask);
        if (nb==0) {
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }     
    public static int clearIBits(int n,int i){
        int bitmask=((~0)<<i);
        return n&bitmask;
    }

    public static int clearIJBits(int n,int i,int j){
        int a=((~0)<<j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static int countBits(int n){
        int count=0;
        while (n>0) {
        if ((n&1)==1) {
            count++;
        }n=n>>1;
        }
        return count;
    }

    public static int EffPow(int n,int a){
        int ans=1;
        while (n>0) {
        if ((n&1)==1) {
            ans=ans*a;
        }a=a*a;
        n=n>>1;
        }
        return ans;
    }

    public static void calcUsingSwitch(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int x=sc.nextInt();
        System.out.println("Enter 2nd no:");
        int y=sc.nextInt();
        System.out.println("Enter operation to perform on these 2 no.s ");
        char c = sc.next().charAt(0);
        int z;
        switch (c) {
            case '+':
            z=x+y;
            System.out.println("Addition:"+z);    
                break;
            case '-':
            z=x-y;
            System.out.println("substration:"+z);    
                break;    
            case '*':
            z=x*y;
            System.out.println("multiplication:"+z);    
                break;
            case '/':
            z=x/y;
            System.out.println("division:"+z);    
                break;    
            default:
            System.out.println("Entered wrong operator choic:");
                break;
        }
        sc.close();
    }
    public static void addDigits(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println("sum of given no:"+sum);
        sc.close();
    }
    public static void alternateSignSum(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for (int i=1;i<=n;i++) {
            if (i%2==0) {
                ans-=i;
            } else {
                ans+=i;
            }
        }    
        System.out.println(ans);
        sc.close();
    }
    public static int getNextPrime(int prime) {
        while (true) {
            prime++;
            if (isPrime(prime))return prime;
        }
    }

    public static boolean isPrime(int prime1) {
        if (prime1 <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(prime1); i++) {
            if (prime1 % i == 0)
                return false;

        }
        return true;
    }

    public static boolean isSumPrime(int n) {
        if (isPrime(n) && isPrime(n - 2)) {
            return true;
        }
        return false;
    }
    
    public static int binomialCoefficient(int n,int r ){
        //binomial coefficiennt(nCr)=n!/((r!)*(n-r))
    return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void printCurrentTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd h:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }

    public static void alternateBulbs(int n) {
        // only perfect square numbers in the range 1-n are on after nth toggles
        boolean bulbs[] = new boolean[n + 1];
        n = 1;
        while (n <= bulbs.length) {
            for (int i = 1; i <= bulbs.length - 1; i++) {
                if (i % n == 0)
                    bulbs[i] = !(bulbs[i]);
            }
            n++;
        }
        for (int i = 1; i <= bulbs.length - 1; i++) {
            if (bulbs[i])
                System.out.print(i + " ");
        }
    }

    public static int countVowels(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                ans++;
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U')
                ans++;
        }
        return ans;
    }

    public static void middleChar(String str) {
        // if even 2 mid chars and if odd then 1 mid char
        if (str.length() % 2 == 0)
            System.out.println(str.charAt((str.length() - 1) / 2) + " " + str.charAt(str.length() / 2));
        else
            System.out.println(str.charAt(str.length() / 2));
    }

    public static int min3(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void printFibonacci(int n){
        int first=0;
        int second=1;
        int next;
        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            next=first+second;
            first=second;
            second=next;
        }
    }//fibonaci palindrome armstrong prime 
    public static boolean isArmstrong(int n) {
        int temp = n;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        n = temp;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, count);
            n /= 10;
        }
        return sum == temp;
    }

    public static void decToBin(int dec) {
        int bin=0;int count=0;
        while(dec>0){
            bin+=dec%2*Math.pow(10,count);
            dec/=2;
            count++;
        }
        System.out.println(bin);
    }

    public static void nFactorial(int n){
        for(int i=1;i<=n;i++){
            System.out.print(factorial(i)+" ");
        }
    }
    public static void copyFileToOther() throws Exception{
        FileInputStream fi=new FileInputStream("inputFile.txt");
        byte[]content=new byte[fi.available()];
        fi.read(content);
        FileOutputStream fo=new FileOutputStream("outputFile.txt");
        for(byte x:content){
             char temp=(char)x;
             System.out.print(Character.toUpperCase(temp));
            fo.write(Character.toUpperCase(temp));
        }
        fi.close();
        fo.close();
    }  
    public static void decTobin(int n) {
      int bin=0,count=0;
      while(n>0){
        bin+=n%2*Math.pow(10, count++);
        n/=2;
      }
      System.out.println(bin);
    }
    public static void binTodec(int n) {
        int dec=0,count=0;
        while(n>0){
            dec+=n%2*Math.pow(2, count++);
            n/=10;
        }
        System.out.println(dec);
    }
    public static void transformers() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        for (int i = 1; i <= t; i++) {
            int p = sc.nextInt(); // Number of planets
            int m = sc.nextInt(); // Maximum number of Autobots Megatron can fight
            int arr[] = new int[p];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            int maxPlanets = 0, minAutobots = 0;
            for (int start = 0; start < p; start++) {
                int currentSum = 0, currentPlanets = 0;
                for (int end = start; end < p; end++) {
                    if (currentSum + arr[end] <= m) {
                        currentSum += arr[end];
                        currentPlanets++;
                    } else {
                        break;
                    }
                }
                if (currentPlanets > maxPlanets) {
                    maxPlanets = currentPlanets;
                    minAutobots = currentSum;
                } else if (currentPlanets == maxPlanets) {
                    minAutobots = Math.min(minAutobots, currentSum);
                }
            }
            System.out.println(minAutobots + " " + maxPlanets);
        }
        sc.close(); 
    }
    public static void books(String[] args) {
        class Book {
            private String title;
            private String author;
            private String genre;
        
            public Book(String title, String author, String genre) {
                this.title = title;
                this.author = author;
                this.genre = genre;
            }
        
            public String getTitle() {
                return title;
            }
        
            // public String getAuthor() {
            //     return author;
            // }
        
            public String getGenre() {
                return genre;
            }
        }
        Scanner scanner = new Scanner(System.in);

        // Read the number of books
        int N = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create a list to store the books
        List<Book> books = new ArrayList<>();

        // Read the books
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String title = parts[0].trim();
            String author = parts[1].trim();
            String genre = parts[2].trim();
            books.add(new Book(title, author, genre));
        }

        // Sort the books by genre
        Collections.sort(books, Comparator.comparing(Book::getGenre));

        // Extract the titles
        String[] sortedTitles = new String[N];
        for (int i = 0; i < N; i++) {
            sortedTitles[i] = books.get(i).getTitle();
        }

        // Output the sorted titles
        for (String title : sortedTitles) {
            System.out.println(title);
        }
        scanner.close();
        
    }
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min])min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int x:arr)
            System.out.print(x+" ");
    }
    public static void selectionSortPractice(int[] args) {
        for(int i=0;i<args.length;i++){
            int min=i;
            for(int j=i;j<args.length;j++){
                if(args[j]<args[min])min=j;
            }
           int temp=args[i];
           args[i]=args[min];
           args[min]=temp;
        }
        for(int x:args)
            System.out.print(x+" ");
    }
    public static void main(String[] args) {
        //timeAddition();
        int arr[]={2,3,1,4,1,2,4,7,6,8,5,9,3,3,0};
        selectionSortPractice(arr);

    }
   
}