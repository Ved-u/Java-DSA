package AdvanceDSA;

public class MyGraph {
    static void decToBin(int num){
        StringBuilder bin = new StringBuilder();
        while(num>0){
            bin.append(num%2);
            num/=2;
        }
        System.out.println(bin);;
    }
    public static void main(String[] args) {
        decToBin(8);
    }
}
