public class MyThread {
    public static void main(String[] args) {
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
}class WhiteBoard{
    String text;
    int numberOfStudents=0;
    int count=0;
    public void attendance(){
        numberOfStudents++;
    }
    synchronized public void write(String t){
        System.out.println("Teacher is Writing " +t);
        while(count!=0)
                try{wait();}catch(Exception e){}
        text=t;
        count=numberOfStudents;
        notifyAll();
    }
    synchronized public String read(){
        while(count==0)
                try{wait();}catch(Exception e){}    
        String t=text;
        count--;
        if(count==0)
                notify();
        return t;
    }
}
class Teacher extends Thread{
    WhiteBoard wb;  
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end","great"}; 
    public Teacher(WhiteBoard w){
        wb=w;
    }
    public void run(){
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
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
        String text;
        wb.attendance();
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        if(text.equals("end"))return;
    }
}
class Customer extends Thread{
    int atm;
    String name;
    int amount;
    public Customer(String name,int amount,int atm){
        this.name=name;
        this.amount=amount;
        this.atm=atm;
    }
    // public void useATM(String trasaction){
    //     if(tr)
    // }
    // public void run(){
    //     useATM();
    // }
}