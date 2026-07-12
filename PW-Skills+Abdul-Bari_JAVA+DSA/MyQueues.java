import java.util.*;
public class MyQueues {
    public static void printQ(Queue<Integer> q) {
        Queue<Integer> q2=new LinkedList<>();
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q2.add(q.remove());
        }
        System.out.println();
        while(!q2.isEmpty()){
            q.add(q2.remove());
        }
    }
    public static void printQEfficient(Queue<Integer> q) {
        int arr[]=new int[q.size()];
        for(int i=0;i<arr.length;i++){
            System.out.print(q.peek()+" ");
            arr[i]=q.remove();
        }
        System.out.println();
        for(int x:arr){
            q.add(x);
        }
    }
    public static void printReverse(Queue<Integer> q) {
        int arr[]=new int[q.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=q.remove();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int x:arr){
            q.add(x);
        }
    }
    public static void reverseQ(Queue<Integer> q){
        Stack<Integer> stk=new Stack<>();
        while(!q.isEmpty()){
            stk.push(q.poll());
        }
        while(!stk.isEmpty()){
            q.add(stk.pop());
        }
        System.out.println(q);
    }
    public static void reverseFirstKElements(Queue<Integer> q,int k) {
        Stack<Integer> stk=new Stack<>();
        for(int i=1;i<=k;i++)
            stk.push(q.remove());
        while(!stk.isEmpty())
            q.add(stk.pop());
        for(int i=1;i<=q.size()-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
    public static void reorderQueue(Queue<Integer> q) {
        //interleave 1st and 2nd half of queue together(assuming even size queue)
        Stack<Integer> stk=new Stack<>();
        int n=q.size();
        for(int i=1;i<=n/2;i++){
            stk.push(q.remove());
        }
        while (!stk.isEmpty()) {
            q.add(stk.pop());
        }
        for(int i=1;i<=n/2;i++){
            stk.push(q.remove());
        }
        while (!stk.isEmpty()) {
           q.add(stk.pop());
           q.add(q.remove()); 
        }
        reverseQ(q);
    }
    public static void main(String[] args) throws Exception{
       ArrayList<Integer> al=new ArrayList<>();
       for(int i=1;i<=10;i++)
        al.add(i);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
    }   
}
class dequeLL{
    Node head=null,tail=null;
    int size=0;
    void addLast(int val){
        Node t=new Node(val);
        if(size==0)head=tail=t;
        else{
            tail.next=t;
            tail=t;
        }
        size++;
    }
    void addFirst(int val){
        Node t=new Node(val);
        if(size==0)head=tail=t;
        else{
            t.next=head;
            head=t;
        }
        size++;
    }
    int popFirst()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
        size--;
        int val=head.val;
        head=head.next;
    return val;
    }
    int popLast()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
        size--;
        int val=tail.val;
        for(Node t=head;t!=null;t=t.next){
            if(t.next==tail){
                t.next=null;
                tail=t;
            }    
        }
        return val;
    }
    int peekFirst()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
    return head.val;
    }
    int peekLast()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
    return tail.val;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(Node t=head;t!=null;t=t.next){
            sb.append(t.val+" ");
        }
    return sb.toString();
    }
}
class dequeueArray{
    int q[]=new int[10];
    int f=-1,r=-1,size=0;
    void addLast(int val)throws Exception{
        if(size==q.length)throw new Exception("Queue is full!");
        if(size==0)f=0;
        q[++r]=val;
        size++;
    }
    void addFirst(int val)throws Exception{
        if(size==q.length||f==0)throw new Exception("Queue is full!");
        if(size==0){
            f=r=0;
            q[0]=val;
        }else q[--f]=val;
        size++;
    }
    int popFirst()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
        size--;
    return q[f++];
    }
    int popLast()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
        size--;
    return q[r--];
    }
    int peekFirst()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
    return q[f];
    }
    int peekLast()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
    return q[r];
    }
    boolean isEmpty(){
        return size==0;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int i=f;i<=r;i++){
            sb.append(q[i]+" ");
        }
    return sb.toString();
    }
}
class circularQLL{
    Node head=null,tail=null;
    int size=0;
    void add(int data){
        Node t=new Node(data);
        if(size==0)head=t;
        else tail.next=t;
        t.next=head;
        tail=t;
        size++;
    }
    int pop()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
        size--;
        int data=head.val;
        head=head.next;
    return data;
    }
    int peek()throws Exception{
        if(size==0)throw new Exception("Queue is Empty!");
    return head.val;
    }
    boolean isEmpty(){
        return size==0;
    }
    public String toString() {
        StringBuilder sb=new StringBuilder();
        if(isEmpty())return "Queue is Empty!";
        for(Node t=head;t.next!=head;t=t.next)
            sb.append(t.val+" ");
    return sb.toString();
    }
}
class circularQueue{
    int q[]=new int[10];
    int size=0,f=-1,r=-1;
    void add(int val)throws Exception{
        if(size==0){
            q[++r]=val;
            f++; 
        }else if(size==q.length)throw new Exception("queue is full!");
        else if(r==q.length-1){
            q[0]=val;
            r=0;
        }
        else q[++r]=val;
        size++;
    }
    int pop() throws Exception{
        if(size==0)throw new Exception("Queue is already empty");
        else{
            int val=q[f];
            f=(f==q.length-1)?0:++f; 
            size--;
        return val;
        }
    }
    int peek()throws Exception{
        if(size==0)throw new Exception("Queue is already empty");
        return q[f];
    }
    boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        if(size==0)return "Queue is Empty!";
        if(f<=r){
            for(int i=f;i<=r;i++){
                sb.append(q[i]+" ");
            }
        }else{
            //f to n
            for(int i=f;i<q.length;i++){
                sb.append(q[i]+" ");
            }
            //0 to r
            for(int i=0;i<=r;i++){
                sb.append(q[i]+" ");
            }
        }
        return sb.toString();
    }
    
}
class Node{
    int val;
    Node next=null;
    public Node(int val){
        this.val=val;
    }
}
class queueLinkedList{
    Node head=null,tail=null;
    int size=0;
    void add(int val){
        Node t=new Node(val);
        if(size==0)head=t;
        else tail.next=t;
        tail=t;
        size++;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("queue is aready empty hence -1 is returned");
            return -1;
        }
        int pop=head.val;
        head=head.next;
        size--;
    return pop;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("queue is aready empty hence -1 is returned");
            return -1;
        }
        return head.val;
    }
    boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(Node t=head;t!=null;t=t.next){
            sb.append(t.val+" ");
        }
        return sb.toString();
    }
}
class queueArray{
    int q[]=new int[10];
    int front=-1,rear=-1,size=0;
    void add(int element) {//push
        if(rear==q.length-1){
            System.out.println("queue is full");
            return;
        }
        if(front==-1)front++;
        q[++rear]=element;
        size++;
    }
    int pop() {//pop
        if(front==-1){
            System.out.println("queue is already empty hence -1 is returned");
            return -1;
        }
        size--;
    return q[front++];
    }
    int popOptimized(){
        if(front==-1){
            System.out.println("queue is already empty hence -1 is returned");
            return -1;
        }
        int pop=q[front];
        for(int i=front;i<rear;i++){
            q[i]=q[i+1];
        } rear--;
        size--;
    return pop;
    }
    int peek(){
        if(front==-1){
            System.out.println("queue is already empty hence -1 is returned");
            return -1;
        }
        return q[front];
    }
    boolean isEmpty(){
        return size==0;
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(int i=front;i<=rear;i++){
            sb.append(q[i]+" ");
        }
        return sb.toString();
    }
    
}