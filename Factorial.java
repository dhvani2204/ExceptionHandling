public class Factorial {
    
    //exception thrown when the number is out of range and factorial calculated. 
    public static int factorial(int n) throws FactorialException {
        if (n < 0 || n > 15) {
            throw new FactorialException(n);
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FactorialException extends Exception {
    private int n;
    
    public FactorialException(int n) {
        this.n = n;
    }
    @Override
    public String toString() {
        return "FactorialException: " + n + " is out of range (0-15).";
    }
}
