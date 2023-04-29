/**Dhvani Uday Parekh
 * AIML-B3
 * 21070126126
 */
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        //try and catch to check if different string entered.
        try {
            //checks if input is equal to "India"
            if (!inputString.equals("India")) {
                throw new NOMATCHEXCP(5, inputString);
            } else {
                System.out.println("Input string matches 'India'");
            }
        } catch (NOMATCHEXCP e) {
            System.out.println(e.getMessage());
        }
    }
}