public class lambdaExpression{
    
    public static void main(String[] args) {
        sam s=new sam();
        s.vedi(()->{
            System.out.println("SAM Hello! ASAN HAIIIII!!!!!!!!!");
        });
    }
}
@FunctionalInterface
interface display{
    public void dis();
  
}

class sam{
    // public void hushar(){
    // display d=()->{
    //     System.out.println("SAM Hello! ASAN HAIIIII!!!!!!!!!");
    // };
    // d.dis();
    // }
    void vedi(display d){
        d.dis();
    }
}