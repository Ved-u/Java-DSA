public class Test{
    public static void binToDec(int bin) {
        int dec = 0,pow = 0;
        System.out.println("bin:"+bin);
        while(bin > 0){
            dec += bin%10*Math.pow(2,pow++);
            bin/=10;
            
        }
        System.out.println("dec:"+dec);
    }
    public static void dectoBin(int dec){
        System.out.println("dec:"+dec);
        int bin = 0;
        while(dec>0){
            bin = bin*10 + dec%2;
            dec/=2;
        }
        System.out.println("bin:"+bin);
    }
    public static void main(String args[]){
       dectoBin(7);
    }
}