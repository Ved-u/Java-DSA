import java.time.LocalDate;
public class MyOOP {
   public static void main(String[] args) {
    
    savingAccount s=new savingAccount();
    s.withdraw(10);
    
   }
}
class account{
   int accNum;
   String name;
   int balance;
   public account(int accNum,String name,int balance){
      this.accNum=accNum;
      this.name=name;
      this.balance=balance;
   }
}
class savingAccount extends account{
   public savingAccount(){
      super(100, "gg", 100);
   }
   public int withdraw(int amount){
      balance-=amount;
      System.out.println("Remaining balance"+balance);
     return amount;
   }
   
}
class bank{
   static int rup=10;
   public bank(){

   }
   public bank(int x){
      rup=x;
   }
}
class arraylist{
   int arr[]=new int[5];
   int index;
   public arraylist(){
      index=0;
   }
   public int get(int indx){
      return arr[indx];
   }
   public void add(int a){
      if(index<arr.length){
         arr[index++]=a;
      }else{
         int temp[]=new int[arr.length*2];
         for (int i = 0; i < arr.length; i++) 
            temp[i]=arr[i];
         temp[index++]=a;   
         arr=null;
         arr=temp;
      }
   }
   public int size(){
      return index;
   }
   public String toString(){
      StringBuilder sb=new StringBuilder();
      sb.append("[");
      for (int i=0;i<index;i++) 
         sb.append(arr[i]+",");
      sb.deleteCharAt(sb.length()-1) ;  
      sb.append("]");
   return sb.toString();   
   }
}
class Fraction{
   int numerator,denominator;
   public Fraction(int numerator,int denominator){
      this.numerator=numerator;
      this.denominator=denominator;
      simplify();
   }
   public void simplify() {
      //to simplify a fraction divide numerator and denominator with gcd/hcf
      int gcd=MyRecursion.GCD(numerator, denominator);
      numerator/=gcd;
      denominator/=gcd;
   }
   public static Fraction add(Fraction a,Fraction b){
      int numerator,denominator;
      if(a.denominator==b.denominator){
         denominator=a.denominator;
         numerator=a.numerator+b.numerator;
      }else{
         denominator=a.denominator*b.denominator;
         numerator=(a.denominator*b.numerator)+(b.denominator*a.numerator);
      }
   return new Fraction(numerator, denominator);   
   }
   public static void add2(Fraction a,Fraction b){
      if(a.denominator==b.denominator){
         a.numerator+=b.numerator;
      }else{
         int tempDen=a.denominator;
         a.denominator*=b.denominator;
         a.numerator=a.numerator*b.denominator+tempDen*b.numerator;
      }
   }
   public static Fraction subtract(Fraction a,Fraction b){
      int numerator,denominator;
      if(a.denominator==b.denominator){
         denominator=a.denominator;
         numerator=a.numerator-b.numerator;
      }else{
         denominator=a.denominator*b.denominator;
         numerator=(a.denominator*b.numerator)-(b.denominator*a.numerator);
      }
   return new Fraction(numerator, denominator);   
   }
   public static Fraction multiply(Fraction a,Fraction b){
      int   denominator=a.denominator*b.denominator;
      int   numerator=(a.numerator*b.numerator);
   return new Fraction(numerator, denominator);   
   }
   public static Fraction divide(Fraction a,Fraction b){
     int numerator=a.numerator*b.denominator;
     int denominator=a.denominator*b.numerator;
   return new Fraction(numerator, denominator);   
   }
   public String toString(){
      simplify();
      return ""+this.numerator+"/"+this.denominator;
   }

}
 class ComplexNumber {
   public static String add(int real1, int imaginary1, int real2, int imaginary2) {
       return (real1 + real2) + " + " + (imaginary1 + imaginary2) + "i";
   }
   public static String subtract(int real1, int imaginary1, int real2, int imaginary2) {
       return (real1 - real2) + " + " + (imaginary1 - imaginary2) + "i";
   }
   public static String multiply(int real1, int imaginary1, int real2, int imaginary2) {
       int realPart = real1 * real2 - imaginary1 * imaginary2;
       int imaginaryPart = real1 * imaginary2 + real2 * imaginary1;
       return realPart + " + " + imaginaryPart + "i";
   }
   public static String divide(int real1, int imaginary1, int real2, int imaginary2) {
       int denominator = real2 * real2 + imaginary2 * imaginary2;
       int realPart = (real1 * real2 + imaginary1 * imaginary2) / denominator;
       int imaginaryPart = (imaginary1 * real2 - real1 * imaginary2) / denominator;
       return realPart + " + " + imaginaryPart + "i";
   }
}
class CofeeMaker{
   //singleton class => only one objecct
   //this class only permits to create 'count' no of objects
   int suger;
   int cofee;
   private static CofeeMaker my=null;
   static int count=3;
   private CofeeMaker(){
      suger=1;
      cofee=1;
   }
   public static CofeeMaker getInstance(){
       if(count<=0){count--;return null;}
       count--;
       my=new CofeeMaker();
       return my;
   }
}
class Account {
   private Double balance, accNo, phNo;
   String name, DOB;
   public double getAccNo() {
      return accNo;
   }

   public double getBalance() {
      return balance;
   }
   public void setBalance(double balance){
      this.balance+=balance;
   }
   public String getDOB() {
      return DOB;
   }

   public String getName() {
      return name;
   }

   public double getPhNo() {
      return phNo;
   }

   public Account() {
      name = null;
      DOB = null;
      accNo = null;
      phNo = null;
      balance = null;
   }
   // no set mthod
   public Account(double balance, double phNo, double accNo, String DOB, String name) {
      this.name = name;
      this.DOB = DOB;
      this.accNo = accNo;
      this.phNo = phNo;
      this.balance = balance;// supppose opening account amount is 1000
   }
   public void closeAccount() {
      name = null;
      DOB = null;
      accNo = null;
      phNo = null;
      balance = null;
   }
}
class SavingsAccount extends Account {
   protected double fixedDeposite = 0,balance;

   public void deposit(double amount) {
      balance += amount;
   }

   public void withdraw(double amount) {
      balance -= amount;
   }

   public void fixedDeposite(double amount) {
      balance -= amount;
      fixedDeposite = amount;
   }
}
class LoanAccount extends Account {
   protected double loan = 1_00_00_000;

   public void payEMI(double emi) {
      loan -= emi;
   }

   public void topUpLoan(double topUp) {
      loan += topUp;
   }

   public void repayLoan(double repay) {
      loan -= repay;
   }
}

interface Member {
   public void callback();
}

class Customer implements Member {
   private String name, custID;
   private int phoneNo;

   public String getCustID() {
      return custID;
   }

   public String getName() {
      return name;
   }

   public int getPhoneNo() {
      return phoneNo;
   }

   public void setPhoneNo(int phoneNo) {
      this.phoneNo = phoneNo;
   }

   public Customer(String name, String custID, int phoneNo) {
      this.custID = custID;
      this.name = name;
      this.phoneNo = phoneNo;
   }

   @Override
   public void callback() {
      System.out.println("Customer " + name + " is registered as member and i will come to sale:");
   }
}
class Store {
   Member[] member = new Member[10];
   int count = 0;

   void register(Member m) {
      member[count++] = m;
   }

   void inviteToSale() {
      for (int i = 0; i < member.length; i++) {
         member[i].callback();
      }
   }
}
class Product_MacBook {
   private int itemNo, price, qty;
   private String name;

   public int getItemNo() {
      return itemNo;
   }

   public String getName() {
      return name;
   }

   public int getPrice() {
      return price;
   }

   public int getQty() {
      return qty;
   }

   public void setQty(int qty) {
      this.qty = qty;
   }

   public Product_MacBook(String name, int itemNo) {
      this.name = name;
      price = 60_000;
      qty = 1;
      this.itemNo = itemNo;
   }

   public Product_MacBook(int qty) {
      name = "MacBook";
      price = 60_000;
      this.qty = qty;
      itemNo = 9969;
   }

   public Product_MacBook(int qty, int price) {
      name = "MacBook";
      this.price = price;
      this.qty = qty;
      itemNo = 9969;
   }
}

class Subject {
   String name;
   int maxMArks, subId, obtMarks;

   // when just object is printed using sout in for-each loop this toString method is auto called
   public String toString() {
      return "\n" + "Name of subject: " + name + "\n" + "Subkect-ID: " + subId + "\n" + "Maximum marks obtained: "
            + maxMArks;
   }

   public int getMaxMArks() {
      return maxMArks;
   }

   public String getName() {
      return name;
   }

   public int getObtMarks() {
      return obtMarks;
   }

   public int getSubId() {
      return subId;
   }

   public void setObtMarks(int obtMarks) {
      this.obtMarks = obtMarks;
   }

   public Subject(String name, int subId, int maxMArks) {
      this.name = name;
      this.maxMArks = maxMArks;
      obtMarks = 0;
      this.subId = subId;
   }

   public Subject(String name, int subId, int maxMArks, int obtMarks) {
      this.name = name;
      this.maxMArks = maxMArks;
      this.obtMarks = obtMarks;
      this.subId = subId;
   }
}

class Student {
   int m1, m2, m3, dm, toc;
   String name, course, deparment, subjects,rollNo;
   int count;

   public Student() {
       rollNo = generateRoll();
       System.out.println(rollNo);
   }

   private String generateRoll(){
       return "SPPU"+("_"+LocalDate.now())+"_"+count++;
   }
   public String getDeparment() {
      return deparment;
   }

   public String getName() {
      return name;
   }

   public String getRollno() {
      return rollNo;
   }

   public String getSubjects() {
      return subjects;
   }

   public void setSubjects(String subjects) {
      this.subjects = subjects;
   }

   public Student(String name, String subjects, String deparment, String rollNo) {
      this.name = name;
      this.subjects = subjects;
      this.rollNo = rollNo;
      this.deparment = deparment;
   }

   int total() {
      return m1 + m2 + m3 + dm + toc;
   }

   double average() {// its also percent because marks are out of 100
      return total() / 5.0;
   }

   char grade() {
      if (average() >= 60)
         return 'A';
      return 'B';
   }

   String studentProperties() {
      return "Name: " + name + "\n" + "Course: " + course;
   }
}

abstract class Shape {
   abstract public double perimeter();

   abstract public double area();
}

class Circle extends Shape {
   double radius;

   public double perimeter() {
      return 2 * Math.PI * radius;
   }

   public double area() {
      return Math.PI * radius * radius;
   }

}

class Rectangle {
   public int length, breadth;
   public Rectangle(){

   }
   public Rectangle(int length,int breadth){
      this.length=length;
      this.breadth=breadth;
   }
   public int area()    {
      return length * breadth;
   }

   public int perimeter() {
      return 2 * (length + breadth);
   }

   public boolean isSquare() {
      return length == breadth;
   }
}

class Cylinder {
   private double radius, height;

   public double getRadius() {
      return radius;
   }

   public void setRadius(double rad) {
      radius = rad;
   }

   public void setHeight(double hght) {
      height = hght;
   }

   public void setDimentions(double hght, double rad) {
      height = hght;
      radius = rad;
   }

   public double getHeight() {
      return height;
   }

   // constrctors
   public Cylinder() {
      radius = 1;
      height = 1;
   }

   public Cylinder(double rad) {
      radius = rad;
      height = 1;
   }

   public Cylinder(double rad, double hght) {
      radius = rad;
      height = hght;
   }

   double circumference() {
      return 2 * Math.PI * radius;
   }

   double lidArea() {
      return Math.PI * radius * radius;
   }

   double surfaceArea() {// area of 2 circles+ area of drum
      return 2 * lidArea() + circumference() * height;
   }

   double volume() {
      return height * lidArea();
   }
}

class WhiteBoard{
   String text;
   int totStudents=0;
   int count=0;
   public void attendence(){
       totStudents++;
   }
   public void write(String text){
       System.out.println("teacher is waiting wirte fast");
       while(count!=0){
           try{wait();}catch(Exception e){System.out.println(e);}   
       }
       this.text=text;
       count=totStudents;
       notifyAll();
   }
   public String read(){
       while(count==0){
           try{wait();}catch(Exception e){System.out.println(e);}   
       }
       count--;
       if(count==0)notify();
       return text;
   }
}
class Teacher extends Thread{
   WhiteBoard wb;      
   String topic[] = {"JAVA", "IS", "GREAT", "Language","end","great"};
   public Teacher(WhiteBoard w){
       this.wb=w;
   }
   public void run(){
       for(int i=0;i<topic.length;i++){
           wb.write(topic[i]);
       }
   }
}
class ATM{
   synchronized public  void checkBalance(String name){
       System.out.println("The Person "+name+" is checking the amount:");
       try{
           Thread.sleep(1000);
       }catch(Exception e){
           System.out.println("exception came"+e);
       }
   } 
   synchronized public  void withdraw(String name,int amount){
       System.out.println("The Person "+name+" is withdrawing the amount:"+amount);
   }
}
class Stack{
   public static int push(int arr[],int top,int element)throws Exception{
       if(top>=arr.length-1)throw new StackOverFlowException();
       for(int i=top;i>=0;i--){
           if(i==top){
               arr[i+1]=arr[i];
           }
           if(i==0){ 
               arr[i]=element;
           }else arr[i]=arr[i-1];
       }
       return top++;
   }
   public static int pop(int[] arr,int top)throws Exception {
       if(top==0)throw new StackUnderFlowException();
       for(int i=0;i<top;i++){
           arr[i]=arr[i+1];
       }
       return top--;
   }
}
class StackOverFlowException extends Exception{
   @Override
   public String toString(){
       return "Stack-Overflow";
   }
}
class StackUnderFlowException extends Exception{
   public String toString(){
       return "Stack-Underflow";
   }
}