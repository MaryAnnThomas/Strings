package stringcompare;

/**
 *
 * @author sony
 */
public class StringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Sachin";
        String s2 = new String("Sachin");
        String s3 = "SACHIN";
        String s4 = "Saurav";
        System.out.println(s.equals(s2));
        System.out.println(s == s2);
        System.out.println(s.compareTo(s4));
    }
    
}
Output:
true
false
-18
BUILD SUCCESSFUL (total time: 0 seconds)
