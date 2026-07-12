
public class SamThread extends Thread{//1
    public void run(){
        int count=1;
        while(true){
            System.out.println(count+++" hello");
        }
    }
        public static void main(String[] args) {//mian w w 
            WhiteBoard wb=new WhiteBoard();
            Teacher t=new Teacher(wb);
            Student sam=new Student("samihan", wb);
            Student ved=new Student("vedant", wb);
            Student vrd=new Student("varad", wb);
            t.start();
            sam.start();
            ved.start();
            vrd.start();
        }
}
class WhiteBoard{
    int noOfStudents=0;
    int count=0;
    String text;
   // boolean flag=true;
    synchronized public void set(String args) {
        while(count!=0)try{wait();}catch(Exception e){} 
        System.out.println("bagha poranno hmmm");
        text=args;
        count=noOfStudents;
        notifyAll();
    }
    synchronized public String get() {
        while(count==0)try{wait();}catch(Exception e){}
        count--;
        if(count==0)notify();
        notifyAll();
       return text;
    }
    public void attendence() {
        noOfStudents++;
    }
}
class Student extends Thread{
    String name;
    WhiteBoard wb;  
    public Student(String name,WhiteBoard wb){
        this.name=name;
        this.wb=wb;
    }
    public void run(){
        String str;
        do{
            str=wb.get();  
            System.out.println(name+" "+str);
            System.out.flush();
        }while(!str.equals("end"));
    }
}
class Teacher extends Thread{
    WhiteBoard wb;  
    String notes[]={"java","DSA","android","web","end"};
    public Teacher(WhiteBoard wb){
        this.wb=wb;
    }
    public void run(){
        for(String x:notes){
            wb.set(x);
        }  
        }
}
class ATM{
    synchronized public void checkBalance(Customer c){
       System.out.println(c.amount);
    }
    synchronized public void withdraw(Customer c,int havet){
        if(c.amount>=havet)System.out.println(havet);
        else  System.out.println(0);
    }
}
class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    int havet;
    public Customer(ATM atm,String name,int amount){
        this.atm=atm;
        this.name=name;
        this.amount=amount;
    }
    public void useAtm(int havet) {
        this.havet=havet;
        run();
       
    }
    public void run(){
        atm.checkBalance(this);
        atm.withdraw(this, havet);
    }
}
class myc extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count+++" world");
        }
    }
}