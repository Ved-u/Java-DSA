public class abdulbari {
    
    public static void main(String[] args)throws Exception{
     stack s=new stack();
     for(int i=1;i<=5;i++)s.push(i);
     for(int i=1;i<=5;i++)s.pop();
     
        System.out.println(s.peek());
    }
}

class stackUnderFlow extends Exception{
    stack s;
    public stackUnderFlow(stack s){
        this.s=s;
        if(s.getIndx()<0)System.out.println(this);
    }
    public String toString() {
        return "sam bolta stack underflow";
    }
}
class stack extends Exception{
    int arr[]= new int[5];
    private int indx;
    public stack(){
        indx=-1;
    }
    public void push(int element){
       arr[++indx]=element;
    }
    public int pop(){
        return arr[indx--];
    }
    public int peek()throws Exception{
        if(indx==-1)throw new stackUnderFlow(this);
        return arr[indx];
    }
    public int getIndx(){
        return indx;
    }
    public int stackSize(){
        return arr.length;
    }
}

class Student{
    String roll;
    private  static int count=0;
    public Student(){
        roll="UNIV-"+"2024-"+(++count);
    }
}


 class Demo{
    static boolean check=true;
    static Demo d=null;//1234GF
    private  Demo(){} 
    public static Demo method(){
        if(d==null)d=new Demo();
    return d;
    }
}

class honda{
    static int price=10;
    int a=10;
}
interface stupidface{
    int X=10;
    void meth();
    static void hello(){
        System.out.println("hello");
    }
}

interface  subFace extends  stupidface{
   // System.out.println();
    static void print(){
        System.out.println();
    }
}   
interface xyz{
    // private final static int marks=10;
    private void meth3(){
        System.out.println("hello");
    }
    default void getMeth3(){
        meth3();
    }
}
class abc implements xyz{
    void display(){
        getMeth3();
    }
}
abstract class Member implements  subFace{
   abstract public void callback();
}
class Store{
    Member m[]=new Member[2];
    int count=0;
    void register(Member me){
        m[count++]=me;
    }
    void invite(){
        for(Member x:m){
            x.callback();
        }
    }
}
class Customer extends  Member{
    String name;
    public Customer(String name){
        this.name=name;
    }
    public void meth(){
        System.out.println();
    }
    public void callback(){
        if(Math.random()>0.5)System.out.println("ill come");
        else System.out.println("i won't");
    }
}   
class Account{
    int accNm;
    int balance;
    String name;
    public Account(int accNm,int balance,String name){
        this.accNm=accNm;
        this.balance=balance;
        this.name=name;
    }
    public int withdraw(int amount){
        balance-=amount;
        return amount;
    }
}
class SavingsAccount extends Account{
    public SavingsAccount(int accN,int balance,String name){
        super(accN, balance, name);
    }
    public int withdraw(int amount){
        System.out.println("111");
        balance-=amount;
        return amount;
    }
}
class A{
    public A(){
        System.out.println("a");
    }
}
class B extends A{
    public B(){
        System.out.println("b");
    }
}
class C extends B{
    public C(){
        System.out.println("c");
    }
}