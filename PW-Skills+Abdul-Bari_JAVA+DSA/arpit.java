/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */

/* You may add any imports here, if you wish, but only from the 
   standard library */

// Do not change the name of this class
public class arpit {

    // You can add new methods here.

    public static String process(String str) {
        StringBuilder result = new StringBuilder();
        String xv = "abeiout";
        int i = 0;
        while (i < str.length()) {
            char x = str.charAt(i);
            boolean check = false;
            while (i + 1 < str.length() && xv.contains("" + str.charAt(i)) && xv.contains("" + str.charAt(i + 1))) {
                i++; 
                check = true;
            }
            if (!check) {
                result.append(x); 
            }
            i++; 
        }
        return result.toString();
    }
    

    // Do not change anything in the `main` method
    public static void main (String[] args) {
        System.out.println(process("Testing is a boring job"));
        // try {
        //     Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
        //     String line = in.nextLine().trim();
        //     String retVal = process(line);
        //     PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        //     output.println(retVal);
        //     output.close();
        // } catch (IOException e) {
        //     System.out.println("IO error in input.txt or output.txt");
        // }
    }
}
