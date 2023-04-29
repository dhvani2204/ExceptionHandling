/**Dhvani Uday Parekh
 * AIML-B3
 * 21070126126
 */
public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            //try and catch method to display respective message in case invalid input 
            try {
                int n = Integer.parseInt(arg);
                System.out.println("Factorial of " + n + " is " + Factorial.factorial(n));
            }
            //shows the message when string inserted instead of number.
            catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer.");
            }
            //shows the message when the number is out of range.
            catch (FactorialException e) {
                System.out.println(e);
            }
        }
    }
}
