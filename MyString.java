import java.util.Scanner;

public class MyString {
    public static void stringPrint(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static boolean Palindrome(String str){
        for(int i=0;i<(str.length()/2);i++){
            int n=str.length();
            if (str.charAt(i)!=str.charAt(n-1-i)) {
                return false;
            }
        }return true;
    }
    public static float ShortestPath(String str){
        int x=0 , y=0 ;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='N') {
                y++;
            }
            if (str.charAt(i)=='S') {
               y--;
            }
            if (str.charAt(i)=='E') {
                x++;
            }
            if (str.charAt(i)=='W') {
               x--;
            }
        } int X2=x*x;
            int Y2=y*y;
            return (float)Math.sqrt(X2+Y2);
    }
    public static void stringEqual(String str1, String str2, String str3){
        if (str1.equals(str2)) {
            System.out.println("eqal");
        } else {
            System.out.println("not equal");
        }
        if (str1.equals(str2)) {
            System.out.println("eqal");
        } else {
            System.out.println("not equal");
        }
        if (str1.equals(str3)) {
            System.out.println("eqal");
        } else {
            System.out.println("not equal");
        }
    }
    public static void subString(String str,int si,int ei){
        String subString="";
        for(int i=si;i<ei;i++){
            subString+=str.charAt(i);
        }System.out.println(subString);
        System.out.println(str.substring(0,11));
    }
    public static void LexicographicallyLargestString(){
    String fruits[]={"apple","mango","banana","ZEBRONICS"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if (largest.compareToIgnoreCase(fruits[i])<0) {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void StringBuilder(){
        StringBuilder sb=new StringBuilder("VedantUtpat_");
        for(char ch='A';ch<='z';ch++){
            sb.append(ch);
        }System.out.println(sb);
    }
    public static void Capital1stLetter(String str){
        StringBuilder sb=new StringBuilder(""); 
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if (str.charAt(i)==' '&&i<str.length()-1) {
                sb.append(str.charAt(i)); 
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }System.out.println(sb);
    }
    public static void compresString(String str){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
            sb.append(count); 
            }
        }System.out.println(sb);
    }
    public static boolean isvowel(char ch) { 
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return true;
       return false; 
    }

    public static void findUsernameNMailOpearator(String str) {
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1, str.length());
        System.out.println("Username :"+uname);
        System.out.println("Domain :"+domain);
        int j=domain.indexOf(".");
        String name=domain.substring(0, j);
        System.out.println(name.equals("gmail"));
        System.out.println("if emailid contains gmail: " + str.contains("gmail"));
        int indx = 0;
        while (str.charAt(indx) != '@') {
            System.out.print(str.charAt(indx));
            indx++;
        }
        indx++;
        System.out.println();
        for (; indx < str.length(); indx++) {
            System.out.print(str.charAt(indx));
        }
    }
    public static void studentChallenge(String str) {
        // we've to find if given strinng is binary-no. or not
        System.out.println("valid binary no: " + str.matches("[0-1]+"));
        // we've to find given string is hexadecimal or not
        System.out.println("valid hexadecimal no: " + str.matches("[0-9A-F]+"));
        // we've to find given string is valid date format or not [dd/mm/yyy]
        System.out.println("valid date: " + str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
    public static void studentChallenge2(String str) {
        // remove all the special-characters form string
        System.out.println(str.replaceAll("[^a-z A-Z 0-9]", ""));
        // remove extra spaces from string
        System.out.println(str.replaceAll("\\s+", " ").trim());
        //count number of words in a string
        str=str.replaceAll("\\s+", " ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
    public static void findRadix(String str){
        if(str.matches("[0-1]+"))System.out.println("binary");
        else if(str.matches("[0-7]+"))System.out.println("octal");
        else if(str.matches("[0-9]+"))System.out.println("decimal");
        else if(str.matches("[0-9 A-F]+"))System.out.println("hexadecimal");
        else System.out.println("not a valid number");
    }
    public static void protocolTypeOfWEbsite(String str){
        //protocol
        System.out.println("Protocol is: "+str.substring(0,str.indexOf(":")));
        //type of site
        System.out.println("type of website is: "+str.substring(str.lastIndexOf("."),str.length())); 
    }
    public static void numberToText(int n){
        String str="";
        while(n>0){
            str+=(n%10);
            n/=10;
        }
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(helpNumberToText(str.charAt(i))+" ");
        } 
    }
    public static String helpNumberToText(char c){
        switch(c){
            case '0':return "Zero";
            case '1':return "One";
            case '2':return "Two";
            case '3':return "Three";
            case '4':return "Four";
            case '5':return "Five";
            case '6':return "Six";
            case '7':return "Seven";
            case '8':return "Eight";
            case '9':return "Nine";
        }
        return "Invalid";
    }
    public static void validateName(String name){
        if(name.matches("[a-z A-Z]+"))System.out.println("Valid name: ");
        else System.out.println("not a valid name:");
    }
    public static void anagrams(String s,String str){
        if(s.length()!=str.length())System.out.println("not anagrams");
        boolean check;
        for(int i=0;i<str.length();i++){
            check=false;
            for(int j=0;j<s.length();j++){
                if(str.charAt(i)==s.charAt(j)){
                    check=true;
                    break;
                }    
            }
            if(!(check)){
                System.out.println("not anagrams");
                break;
            }
        }
        System.out.println("anagrams");
    }
    public static void allSubstrings(String str) {
        for(int i=0;i<str.length();i++){
            for (int j = i+1; j <=str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static void toggleCharacters(String str) {
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++)
            if(Character.isUpperCase(sb.charAt(i)))
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            else
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        System.out.println(sb);
    }
    public static void noOfPalindromicSubStrings(String str) {
        int ans=0;
        for(int i=0;i<str.length();i++){
            for (int j = i+1; j <=str.length(); j++) {
              if(isPalindrome(str.substring(i, j)))
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        if(str.equals(sb.reverse().toString()))return true;
        return false;
    }
    public static String reverseString(String str) {
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void reverseEachWord(String str) {
        String words[]=str.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String x:words)
            ans.append(reverseString(x)+" ");
        System.out.println(ans);
    }
    public static void compressString(String str) {
        StringBuilder sb=new StringBuilder();
        char last=str.charAt(0);
        int count=1;
        for(char x:str.toCharArray()){
            if(x==last)count++;
            else{
                sb.append(last);
                if(count>1)sb.append(count);
                last=x;
                count=1;
            }
        }
        System.out.println(sb.append(last+""+count));
    }
    public static void oddEven(String str) {
      
    if(str.length()==1)System.out.print(str.charAt(0));
    else{
    for(int i=1;i<str.length();i+=2){
    System.out.print(str.charAt(i));
    }
    for(int i=0;i<str.length();i+=2){
    System.out.print(str.charAt(i));
    }}
    }
    public static void tTestCases(int n) {
        Scanner sc=new Scanner(System.in);
       for(int i=1;i<=n;i++){
            String str=sc.nextLine();
            int consonant=0,vowel=0,words=1;
            for(char x:str.toCharArray()){
                if(x==' ')words++;
                else if(isvowel(x))vowel++;
                else consonant++;
            }
            System.out.print(words+" "+vowel+" "+consonant+"\n");
       } 
       sc.close();
    }
    public static void prefixEqualSuffix(String str) {
        for(int i=0;i<str.length();i++){
            String temp=str.substring(0, i);
            if(str.lastIndexOf(temp)!=str.indexOf(temp)&&str.lastIndexOf(temp)==str.length()-temp.length()){
                System.out.println(temp.length());
                break;
            }
        }
    }
    public static void countWordsVowelsConsonants(String[] arr) {
        
        for (int i = 1; i <=arr.length; i++) {
            String str =arr[i].trim();
            int consonant = 0, vowel = 0, words = 1;
            for (char x : str.toCharArray()) {
                if (x == ' ') words++;
                else if (isvowel(x)) vowel++;
                else consonant++;
            } 
        System.out.print(words + " " + vowel + " " + consonant);
        System.out.println();
        }
    }

    public static void main(String[] args) {
        prefixEqualSuffix("smartintsmart");
    }
}
