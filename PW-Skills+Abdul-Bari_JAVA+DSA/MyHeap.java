import java.util.*;
public class MyHeap {
    /*
    heap is just an array of elements visualized in form of COMPLETE BINARY TREE (0/2 children)
    MIN HEAP: COMPLETE BINARY TREE + every Parent Node must be smaller than 2 child nodes
    MAX HEAP: COMPLETE BINARY TREE + every Parent Node must be greater than 2 child nodes 
    INSERTION: at last like a queue, keep adding larger elements
    PRIORITY Queue is the implementation of heap.PQ is by default MIN heap but you can make it min heap by doing -> PriorityQueue<X> pq=new PriorityQueue<>(Comparator.reverseOrder());
    */
    public static class Student{
        int roll;
        String name;
        double marks;
        public Student(int roll,String name,double marks){
            this.roll=roll;
            this.name=name;
            this.marks=marks;
        }
    }
    public static void getKthLargest(int arr[],int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:arr){
            pq.add(x);
            if(pq.size()>k)pq.remove();
        }
        System.out.println(pq.peek());
    }
    public static double distanceFromOrigin(int x,int y){
        return Math.sqrt(x*x+y*y);
    }
    public static class Points{
        int x,y;
        double dist;
        public Points(int x,int y){
            this.x=x;
            this.y=y;
            dist=distanceFromOrigin(x, y);
        }
    }
    public static void manhattenDistance(int[][] points,int k) {//find kth closest point to the origin
        PriorityQueue<Points> pq=new PriorityQueue<>((p1,p2)->Double.compare(p2.dist,p1.dist));
        for(int x[]:points){
            pq.add(new Points(x[0],x[1]));
        }
        for(int i=1;i<k;i++)pq.remove();
        System.out.println(pq.peek().dist);
    }
    public static void kOperatios(int arr[],int k){
        //we need to remove 2 smallest elements form array multiply them and addd them back K times after that we need to return MAX from array
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:arr){
            pq.add(x);
        }
        for(int i=1;i<=k;i++){
            pq.add(pq.remove()*pq.remove());
        }
        while(pq.size()!=1)pq.remove();
        System.out.println(pq.remove());
    }
    public static void k1k2Sum(int arr[],int k1,int k2){
        //sum of k1 to k2 smallest elements
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int x:arr){
            pq.add(x);
            if(pq.size()==k2)pq.remove();
        }
        int sum=0;
        while(pq.size()!=k1)sum+=pq.remove();
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> heap2 = new PriorityQueue<>();//min heap
        // PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());//max heap
        // PriorityQueue<Student> pq=new PriorityQueue<>((s1,s2)->Integer.compare(s1.roll, s2.roll));
        // pq.add(new Student(1, "vedant", 70));
        // pq.add(new Student(2, "ved", 69));
        // pq.add(new Student(3, "vedu", 69));
        // for(var x:pq)
        //     System.out.println(x.name);
        int arr[]={20,8,22,4,12,10,14};
        k1k2Sum(arr, 3, 6);
    }
    public static List<Integer> mergeHeap(List<Integer> arr,List<Integer> brr) {
        for(int x:brr){
            arr.add(x);
        }
        heapify(arr);
    return arr;
    }
    public static void heapSort(List<Integer> arr) {
        heapify(arr); // Convert array to heap  
        int n = arr.size() - 1;
        for (int i = n; i >= 0; i--) {
            swap(arr, 0, i); // Move the largest element to the end
            pushDownMinHeap(arr, 0, i - 1); // Re-adjust the heap excluding sorted elements
        }
    }
    public static void heapify(List<Integer> arr) { // Build heap
        int firstNonLeafNode = (arr.size() - 1 - 1) / 2;
        for (int i = firstNonLeafNode; i >= 0; i--) {
            pushDownMinHeap(arr, i, arr.size() - 1);
        }
    }
    public static void pushDownMinHeap(List<Integer> heap, int indx, int n) {
        int left = leftIndx(indx);
        int right = rightIndx(indx);
        int smallest = indx;
        if (left <= n && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }
        if (right <= n && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }
        if (smallest != indx) {
            swap(heap, indx, smallest);
            pushDownMinHeap(heap, smallest, n); // Pass the correct boundary `n`
        }
    }
    public static void swap(List<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    public static int leftIndx(int indx) {
        return 2 * indx + 1;
    }
    public static int rightIndx(int indx) {
        return 2 * indx + 2;
    }
    public static void delete(List<Integer> heap) { // Always deletion from top
        swap(heap, 0, heap.size() - 1);
        heap.remove(heap.size() - 1);
        pushDownMinHeap(heap, 0, heap.size() - 1);
    }
}
class Heap{//min heap
    static List<Integer> heap;
    public Heap(){
        heap=new ArrayList<>();
    }
    public static void swap(List<Integer> heap,int i,int j) {
        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }
    public static void add(int val){
        heap.add(val);
        int i=heap.size()-1;
        while(i>0&&val<parent(i)){
            int temp=parent(i);
            heap.set(parentIndx(i),val);
            heap.set(i,temp);
            i=parentIndx(i);
        }
    }
    public static void child(int i){
        System.out.print(left(i)+" ");
        System.out.print(right(i)+" \n");
    }
    public static int left(int i){
        return heap.get(2*i+1);
    }
    public static int leftIndx(int i){
        return 2*i+1;
    }
    public static int right(int i){
        return heap.get(2*i+2);
    }
    public static int rightIndx(int i){
        return 2*i+2;
    }
    public static int parentIndx(int i){
        return (i-1)/2;
    }
    public static int parent(int i){
        return heap.get((i-1)/2);
    }
    public static void display(){
        System.out.println(heap);
    }
}