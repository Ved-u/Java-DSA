public class MyBitManipulation {
    public static void leftBit(int n){
        System.out.println(n<<1);//multiplies number by 2 and adds 0 to left
    }
    public static void rightBit(int n){
        System.out.println(n>>1);//divides  number by 2 and copies sign bit to right(doesn't change sign bit)
        System.out.println(n>>>1);//divides  number by 2 and shifts sign bit to right(number may become positive after this)
    }
    //bit masking is the process of manipulating the bits inside a number
    public static void getBit(int n){
       //suppose u want to check(get) the ith bit(always counted from right 0-indexed) in a binary number then
       // you'll create a bitmask and left shift it by i times 1<<i
       //then perform and of this number with original to check if original bit is set or not
       //if the resulting number is non-zero then the ith bit is 1. zero otherwise
        int bitmask = 1 << 1;
        if ((n & bitmask) != 0)System.out.println("2nd bit was set (was 1)");
        else System.out.println("2nd bit wasn't set (was zero)");
        //this example shows how to check 2nd bit of number
    }
    public static void setBit(int n){
        //change the ith bit to 1 we peroform OR of number and mask
        int bitmask=1<<1;
        System.out.println(n|bitmask);
    }
    public static void clearBit(int n){
        //clear the ith bit(make it 0) take a bitmask and take NOT(1's complenment)
        //then perform AND with the number and mask
        int bitmask=~(1<<1);//~ is used to take complement pronounced TILL
        System.out.println(n&bitmask);
    }
    public static void updateBit(int n,boolean update){
        //if update is true means set the ith bit,if false then clear ith bit
        if(update)setBit(n);
        else clearBit(n);
    }
    public static void main(String args[]){
        //if you want to use different number sysytems then use these prefixes
        //0b -> binary , 0 -> octal, 0x -> Hexadecimal, normal number written is treated at decimal int in java
        clearBit(0b111);
        System.out.println(0b111);
    }
}
