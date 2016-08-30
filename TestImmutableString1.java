package testimmutablestring1;

/**
 *
 * @author sony
 */
public class TestImmutableString1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Sachin";
        s = s.concat("Tendulkar");
        System.out.println(s);
    }
    
}
Output:
run:
SachinTendulkar
BUILD SUCCESSFUL (total time: 0 seconds)
