package bank;

/**
 * The Bank class serves as the main class for testing the Banking and SimpleInterestCalculator classes.
 * It creates an instance of the Banking class, performs various operations, and calculates simple interest.
 * 
 * @author valencio
 * 
 */
public class Bank {

    /**
     * The main method where the program execution starts.
     * It creates instances of the Banking and SimpleInterestCalculator classes,
     * performs various operations, and calculates simple interest.
     * 
     * @param args requires for main method.
     */
    public static void main(String[] args) {
        // Create an instance of the Banking class
        Banking b1 = new Banking();

        // Get user details, display account details, deposit and withdraw money
        b1.getUserDetails();
        b1.displayAccountDetails();
        b1.depositAmount(1000);
        b1.withdrawAmount();

        // Create an instance of the SimpleInterestCalculator class
        SimpleInterestCalculator s1 = new SimpleInterestCalculator(1000, 5, 3);

        // Calculate simple interest
        double interest = s1.calculateSimpleInterest();

        // Display the calculated interest
        System.out.print("\nInterest for principal with " + 1000 + " rate " + 5 + " time " + 3 + " is " + interest);
    }
}
