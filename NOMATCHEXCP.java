public class NOMATCHEXCP extends Exception {
    //variables declared
    private int lineNum;
    private String inputString;

    //constructor to assign linNumber and String
    public NOMATCHEXCP(int lineNum, String inputString) {
        this.lineNum = lineNum;
        this.inputString = inputString;
    }
//displays message when different input entered.
    public String getMessage() {
        return "Error at line " + lineNum + ": '" + inputString + "' is not equal to 'India'";
    }
}
