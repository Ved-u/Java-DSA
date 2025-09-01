import java.util.*;
public class MyArrays {
    public static int[][] printInputed2DArray() {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int nums[][] = new int[row][col];
        // inputting array
        for (int[] num : nums) {
            for (int j = 0; j < num.length; j++) {
                num[j] = sc.nextInt();
            }
        }
        // outputting same array
        for (int[] num : nums) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
        sc.close();
        return nums;
    }
    public static void printArray(int[] args) {
        for(int x:args)
            System.out.print(x+" ");
        System.out.println();    
    }
    public static void printArray(int[][] arr) {
        for(int x[]:arr){
            printArray(x);
            System.out.println();
        }
    }
    public static void search2DArray(int nums[][], int key) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == key) {
                    System.out.println("key found at:" + "(" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("key not found");
    }

    public static void diagonalSum(int nums[][]) {
        // Square matrix
        //O(N^2)
          int primSum = 0;
          int secSum = 0;
          for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    if (i == j)
                        primSum += nums[i][j];
                    else if (i + j == nums.length - 1)
                        secSum += nums[i][j];
                }
            }
         System.out.println(primSum + secSum);
    }
    public static void diagonalSumOptimized(int nums[][]) {
        // vO(N)
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i][i];// primSum sum
            if (i != (nums.length - 1 - i)) {
                sum += nums[i][nums.length - 1 - i]; // secSum sum
            }
        }
        System.out.println(sum);
    }
    public static boolean binarySearch2DArray(int nums[][], int key){
        // binary search in rowise approach(binary search in each array)O(NlogN)
        int left;
        int mid;
        int right;
          for(int i=0;i<nums.length;i++){
            left=0;
            right=nums[i].length-1;
            while(left<=right){
                 mid=(left+right)/2;
                 if(nums[i][mid]==key){
                 System.out.println("key found at:"+i+" "+mid);
                 return true;
                }else if(nums[i][mid]<key){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
          }
        System.out.println("key not found");
        return false; 
    }
    public static Boolean staircase2DArraySearchTR(int nums[][], int key){
        // staircase-search because columnwise sorted array O(N+M) [TOP-RIGHT]
          int row=0;
          int col=nums[0].length-1;
          while(row<nums.length&&col>=0){
            if(nums[row][col]==key){
                System.out.println("key found at"+row+" "+col);
                 return true;
            }else if(nums[row][col]<key){
             row++;
            }else{
            col--;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static Boolean staircase2DArraySearchBL(int nums[][], int key) {
        // staircase-search becaude columnwise sorted array O(N+M) [BOTTOM-LEFT]
        int row = nums.length - 1;
        int col = 0;
        while (row >= 0 && col < nums[0].length) {
            if (nums[row][col] == key) {
                System.out.println("key found at:" + row + " " + col);
                return true;
            } else if (nums[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
        System.out.print("key not found");
        return false;
    }

    public static void reverseArray(int nums[]) {
        int first = 0;
        int last = nums.length - 1;
        while (first < last) {
            // swap
            nums[first] = nums[first] ^ nums[last];
            nums[last] = nums[first] ^ nums[last];
            nums[first] = nums[first] ^ nums[last];
            first++;
            last--;
        }
        printArray(nums);
    }

    public static void arrayPairs(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                System.out.print("(" + nums[i] + "," + nums[j] + ")");
            System.out.println();
        }
    }

    public static void subArrays(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    // this loop is for printing all the elements form i to jth place
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void subArraySum(int nums[]) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                min = Math.min(min, sum);
                max = Math.max(max, sum);
            }
        }
        System.out.print("min" + min + " " + "max" + " " + max + " ");
    }

    public static void prefixSumSubArray(int nums[]) {
        // [MAX SUB-ARRAY SUM]=>to calculate sum of sub arrays in O(N) complexity
        int prefSum[] = new int[nums.length];
        prefSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefSum[i] = prefSum[i - 1] + nums[i];
        }
        int currsum;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currsum = 0;
            for (int j = i; j < nums.length; j++) {
                currsum = (i == 0) ? prefSum[j] : prefSum[j] - prefSum[i - 1];
                max = Math.max(max, currsum);
            }
        }
        System.out.println("max sum:" + max);
    }

    public static void kadanesAlgorith(int nums[]) {
        // here it calculates maximum-sub-array sum from given array using
        // Kadanes_Algorithm
        // this algorithm states that when we add a small +ve value to a big -ve value
        // the output is a -ve value so instead of taking this -ve value we take 0 into sum
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int negValues = 0;
        int largestNegValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {// when all values are -ve this algo gives 0 so to tackle this we return largest
                              // -ve value
                negValues++;
                largestNegValue = Math.max(largestNegValue, nums[i]);
            }
            currSum += nums[i];
            if (currSum < 0)
                currSum = 0;
            maxSum = Math.max(currSum, maxSum);
        }
        if (negValues == nums.length)
            System.out.print("max sum of sub array" + largestNegValue);
        else
            System.out.println("max sum of sub array" + maxSum);
    }

    public static void trappedRainwater(int height[], int width) {
        // using Auxilary(helper array)to calculate left-max-boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // using Auxilary(helper array)to calculate left-max-boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // calculating trapped rainwater with help of these 2 arrays
        int trappedRainwater = 0;
        int waterLevel;
        for (int i = 0; i < height.length; i++) {
            // water-level equals min(leftMax,rightMAx)
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped rainwater= (waterLevel-currHeight)*widthOfColumn
            trappedRainwater += (waterLevel - height[i]) * width;
            // in shradha question width was 1 but it can be different
        }
        System.out.print("trapped rainwater: " + trappedRainwater);
    }
    public static void buySellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]) profit=Math.max(prices[i]-buyPrice,profit);
            else buyPrice=prices[i];
        }//price[i] is also sell price while we iterate in loop
        System.out.print(" max profit: "+profit);
    }
    public static void commandLineArgumentSum(String[]args){
        double sum=0;
        for(String x:args){
         sum+=Double.parseDouble(x);
        }
        System.out.println("sum: "+sum);
    }
    
    public static void largestSecondLargest(int nums[]){
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int x:nums){
            if(x>max){
                max2=max;
                max=x;
            }else if(x>max2)max2=x;
        }
        System.out.print("largest: "+max+"\n"+"2nd largest: "+max2);
    }
    public static void rotatingArray(int nums[]){
        //left rotation by 1
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
            if(i==nums.length-1)nums[i]=temp;
        }
        System.out.println("left rotated array by 1");
        printArray(nums);
        temp=nums[nums.length-1];
        System.out.println("\nright rotated array by 1");
        for(int i=nums.length-2;i>=0;i--){
            nums[i+1]=nums[i];
            if(i==0)nums[i]=temp;
        }
        printArray(nums);
    }
    public static void insertElement(int nums[],int element,int position,int filled){
        for(int i=filled-1;i>=position;i--){
            nums[i+1]=nums[i];
            if(i==position)nums[i]=element;
        }
        printArray(nums);
    }
    public static void deleteElement(int nums[],int position,int filledd){
        for(int i=position;i<filledd;i++){
            nums[i]=nums[i+1];
        }
        printArray(nums);
    }
    public static void increaseSizeOfArray(int nums[]){
        int [] big=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            big[i]=nums[i];
        }
        nums=big;
        big=null;
       System.out.println(big);
       System.out.println(nums.length);
        printArray(nums);
    }
    public static void additionMatrices(int nums[][],int num[][]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]+=num[i][j];
            }
        }
        printArray(nums);
    }
    public static void multiplicationOfMatrices(int nums[][], int num[][]) {
        // Check if multiplication is possible
        if (nums[0].length != num.length) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix");
        }
        int result[][] = new int[nums.length][num[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                for (int k = 0; k < nums[0].length; k++) {
                    result[i][j] += (nums[i][k] * num[k][j]);
                }
            }
        }
       printArray(result);
    }
    public static int variableArgumentsMax(int... x) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max)
                max = x[i];
        }
        return max;
    }
    public static int variableArgumentsSum(int... x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

    public static double variableArgumentsDiscount(double... prices) {
        double sumPrice = 0;
        for (double x : prices) {
            sumPrice += x;
        }
        if (sumPrice <= 500)
            return sumPrice - (0.10 * sumPrice);
        if (sumPrice > 500 && sumPrice <= 1000)
            return sumPrice - (0.20 * sumPrice);
        if (sumPrice > 1000)
            return sumPrice - (0.30 * sumPrice);
        return sumPrice - (0.05 * sumPrice);
    }
    public static void sortString(String str[]){
        Arrays.sort(str);
        for(String x:str){
            System.out.print(x+" ");
        }
    }
   
    public static int[] optimizedBubbleSort(int nums[]) {
        // O(N)time complexity
        int temp = 0;
        boolean check;
        for (int turns = 0; turns < nums.length - 1; turns++) {
            check = false;
            for (int j = 0; j < nums.length - 1 - turns; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    check = true;
                }
            }
            if (!check) {
                break;
            }
        }
        return nums;
    }
    public static void selectionSort(int nums[]) {
        //selection sort it'll still takes O(N^2) complexity even in best case
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++)
                // get min element
                if (nums[min] > nums[j]) 
                    min = j;
            // swap
            if(min!=i){
                nums[i]=nums[i]^nums[min];
                nums[min]=nums[i]^nums[min];
                nums[i]=nums[i]^nums[min];
            }
        }
        printArray(nums);
    }
    public static int[] insertionSort(int nums[]){
        //insertion sort it'll still takes O(N^2) complexity even in best case
        int prev;
        int curr;
        for(int i=1;i<nums.length;i++){
            curr=nums[i];
            prev=i-1;
            while(prev>=0&&nums[prev]>curr){
               nums[prev+1]=nums[prev]; 
               prev--;
            }
            nums[prev+1]=curr;
        }
        return nums;
    }
    public static int[] countingSort(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)max=nums[i];
        }
        int count[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j++]=i;
                count[i]--;
            }
        }
        return nums;
    }
    static void rotateByKTimes(int[]arr,int k){
        //right roatation
        int t=k%(arr.length);
        int temp=0;
        if(t==0){
            System.out.println("ha block");
        }else{  
        for(int i=0;i<t;i++){
            for(int j=arr.length-1;j>=0;j--){
                if(j==arr.length-1){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                }
                else if(j==0)arr[j]=temp;  
                else arr[j]=arr[j-1];  
                
            }
        }
        }
        printArray(arr);
    }
    public static boolean isSorted(int arr[]){
        //non-decreasing
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])return false;
        }
    return true;    
    }
    public static int[] smallestAndLargestInArray(int arr[]){
        int ans[]=new int[2];
        ans[0]=Integer.MAX_VALUE;
        ans[1]=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans[1])ans[1]=arr[i];
            if(arr[i]<ans[0])ans[0]=arr[i];
        }
        return ans;
    }
    public static int[] kthsmallestAndLargestInArray(int arr[],int k){
        Arrays.sort(arr);
        int ans[]=new int[2];
        ans[0]=arr[k-1];
        ans[1]=arr[arr.length-k];
        return ans;
    }
    public static void sort10(int arr[]){
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]==1&&arr[right]==0){
                arr[left]=arr[left]^arr[right];
                arr[right]=arr[left]^arr[right];
                arr[left]=arr[left]^arr[right];
                left++;
                right--; 
            }else if(arr[right]==1)
                right--;
            else left++;
        }
    }
    public static void sortEvenOdd(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                arr[left]=arr[left]^arr[right];
                arr[right]=arr[left]^arr[right];
                arr[left]=arr[left]^arr[right];
                left++;
                right--;
            }else if(arr[right]%2==1)
                right--;
            else left++;
        }
    }
    public static int[] sortNSquare(int[] arr) {
        //array also contains -ve values
        int left=0,right=arr.length-1;
        int ans[]=new int[arr.length];
        int count=arr.length-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[count--]=arr[left]*arr[left];
                left++;
                right--;
            }else{
                arr[count--]=arr[right]*arr[right];
                right--;
            }    
        }
        return ans;
    }
    public static void qQueriesPrefSum(int[] arr,int[]queries) {
        //1-r range
        prefSum(arr);
        for(int x:queries){
            System.out.print(arr[x]+" ");
        }
    }
    public static int prefSumRange(int[] arr,int l,int r) {
        //l to r range
        //prefSum(arr);
        if(l==0)return arr[r];
        return arr[r]-arr[l-1];
    }    
    public static void prefSum(int[] arr) {
        for(int i=1;i<arr.length;i++)
            arr[i]+=arr[i-1];
        //printArray(arr);
    }
    public static void suff(int[] arr) {
        for(int i=arr.length-2;i>=0;i--){
            arr[i]+=arr[i+1];
        }
        //printArray(arr);
    }
    public static boolean isPartition(int[] arr) {
        int suff[]=arr.clone();
        suff(suff);
        prefSum(arr);
        int count=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==suff[count])return true;
            count--;
        }
    return false;    
    }
    public static void rangeSumOptimized(int arr[][],int strtRow,int startCol,int endRow,int endCol){
        int sum=0;
        for(int x[]:arr){
            prefSum(x);
        }
        for(int i=strtRow;i<=endRow;i++){
            sum+=(prefSumRange(arr[i], startCol, endCol));
        }
        System.out.println(sum); 
    }
    public static void rowColPrefSum(int[][] arr) {
        for(int x[]:arr){
            prefSum(x);
        }//row-wise prefix sum
        for(int i=0;i<arr[0].length;i++){
            for(int j=1;j<arr.length;j++){
                arr[j][i]+=arr[i][j-1];
            }
        }
        printArray(arr);
    }
    public static int[] suffixSum(int[] arr) {
        int suf[]=new int[arr.length];
        suf[suf.length-1]=arr[arr.length-1];
        int sum=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            suf[i]=arr[i]+sum;
            sum=suf[i];
        }
        return suf;
    }
    public static boolean isDividableIn2Parts(int[] arr) {
        int suf[]=suffixSum(arr);
        prefSum(arr);
        for(int i=0;i<arr.length;i++){
            if(suf[i]==arr[i])return true;
        }
    return false;    
    }
    
    public static void forEachEven(int arr[]){
        for(int x:arr){
            if(x%2==0)System.out.print(x+" ");
        }
    }
    public static void peakArray(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
                break;
            }
        }
    }
    public static void transposeMAtrix(int arr[][]){
        int ans[][]=new int[arr[0].length][ arr.length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j]=arr[j][i];
            }
        }
        printArray(ans);
    }
    public static void transposeInPlace(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                arr[i][j]=arr[i][j]^arr[j][i];
                arr[j][i]=arr[i][j]^arr[j][i];
                arr[i][j]=arr[i][j]^arr[j][i];
            }
        }
      
    }
    
    public static void rotate90Degree(int [][]arr){
        transposeInPlace(arr);
        for(int x[]:arr){
            reverse(x);
        }
        printArray(arr);
    }
    public static void rotateArrayByKTimesOptimized(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void qTimesSearch(int[] arr, int[] q) {
        boolean[] freq = new boolean[1];// false
        boolean[] ans = new boolean[q.length];// false
        for (int i = 0; i < arr.length; i++) {
            if (!(freq[arr[i]]))
                freq[i] = !freq[i];
        }
        for (int i = 0; i < q.length; i++) {
            if (freq[q[i]]) {
                ans[i] = !ans[i];// true
            }
        }
        for (boolean x : ans)
            System.out.print(x + " ");
    }

    public static void swapArray(int left, int right, int arr[]) {
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];
    }

    public static void sort0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArray(left, right, arr);
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
        printArray(arr);
    }

    public static void sortEvenOddArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swapArray(left, right, arr);
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
        printArray(arr);
    }

    public static void squareNonDecreasing(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] ans = new int[arr.length];
        int k = arr.length - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        printArray(ans);
    }

    public static int[] prefixSum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
    public static int[][] prefixSum(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
           for(int j=1;j<arr[i].length;j++){
                arr[i][j]+=(arr[i][j-1]);
           }
        }
        return arr;
    }
    
    public static int prefixSumRange(int arr[], int l, int r) {

        
        return( (arr[r] - arr[l - 1]));
    }

    public static boolean subArrayEqualSum(int arr[]) {
        int prefSum[] = new int[arr.length];
        prefSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefSum[i] = arr[i] + prefSum[i - 1];
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] += arr[i + 1];
            if (i > 0 && arr[i] == prefSum[i - 1])
                return true;
        }
        return false;
    }

    public static void additionMatrix(int arr[][], int arr2[][]) {
        if ((arr.length != arr2.length && arr[0].length != arr2[0].length)) {
            System.out.println("can't add matrices they need to be of same size:");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] += arr2[i][j];
            }
        }
        printArray(arr);
    }
    public static void multiplyMatrix(int arr[][],int arr2[][]){
        int r1=arr.length;
        int c1=arr[0].length;
        int r2=arr2.length;
        int c2=arr2[0].length;
        if(c1!=r2){
            System.out.println("you're in matrix cant multiply matrix");
            return;
        }
        int[][]ans=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j]+=(arr[i][k]*arr2[k][j]);
                }
            }
        }
        printArray(ans);
    }
    public static void printPositiveArray(int[]arr){
       for(int i=0;i<arr.length;i++){
            if(arr[i]>=0)System.out.print(arr[i]+" ");
       } 
    }
    
    public static void pascalTraingle(int n){
        int arr[][]=new int[n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                if(j==0||j==arr[i].length-1)arr[i][j]=1;
                else arr[i][j]=(arr[i-1][j])+(arr[i-1][j-1]);
            }
        }
        printArray(arr);
    }  
    public static void negetiveLat(int arr[]){
        int ans[]=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0)ans[count++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)ans[count++]=arr[i];
        }
        printArray(ans);
    } 
    public static void unionOfArrays(int arr[],int arr2[]){
        ArrayList<Integer> union=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!(union.contains(arr[i])))union.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!(union.contains(arr2[i])))union.add(arr2[i]);
        }
        for(int x:union){
            System.out.print(x+" ");
        }
    }  
    public static boolean areEqualArrays(int arr[],int arr2[]){
        if(arr.length!=arr2.length)return false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i])return false;
        }
    return true;    
    }
    public static void subArraySum(int arr[],int s){
        int start=0;
        int end=0;
        int sum=0;
        while(end<arr.length){
            sum+=arr[end++];
            if(sum==s){
                System.out.println(start+" "+end);
                return;
            }
            if(sum>s){
                while(start<=end){
                    sum-=arr[start++];
                    if(sum==s){
                        System.out.println(start+" "+(end-1));
                        return;
                    }
                } 
            }
        }
    }
    public static void spiralMatrix(int arr[][]){
        int startRow=0;
        int endCol=arr[0].length-1;
        int endRow=arr.length-1;
        int startCol=0;
        while(startRow<=endRow && startCol<=endCol){
            //up
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }
            //bottom
            if (startRow<=endRow){
            for(int j=endCol-1;j>=startCol;j--){   
                System.out.print(arr[endRow][j]+" ");
            }}
            //left
            if (startCol<=endCol){
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(arr[i][startCol]+" ");
            }}
            startRow++;
            endCol--;
            endRow--;
            startCol++;
        }
    }
    //generate nxn matrix filled with elements from 1-n^2 in spiral
    public static void spiralMatrix1ToNSquare(int n){
        int arr[][]=new int[n][n];
        int count=1;
        int startRow=0;
        int endCol=arr[0].length-1;
        int endRow=arr.length-1;
        int startCol=0;
        while(startRow<=endRow && startCol<=endCol){
            //up
            for(int j=startCol;j<=endCol;j++){
                arr[startRow][j]=count++;
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                arr[i][endCol]=count++;
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if (startRow==endRow){
                    break;
                }    
                arr[endRow][j]=count++;
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if (startCol==endCol){
                    break;
                }
                arr[i][startCol]=count++;
            }
            startRow++;
            endCol--;
            endRow--;
            startCol++;
        }
        printArray(arr);
    }
    public static void sumRectangleInMatrix(int [][]mat,int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void sumRectangleInMatrixPrefixSum(int [][]mat,int r1,int c1,int r2,int c2){
        prefixSum(mat);//n2
        int sum=0;
        for(int i=r1;i<=r2;i++){
           sum+=(prefixSumRange(mat[i],c1,c2));
        }//n
        System.out.println(sum);
    } 
    public static void parirsSumInArray(int arr[],int target){
        //how many pair(2) of elements whos sum == target
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target)ans++;
            }
        }
        System.out.println(ans);
    }  
    public static void parirsSumInArrayTriplet(int arr[],int target){
        //how many pair(2) of elements whos sum == target
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target)ans++;
                }
            }
        }
        System.out.println(ans);
    } 
    public static void uniqueElementInArray(int arr[]){
         boolean check;
        for(int i=0;i<arr.length;i++){
            check=false;//assume element doesnt exitst
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    check=true;
                    break;
                }
            }
            if(!(check)){
                System.out.println(arr[i]+" is unique");
                return;
            }    
        }
    }  
    public static void secondMax(int arr[]){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }else if(arr[i]>secMax && arr[i]!=max) secMax=arr[i];    
        }
        System.out.println(secMax);
    }
    public static void secondMin(int arr[]){
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                secMin=min;
                min=arr[i];
            }else if(arr[i]<secMin&&arr[i]!=min)secMin=arr[i];    
        }
        System.out.println(secMin);
    }
    public static int findLastRepeating(int arr[]){
        int last=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) last=arr[i];   
            }
        }
    return last;    
    }
    public static boolean absSumEqualsX(int arr[],int x){
        //sorted in non-dec
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==x)return true;
            }
        }
    return false;    
    }
    public static int totalOcc(int[] arr,int x) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)count++;
        }
        return count;
    }
    public static void findMissing(int arr[]){
        int n=arr.length;
        //arr[n-1] length is given consisting elements form range 1-n with single element missing from range 
        for (int i = 0; i < n; i++) {
            if (Math.abs(arr[i]) - 1 == n) {
            continue;
            }
            int ind = Math.abs(arr[i]) - 1;
            arr[ind] *= -1;
            }
            int ans = 0;
            for(int i = 0; i < n; i++) {
            if (arr[i] > 0){
            ans = i + 1;
            System.out.println(ans);
            return;
            }
            }
            System.out.println(n+1);
    }
    public static int firstRepeatingElement(int arr[]){
        int firstIndex=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])return i+1;
            }
        }
    return firstIndex;    
    }
    public static void alternateNumbers(int[]arr){
        int ans[]=new int[arr.length];
        int negCount=0;
        int posCount=0;
        for(int x:arr){
            if(x>=0)posCount++;
            else negCount++;
        }
        int[]neg=new int[negCount];
        int[]pos=new int[posCount];
        posCount=0;
        negCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0)pos[posCount++]=arr[i];
            else neg[negCount++]=arr[i];
        } 
        posCount=0;
        negCount=0;
        for(int i=0;i<ans.length;i++){
            if(i%2==0){
                if(negCount<neg.length){
                    ans[i]=neg[negCount++];
                }else{
                    ans[i]=pos[posCount++]; 
                }
            }else{
                if(posCount<pos.length){
                    ans[i]=pos[posCount++]; 
                    
                }else{
                    ans[i]=neg[negCount++];
                }
            }
        }
        printArray(ans);
    }
    public static void minNoNumberPlatforms(int arrival[],int dep[]){
    //  Given arrival and departure times of all trains that reach a railway station. Find the minimum number
    // of platforms required for the railway station so that no train is kept waiting.
    // Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure
    // time can never be the same for a train but we can have arrival time of one train equal to departure time
    // of the other. At any given instance of time, same platform can not be used for both departure of a train
    // and arrival of another train. In such cases, we need different platforms.
        int minPlatforms=0;
        for(int i=0;i<arrival.length;i++){
            if(i>0&&dep[i-1]<=arrival[i])minPlatforms--;
            else minPlatforms++;
        }//this code isnt complete yet solve it frm D:\CS\Study Material (ALPHA)
    System.out.println(minPlatforms);
    }
    public static void sort01Array2Pointer(int arr[]){
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                arr[left]=arr[left]^arr[right];
                arr[right]=arr[left]^arr[right];
                arr[left]=arr[left]^arr[right];
                left++;
                right--;
            }
            if(arr[left]==0)left++;
            if(arr[right]==1)right--;
        }
        printArray(arr);
    }
    public static void evenOddSort(int arr[]){
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                arr[left]=arr[left]^arr[right];
                arr[right]=arr[left]^arr[right];
                arr[left]=arr[left]^arr[right];
                left++;
                right--; 
            }
            if(arr[left]%2==0)left++;
            if(arr[right]%2!=0)right--;
        }
        printArray(arr);
    }
    public static int[] inputArray(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of elements to be entered in array: ");
       int size=sc.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter elements in array: ");
       for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
       }
       sc.close();
    return arr;
    }
    public static void trappedRainwater(int arr[]){
        //asssuming width=1;
        int trapH2O=0;
        int width=1;
        int []leftMax=new int[arr.length];
        int rightMax[]=new int[arr.length];
        leftMax[0]=arr[0];
        rightMax[arr.length-1]=arr[arr.length-1];
        //calculate leftMax and rightMax
        for(int i=1;i<arr.length;i++){
            //leftMax
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        for(int i=arr.length-2;i>=0;i--){
            //rightMax
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }
        //calculate rainwater
        for(int i=0;i<arr.length;i++){
            trapH2O+=((Math.min(leftMax[i],rightMax[i])-arr[i])*width);
        }
    System.out.println(trapH2O);    
    }
    public static void oddSum(int arr[]){
        int subArray=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1)subArray++;
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])%2==1)subArray++;
            }
        }
        System.out.println(subArray);
    }
    public static void increment(int a[]) {
        for(int i=0;i<a.length;i++){
            a[i]++;
        }
    }int a=0;
    public static void search(int arr[],int key){
        for(int x:arr){
            if(x==key){
                System.out.println("found");
                return;
            }
        }    
        System.out.println("not found");;
    }
    public static void smallestLargest(int[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:args){
            if(x<min)min=x;
            if(x>max)max=x;
        } 
        System.out.println("small:"+min);
        System.out.println("large:"+max);  
    }
    public static boolean sortedOrNot(int[] args) {
        for(int i=0;i<args.length-1;i++){
            if(args[i]>args[i+1])return false;
        }
    return true;    
    }
    public static int repeating(int[] args) {
        Arrays.sort(args);
        for(int i=0;i<args.length-1;i++){
            if(args[i]==args[i+1])return args[i];
        }
    return -1;    
    }
    //input
    public static void rotakeKTimes(int[] args,int k) { 
        //O(n^2)
        k%=args.length;
        int temp;
        for(int i=0;i<k;i++){//n
            temp=args[args.length-1];//n
            for(int j=args.length-2;j>=0;j--){
                args[j+1]=args[j];
            }
            args[0]=temp;
        }
        printArray(args);
    }
    public static void rotakeKTimesOptimized(int arr[],int k){
        int n=arr.length;
        k%=n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        printArray(arr);
    }
    public static void reverse(int[] arr,int start,int end) {
        while(start<end){
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
            start++;
            end--;
        }
    }
    public static void reverse(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end){
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
            start++;
            end--;
        }
    }
   
    public static void mulMatrix(int[][] m,int n[][]) {
        int r1,r2,c1,c2;
        r1=m.length;
        r2=n.length;
        c1=m[0].length;
        c2=n[0].length;
        if(c1!=r2){
            System.out.println("cannot be multiplied");
            return;
        }  
        int ans[][]=new int[r1][c2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                for(int k=0;k<r2;k++){
                    ans[i][j]+=(m[i][k]*n[k][j]);
                }
            }
        }  
        printArray(ans);
    }
    public static int [][] transpose(int[][] m) {
        int r1,c1;
        r1=m.length;
        c1=m[0].length;
        int trans[][]=new int[c1][r1];
        for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                trans[i][j]=m[j][i];
            }
        }
       // printArray(trans);
       return trans;
    }
    public static void rotate90(int[][] m) {
        m=transpose(m);
        for(int x[]:m)
            reverse(x);
        printArray(m);    
    }
    public static void pascal(int n) {
        int ans[][]=new int[n][];
        for(int i=0;i<ans.length;i++){
            ans[i]=new int[i+1];
            for(int j=0;j<ans[i].length;j++){
                if(j==0||j==ans[i].length-1){
                    ans[i][j]=1;
                }else{
                    ans[i][j]=(ans[i-1][j]+ans[i-1][j-1]);
                }
                
            }
        }
        printArray(ans);
    }
    public static void spiralOrder(int[][] arr) {
        int startRow=0,
        startCol=0,
        endRow=arr.length-1,
        endCol=arr[0].length-1;
        while(startRow<=endRow&&startCol<=endCol){
            //up
            for(int j=0;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            startRow++;
            //rigth
            for(int i=startRow;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }
            endCol--;
            if(startRow<=endRow){
            //bottom
            for(int j=endCol;j>=startCol;j--){
                System.out.print(arr[endRow][j]+" ");
            }
            endRow--;
            }   
            if(startCol<=endCol){
            //left
            for(int i=endRow;i>=startRow+1;i--){
                System.out.print(arr[i][startCol]+" ");
            }  
            startCol++; 
            }
        }
    }
    public static void spiral(int n) {
        int[][] arr = new int[n][n];
        int count = 1;
        int startRow = 0, startCol = 0;
        int endRow = arr.length - 1, endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // Fill top row
            for (int j = startCol; j <= endCol; j++) {
                arr[startRow][j] = count++;
            }
            startRow++;
            // Fill right column
            for (int i = startRow; i <= endRow; i++) {
                arr[i][endCol] = count++;
            }
            endCol--;
            // Fill bottom row
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    arr[endRow][j] = count++;
                }
                endRow--;
            }
            // Fill left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    arr[i][startCol] = count++;
                }
                startCol++;
            }
        }
        printArray(arr);
    }
    
    public static void qQueriersSum(int[][] arr, int r1, int c1, int r2, int c2) {
        // Compute row-wise prefix sums
        for (int[] row : arr) {
            prefSum(row);
        }
        // Compute column-wise prefix sums
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 1; i < arr.length; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
        // Calculate the submatrix sum
        int sum = arr[r2][c2];
        int up = r1 > 0 ? arr[r1 - 1][c2] : 0;
        int left = c1 > 0 ? arr[r2][c1 - 1] : 0;
        int leftUp = (r1 > 0 && c1 > 0) ? arr[r1 - 1][c1 - 1] : 0;

        int ans = sum - up - left + leftUp;
        System.out.println(ans);
    }
    public static void sort10Freq(int[] arr) {
        int freq[]=new int[2];
        for(int x:arr){
            if (x==0)freq[0]++;
            else freq[1]++;
        }int count=0;
        while(freq[0]>0||freq[1]>0){
            if(freq[0]>0){
                arr[count++]=0;
                freq[0]--;
            }else if(freq[1]>0) {
                arr[count++]=1;
                freq[1]--;
            }
        }
        printArray(arr);
    }
    public static void twoPointer(int[] arr) {
        int left=0;int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                arr[left]=arr[left]^arr[right];
                arr[right]=arr[left]^arr[right];
                arr[left]=arr[left]^arr[right];
                left++;
                right--;
            }else if(arr[left]%2==0){
                left++;
            }else{
                right--;
            }
        }
        printArray(arr);
    }
    public static void sortedSquare(int[] arr) {
        int ans[]=new int[arr.length];
        int left=0,right=arr.length-1;
        int count=arr.length-1;
        while(left<right){//n
            ans[count--]=Math.max(Math.abs(arr[left]),Math.abs(arr[right]));
            ans[count--]=Math.min(Math.abs(arr[left]),Math.abs(arr[right]));
            left++;
            right--;
        }
        for(int i=0;i<ans.length;i++){
            ans[i]*=ans[i];
        }
        printArray(ans);
    }
   
    public static void multiply(int[][] arr,int arr2[][]) {
        int r1,c1,r2,c2;
        r1=arr.length;
        c1=arr[0].length;
        r2=arr2.length;
        c2=arr2[0].length;
        if(c1!=r2){
            System.out.println("mul not possible");
            return;
        }
        int ans[][]=new int[r1][c2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                for(int k=0;k<r2;k++){
                    ans[i][j]=(arr[i][k]*arr2[k][j]);
                }
            }
        }
        printArray(ans);
    }
     //Problems on Array - 3
     public static boolean first(int[] arr,int m) {
        boolean check;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            check=true;
           for(int j=0;j<arr.length;j++){
                if(i==j)continue;
                if(arr[i]==arr[j]){
                    check=false;
                    break;
                }
           }
           if(check)ans++;
        }
        if(ans>=m)return true;
    return false;    
    }
    //problems on array 2
    public static int repaeatting(int[] arr) {
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]) return i;
        }
      }  
      return -1; 
    }
    public static void alternate(int[] arr) {
        //int ans[]=new int[arr.length];
        int posC=0,negC=0;
        for(int x:arr){
            if(x>=0)posC++;
            else negC++;
        }
        int positive[]=new int[posC];
        int negative[]=new int[negC];
        posC=0;negC=0;
        for(int x:arr){
            if(x>0)positive[posC++]=x;
            else negative[negC++]=x;
        }posC=0;
        negC=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(negC<negative.length){
                    arr[i]=negative[negC++];
                }else{
                    arr[i]=positive[posC++];
                }
            }else{
                if(posC<positive.length){
                    arr[i]=positive[posC++];
                }else{
                    arr[i]=negative[negC++];
                }
            }
        }
        printArray(arr);
    }
    public static void bubbleSort(int[] arr) {
        //increasing sort
        //to sort decreasing just reverse if constion
        boolean check;
        for(int i=0;i<arr.length-1;i++){
            check=true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    check=false;
                arr[j]=arr[j]^arr[j+1];
                arr[j+1]=arr[j]^arr[j+1];
                arr[j]=arr[j]^arr[j+1];
                }    
            }
            if(check)return;
        }
        printArray(arr);
    }
    public static void reverseArrayList(ArrayList<Integer>al){
        int left=0,right=al.size()-1;
        while(left<right){
            al.set(left,al.get(left)^ al.get(right));
            al.set(right,al.get(left)^ al.get(right));
            al.set(left,al.get(left)^ al.get(right));
            left++;
            right--;
        }
    }
    public static void selectionSortNew(int[] arr) {
        for(int i=arr.length-1;i>0;i--){
            int maxIndx=i;
            for(int j=0;j<i;j++)
                if(arr[j]>arr[maxIndx])maxIndx=j;
            //swap
            if(i!=maxIndx){
                arr[i]=arr[i]^arr[maxIndx];
                arr[maxIndx]=arr[i]^arr[maxIndx];
                arr[i]=arr[i]^arr[maxIndx];
            }    
        }
        printArray(arr);
    }
    public static void insertionSortNew(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                }else break;
            }
        }
    printArray(arr);
    }
    public static void peak(int arr[]) {
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    public static void sort(int arr[]) {
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]<0&&arr[right]>0){
                arr[left]=arr[left]^arr[right];
                arr[right]=arr[left]^arr[right];
                arr[left]=arr[left]^arr[right];
                left++;
                right--;
            }
            else if(arr[right]<0)right--;
            else left++;
        }
        printArray(arr);
    }
    public static void union(int n[],int m[]) {
        int freq[]=new int[10];
        for(int x:n){
            freq[x]++;
        }
        for(int x:m){
            freq[x]++;
        }
        int ans=0;
        for(int x:freq){
            if(x>0)ans++;
        }
        System.out.println(ans);
    }
    public static void subArray(int arr[],int s) {
        int sum;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>s)break;
                if(sum==s){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }
    public static boolean diff(int[] args,int x) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if(Math.abs(args[i]-args[j])==x)return true;
            }
        }
    return false;    
    }
    public static boolean equality(int arr[],int arr2[]) {
        if(arr.length!=arr2.length)return false;
        for(int i=0;i<arr.length;i++){
             if(arr[i]!=arr2[i])return false;
        }
    return true;
    }
    public static void missing(int[] arr) {
        Arrays.sort(arr);
        for(int i=1;i<=arr.length;i++){
            if(arr[i-1]!=i){
                System.out.println(i);
                //break;
            }
        }
    }
    public static void alternateArray(int[] arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int x:arr){
            if(x>=0)pos.add(x);
            else neg.add(x);
        }
        int negC=0;
        int posC=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(negC<neg.size())  arr[i]=neg.get(negC++);
                else arr[i]=pos.get(posC++);
            }else{
                if(posC<pos.size()) arr[i]=pos.get(posC++);
                else arr[i]=neg.get(negC++);
            }
        }
        printArray(arr);
    }
    public static void minPlatforms(int[] arr, int[] dep) {
        int n = arr.length;

        // Sort arrival and departure times
        Arrays.sort(arr);
        Arrays.sort(dep);

        // Platforms needed at a time
        int platform_needed = 1, max_platforms = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            // If next event in sorted order is arrival, increment count of platforms needed
            if (arr[i] <= dep[j]) {
                platform_needed++;
                i++;
                // Update result if needed
                if (platform_needed > max_platforms) {
                    max_platforms = platform_needed;
                }
            }
            // If next event is departure, decrement count of platforms needed
            else {
                platform_needed--;
                j++;
            }
        }

        System.out.println(max_platforms);
    }

    public static boolean unique(int m,int arr[]) {
        int freq[]=new int[24];
        for(int x:arr){
            freq[x]++;
        }
        int ans=0;
        for(int x:freq){
            if(x==1)ans++;
        }
        if(ans>=m)return true;
    return false;    
    }
    public static void oddSubSum(int[] arr) {
        int ans=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum%2==1)ans++;
            }
        }
        System.out.println(ans);
    }
    public static void squares (int[] arr) {
        int ans[]=new int[arr.length];
        int left=0,right=arr.length-1;
        int count=arr.length-1;
        while(left<=right){
             if(left==right){
                ans[count--]=arr[left]*arr[left];
                break;
             }    
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[count--]=arr[left]*arr[left];
                ans[count--]=arr[right]*arr[right];
            }   
            else {
                ans[count--]=arr[right]*arr[right];
                ans[count--]=arr[left]*arr[left];
            }
            left++;
            right--;    
        }
        printArray(ans);
    }
    public static void oneDTo2D(int[] arr,int n,int m) {
        int ans[][]=new int [n][m];
        int count=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=arr[count++];
            }
        }
        printArray(ans);
    }
    public static void sum2D(int[][] arr,int sRow,int sCol,int eRow,int eCol) {
        int sum=0;
        for(int i=sRow;i<=eRow;i++){
            for(int j=sCol;j<=eCol;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void rever2D(int[][] args) {
        for(int x[]:args)
            reverse(x);
        printArray(args);
    }
    public static int binarySearch(int[] arr,int key) {
        int left=0,right=arr.length-1,mid;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]>key)right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
    public static void binarySearch2DArr(int[][] arr,int key) {
        for(int i=0;i<arr.length;i++){
            int indx=binarySearch(arr[i], key);
            if(indx!=-1){
                System.out.println("row:"+i+" col:"+indx);
                return;
            }
        }
    }
    public static void matrixMul(int[][] arr,int arr1[][]) {
        int r1=arr.length;
        int c1=arr[0].length;
        int r2=arr1.length;
        int c2=arr1[0].length;
        if(c1!=r2){
            System.out.println("invalid input");
            return;
        }
        int ans[][]=new int [r1][c2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                //k multplications
                for(int k=0;k<r2;k++){
                    ans[i][j]+=arr[i][k]*arr1[k][j];
                }
            }
        }
        printArray(ans);
    }
    public static void rotate90DegreeCounterClockWise(int[][] arr) {
        for(int x[]:arr)reverse(x);
        transposeInPlace(arr);
        printArray(arr);
    }
    public static boolean toeplitz(int[] arr[]) {
        int prev=arr[0][0];
        for(int i=1;i<arr.length;i++){
            if(arr[i][i]!=prev)return false;
        }
    return true;    
    }
    public static void snakeOrderPrintMAtrix(int[] arr[]) {
        boolean check=true;
        int count=arr.length*arr.length;
        int row,col;
        int rand=0;
        while(true){
            if(count==0)return;
            row=rand;
            col=rand;
            //upside
            if(check){
                while(row!=col){
                    System.out.print(arr[row--][col++]+" ");
                    count--;
                }
            }
            //down
            else{
                while(col!=row){
                    System.out.print(arr[row++][col--]+" ");
                    count--;
                }
            }
            check=!check;
            rand++;
        }
    }
    public static void overlappingIntervals(int[] arr[]) {
        int ans=0;
        int curI[][]={{arr[0][0],arr[0][1]}};
        for(int i=1;i<arr.length;i++)
            if(!(arr[i][0]>=curI[0][0]&&arr[i][1]<=curI[0][1]))ans++;
        System.out.println(ans);
    }
    public static boolean perfectMatrix(int[] arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    // Diagonal element should not be zero
                    if (arr[i][j] == 0) {
                        return false;
                    }
                } else {
                    // Non-diagonal element should be zero
                    if (arr[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
    return true;    
    }
    public static void upper(int[] arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void arrayList(ArrayList<Integer> al,int x) {
        al.add(0, x);
        System.out.println(al);
    }
    public static void swapArrayList(ArrayList<Integer> al,int indx1,int indx2) {
       int temp=al.get(indx1);
       al.set(indx2, null);
       al.set(indx1, al.get(indx2));
        al.set(indx2, temp);
        System.out.println(al);
    }
    public static void posArrayList(ArrayList<Integer> als) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(Integer x:als){
            if(x>=0)ans.add(x);
        }
        System.out.println(ans);
    }
    public static void bubbleSort0(int[] arr) {
        boolean check;
        for(int i=0;i<arr.length;i++){
            check =true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0&&arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check=false;
                }
            }
            if(check){
                printArray(arr);
                return;
            }    
        }
   }
   public static void swap(int[] arr,int left,int right) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        // arr[left]=arr[left]^arr[right];
        // arr[right]=arr[left]^arr[right];
        // arr[left]=arr[left]^arr[right];
   }
   public static void lexographically(String[] arr) {
        int minIndx;
        for (int i = 0; i < arr.length; i++) {
            minIndx=i;
            for(int j=i+1;j<arr.length;j++){
                for(int k=0;k<arr[i].length();k++){
                    if(k>arr[j].length()-1)break;
                    if(arr[minIndx].charAt(k)-'a'<arr[j].charAt(k)-'a')break;
                    else if(arr[minIndx].charAt(k)-'a'>arr[j].charAt(k)-'a'){
                        minIndx=j;
                    }
                }
            } 
            String temp=arr[i];
            arr[i]=arr[minIndx];
            arr[minIndx]=temp; 
        }
        for(String x:arr)System.out.print(x+" ");
   }
   public static void merge(int[] arr,int left,int mid, int right) {
        int n1=mid-left+1;
        int n2=right-mid;
        int dava[]=new int[n1];
        int ujava[]=new int[n2];
        for (int i = 0; i < n1; i++) 
            dava[i]=arr[left+i];
        for (int i = 0; i < n2; i++) 
            ujava[i]=arr[mid+i+1];
        int i=0,j=0,k=left;
        while (i < n1 && j < n2) 
            if (dava[i] <= ujava[j]) arr[k++] = dava[i++];
            else arr[k++] = ujava[j++]; 
        while (i < n1) 
            arr[k++] = dava[i++];
        while (j < n2) 
            arr[k++] = ujava[j++];
   }
   public static void mergeSort(int[] arr,int left,int right) {
        if(left>=right)return;
        int mid=(left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr,left,mid,right);
   }
   public static void stringBubbleSort(String[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (String str : arr) {
            System.out.print(str+" ");
        }
   }
   public static void assendingString(String s) {
        char ch[]=s.toCharArray();
        for(int i=1;i<ch.length;i++){
            for(int j=0;j<ch.length-i;j++){
                if(ch[j]>ch[j+1]){
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }
        for (char x : ch) {
        System.out.print(x); 
        }
    }
    public static void nBy2(int[] arr) {
        Arrays.sort(arr);
        for(int i=arr.length/2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void nMinus1(Integer[] arr) {
    ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));//copy
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]=al.indexOf(arr[i]);
        }
        for(Integer x:arr){
            System.out.print(x+" ");
        }
    }
    public static void minSum(int[] arr) {
        Arrays.sort(arr);
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){
                        a = a * 10 + arr[i];
                }else{
                        b = b * 10 + arr[i];
                }
        }
        System.out.println(a + b);
    }
    public static int partition(int[] arr,int start,int end) {
        int pivot=arr[start];
        int count=0;
        for(int i=start+1;i<=end;i++)
            if(arr[i]<=pivot)count++;
        int pI=start+count;
        swap(arr, start, pI);   
        int left=start,right=end;
        while(left<pI&&right>pI){
            if(arr[left]>pivot&&arr[right]<=pivot){
                swap(arr, left, right);
                left++;
                right--;
            }else if(arr[left]<=pivot)left++;
            else right--;
        }
    return pI;        
    }
    public static void quickSort(int[] arr,int start,int end) {
        if(start>=end)return;
        int pi=partition(arr, start, end);
        quickSort(arr, start, pi-1);
        quickSort(arr, pi+1, end);
        
    }
    public static void countSort(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max)max=x;
        }
        int freq[]=new int[max+1];
        for(int x:arr){
            freq[x]++;
        }
        max=0;
        for(int i=0;i<freq.length;i++){
                while(freq[i]>0){
                    arr[max++]=i;
                    freq[i]--;
                }
            
        }
        printArray(arr);
    }
    public static void optimizedCountSort(int[] arr) {
        int ans[]=new int [arr.length];
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max)max=x;
        }
        int freq[]=new int[max+1];
        for(int x:arr){
            freq[x]++;
        }
        //prefix sum is taken of freq arrray
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }//fill ans array
        for(int i=arr.length-1;i>=0;i--){
            int indx=freq[arr[i]];
            ans[indx-1]=arr[i];
            freq[arr[i]]--;
        }
        arr=null;
        arr=ans;
        printArray(arr);    
    }
    public static int[] countSortForRadixSort(int[] arr,int place) {
        int ans[]=new int [arr.length];
        int freq[]=new int[10];
        for(int x:arr){
            freq[(x/place)%10]++;
        }
        //prefix sum is taken of freq arrray
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }//fill ans array
        for(int i=arr.length-1;i>=0;i--){
            int indx=freq[(arr[i]/place)%10]-1;
            ans[indx]=arr[i];
            freq[(arr[i]/place)%10]--;
        }
       return ans;
    }
    public static void radixSort(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max)max=x;
        }
        for(int place=1;max/place>0;place*=10){
            arr=countSortForRadixSort(arr, place);
        }
        printArray(arr);
    }
    
    public static void bucketSort(Double[] arr) {
        int indx;
        //annotations used
        @SuppressWarnings(value = "unchecked")
        ArrayList<Double> buckets[]=new ArrayList[10];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<>();
        }
        for(Double x:arr){
            indx=(int)(x-Math.floor(x));
            buckets[indx%10].add(x);
        }
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        //merge
        indx=0;
        for(int i=0;i<buckets.length;i++){
            for(int j=0;j<buckets[i].size();j++){
                arr[indx++]=buckets[i].get(j);
            }
        } 
        for(Double x:arr)
            System.out.print(x+" ");   
    }
    public static void fixDipInArray(int[] arr) {
        int x=-1,y=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
               if(x==-1){//first encounter
                x=i-1;
                y=i;
               }else y=i; //second encounter
            }
            
        }
        swap(arr, x, y);
        printArray(arr);
    }
    public static void sort012(int[] arr) {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, low, mid);
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }    
        }
        printArray(arr);
    }
    public static boolean recursiveBinarySearch(int[] arr,int start,int end,int key) {
        if(start>end)return false;
        int mid=(start+end)/2;
        if(arr[mid]==key)return true;
        else if(arr[mid]>key)return recursiveBinarySearch(arr, start, mid-1, key);
        else return recursiveBinarySearch(arr,mid+1,end,key);
    }
    public static void firstOccurenceUsingBS(int[] arr,int key) {
        int left=0,right=arr.length-1,mid;
        int fo=-1;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==key){
                fo=mid;
                right=mid-1;
            }else if(arr[mid]>key)right=mid-1;
            else left=mid+1;
        }
        System.out.println(fo);
    }
    public static void squareRootUsingBS(int n) {
        int left=1,right=n/2,mid=-1;
        int sqrt=-1;
        while(left<=right){
            mid=(left+right)/2;
            if(mid*mid==n){
                System.out.println(mid);
                return;
            }else if(mid*mid>n)right=mid-1;
            else{
                sqrt=mid;
               left=mid+1; 
            } 
        }
        System.out.println(sqrt);
    }
    public static void bsInRotatedArray(int[] arr) {
        //we've to find minimum element in rotated array
        int n=arr.length-1;
        int left=0,right=n,ans=0,ansIndx=0,mid;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]>arr[n])left=mid+1;
            else if(arr[mid]<=arr[n]){
                ans=arr[mid];
                ansIndx=mid;
                right=mid-1;
            }
        }
        System.out.println(ans+" "+ansIndx);
    }
    public static int findTargetInRotatedArrayUsingBs(int[] arr,int target) {
        int n=arr.length-1;
        int left=0,right=n,mid;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<arr[right]){
                if(target>arr[mid]&&target<=arr[right])left=mid+1;
                else right=mid-1;
            }else{
               if(target>=arr[left]&&arr[mid]>target)right=mid-1;
                else left=mid+1;
            }
        }
    return -1;    
    }
    public static boolean findTargetInRotatedArrayDuplicateUsingBs(int[] arr,int target){
        int n=arr.length-1;
        int left=0,right=n,mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(arr[mid]==target)return true;
            else if(arr[left]==arr[mid]&&arr[right]==arr[mid]){
                ++left;
                --right;
            }
            else if(arr[mid]<=arr[right]){
                if(target>arr[mid]&&target<=arr[right])left=mid+1;
                else right=mid-1;
            }else{
               if(target>=arr[left]&&arr[mid]>target)right=mid-1;
                else left=mid+1;
            }
        }
    return false;    
    }
    public static int[] BSin2DArray(int[] arr[],int key) {
        int sR=0,sC=0,eR=arr.length-1,eC=arr[0].length-1,mR,mC;
        int ans[]=new int[2];
        while(sR<=eR&&sC<=eC){
            mR=(sR+eR)/2;
            mC=(sC+eC)/2;
            if(arr[mR][mC]==key){
                ans[0]=mR;
                ans[1]=mC;
                return ans;
            }else if(arr[mR][mC]>key){
                eR=mR;
                eC=mC;
            }else{
                sR=mR;
                sC=mC;
            }
        }
        ans[0]=-1;
        ans[1]=-1;
    return ans;    
    }
    public static boolean isDivide(int[] arr,int m,int mid) {
        int nOfSt=1,sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid)return false;
            if(arr[i]+sum<=mid){
                sum+=arr[i];
            }else {
                nOfSt++;
                sum=arr[i];
            }
        }
    return nOfSt<=m;    
    }
    public static void BsChocDivide(int[] arr,int m) {
        int left=1,right=(int)1e9,mid,ans=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(isDivide(arr,m,mid)){
                ans=mid;
                right=mid-1;
            }else left=mid+1;
        }
        System.out.println(ans);
    }
    public static boolean isValidDistance(int[] arr,int k,int mid) {
        int nOfKids=1,lastKid=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastKid>=mid){
                lastKid=arr[i];
                nOfKids++;
            }
        }
    return nOfKids>=k;    
    }
    public static void racetrack(int[] arr,int k) {
        int left=1,right=(int)1e9,mid,ans=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(isValidDistance(arr,k,mid)){
                ans=mid;
                left=mid+1; 
            }else right=mid-1;
        }
        System.out.println(ans);
    }
    public static int candidate(int[] arr) {
        int majorityIndx=1,count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[majorityIndx])count++;
            else{
                count--;
                if(count==0){
                    majorityIndx=i;
                    count=1;
                }
            }
        }
        return arr[majorityIndx];
    }
    public static boolean isMajority(int[] arr,int candidate) {
        int count=0;
        for(int x:arr)
            if(x==candidate)count++;
       return count>=arr.length/2; 
    }
    public static void majorityElementInArray(int[] arr) {
        //using moore's voting algorithm
        int candidate=candidate(arr);
        if(isMajority(arr, candidate))
            System.out.println("majority element is:"+candidate);
        else 
            System.out.println("no majority element in array");    
    }
    public static void slidingWindow(int[] arr,int k) {
        int max=0,sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }int left=0,right=k-1;
        while(right<arr.length){
            sum-=arr[left];
            sum+=arr[right];
            max=Math.max(max,sum);
            left++;
            right++;
        }
        System.out.println(max);
    }
    public static void sldingWindow2(int[] arr,int k) {
        int max=1,sum=arr[0],l=0,r=0;
        while(r<arr.length){
            sum+=arr[r];
            if(sum>k){
                sum-=arr[r];
                l++;
            }
            else if(sum<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int arr[]={2,5,1,7,10,7,10,10};
        System.out.println(arr);
        System.out.println();

        // int deepCopy[]=new int[5];
        // for (int i = 0; i < deepCopy.length; i++) {
        //     deepCopy[i]=arr[i];
        // }
        // int copy[]=arr;
        // arr[2]=69;
        // System.out.println(copy[2]);
        // System.out.println(deepCopy[2]);

    }
}