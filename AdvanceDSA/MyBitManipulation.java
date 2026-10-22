package AdvanceDSA;

public class MyBitManipulation {
    /**
     * @param num
     * @param i index from LSB
     * @return returns Ith bit
     */
    public static int getIthBit(int num, int i) {
        int bitMask = 1<<i;
        return ((num&bitMask)==0)? 0 : 1; 
    }
    /**
     * @param num
     * @param i index from LSB
     * @return sets Ith bit and returns the value
     */
    public static int setIthBit(int num, int i) {
        int bitMask = 1<<i;
        return num|bitMask; 
    }
    /**
     * @param num
     * @param i index from LSB
     * @return clears Ith bit and returns the value
     */
    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1<<i);
        return num&bitMask; 
    }
    public static int clearLastIBits(int num, int i) {
        int bitMask = ~(0)<<i;
        return num&bitMask; 
    }
    public static int clearRangeOfBits(int num, int i,int j) {
        int bitMask = (~0<<j+1)|((1<<i)-1);
        return num&bitMask; 
    }
    public static int countSetBits(int num) {
        int count=0;
        while(num!=0){
            count+=((num&1)==1)? 1 : 0; 
           num>>>=1;
        }
        return count;
    }
    public static boolean isPowerOfTwo(int num){
        if(num<=0)return false;
        return (num&(num-1))==0;
    }
    /**
     * @param num
     * @param i index from LSB
     * @return update Ith bit and returns the value
     */
    public static int updateIthBit(int num, int i, int bit) {
        if(bit==0) return clearIthBit(num, i);
        else if(bit==1) return setIthBit(num, i);
        else throw new IllegalArgumentException("wrong input");
    }
    public static boolean isEven(int num) {
        return getIthBit(num,0)==0;
    }
    public static int getLSB(int num) {
        return num&1;
    }
    public static int onesCompliment(int num) {
        return ~num;
    }
    public static int twosCompliment(int num) {
        return 1+(~num);
    }
    public long fastExponantiation(int a,int n){
        long ans=1;
        while(n>0){
            if((n&1)==1){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(7));
    }
}
