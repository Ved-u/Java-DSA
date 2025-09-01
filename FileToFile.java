import java.io.*;
public class FileToFile {
    public static void t1() {
        try (FileInputStream fis = new FileInputStream("D:/Downloads/GOKUL.txt");
        FileOutputStream fos = new FileOutputStream("D:/Downloads/Dham.txt");) {
            byte arr[]=fis.readAllBytes();
            String str=new String(arr);
            fis.close();
            fos.write(str.toLowerCase().getBytes());
            fos.close();
        } catch (IOException e) {
          System.out.println(e);
        }
    }
    public static void t2Mama() {
        try (FileInputStream fis = new FileInputStream("D:/Downloads/GOKUL.txt");
        FileInputStream fis2 = new FileInputStream("D:/Downloads/Dham.txt");
        FileOutputStream fos = new FileOutputStream("D:/Downloads/Society.txt");) {
            byte arr[]=fis.readAllBytes();
            byte brr[]=fis2.readAllBytes();
            fis.close();           
            fis2.close();
            fos.write(arr);
            fos.write(brr);
            fos.close();
        } catch (IOException e) {
          System.out.println(e);
        }
    }
    public static void dataStream() throws  Exception{
        FileOutputStream fos= new FileOutputStream("D:\\Downloads\\sam.txt");
        DataOutputStream dos = new DataOutputStream(fos);
    
        double arr[]={12.3, 1223, 34,24546547,1};
        dos.writeInt(5);
        for(double d:arr){
            dos.writeDouble(d);
        }
           dos.close();
    
           FileInputStream fis= new FileInputStream("D:\\Downloads\\sam.txt");
           DataInputStream dis = new DataInputStream(fis);
            for(int i=dis.readInt();i>0;i--){
                System.out.println(dis.readDouble());
            }
           dis.close();
    }
    public static void objectStream()throws Exception {
        FileOutputStream fos=new FileOutputStream("D:\\Downloads\\Customer.txt");
        ObjectOutputStream obj=new ObjectOutputStream(fos);
        Customer sam=new Customer("123","samihan","9309596756");
        Customer ved=new Customer("456","Vedant","9022058343");
        Customer vrd=new Customer("789","varad","zhoplay");
        Customer arr[]={sam,ved,vrd};
        obj.writeInt(arr.length);
        for(Customer c:arr)
            obj.writeObject(c);
        obj.close();
        fos.close();

        System.out.println(Customer.noOfCustomer);
        FileInputStream fis=new FileInputStream("D:\\Downloads\\Customer.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        for(int i=ois.readInt();i>0;i--){
            System.out.println((Customer)ois.readObject());
        }
        ois.close();
        fis.close();
    }//copyright belogs to vedant object
    public static void main(String[] args) throws Exception{
       
        objectStream();
    }
}
class Customer implements Serializable{
    String custId;
    String name;
    String phoneNo;
    static int noOfCustomer=0;
    public Customer(){}
    public Customer(String custId,String name,String phoneNo){
        this.name=name;
        this.custId=custId;
        this.phoneNo=phoneNo;
        noOfCustomer++;
    }
    public String toString(){
        return "customer-Id:"+custId+"\t name:"+name+"\tphone no:"+phoneNo;
    }
}