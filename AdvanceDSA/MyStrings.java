package AdvanceDSA;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyStrings {
    public static double shortestPath(String args) throws InvalidAlgorithmParameterException {//string will CONSITS CHARS LIKE W,E,N,S 
        int endX=0,endY=0;
        for(int i=0;i<args.length();i++){
            char x = args.charAt(i);
            if('N'==Character.toUpperCase(x))endY++;
            else if('S'==Character.toUpperCase(x))endY--;
            else if('W'==Character.toUpperCase(x))endX--;
            else if('E'==Character.toUpperCase(x))endX++;
            else throw new InvalidAlgorithmParameterException("Invalid character");
        }
        return Math.sqrt(Math.pow(endX,2)+Math.pow(endY,2));
    }
    public static List<String> sortLexStrings(List<String> strings){
        Collections.sort(strings,String.CASE_INSENSITIVE_ORDER);
        return strings;
    }
    public static String LexLargestString(List<String> strings){
        if(strings.size()==0)return "";
        sortLexStrings(strings);
        return strings.get(strings.size()-1);
    }
    public static String LexLargestString(String[] strings){
        if(strings.length==0)return "";
        String ans=strings[0];
        for(String x:strings){
            if(ans.compareToIgnoreCase(x)<0){
                ans=x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
