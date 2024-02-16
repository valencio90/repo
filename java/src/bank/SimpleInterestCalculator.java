package bank;
/**
 * The SimpleInterestCalculator class calculates simple interest based on the provided
 * principal amount, interest rate, and time.
 * 
 * @author valencio
 */
public class SimpleInterestCalculator {
	
	SimpleInterestCalculator(){
		
	}
    // Instance variables
    private double principal;
    private double rate;
    private int time;

    /**
     * Constructs a SimpleInterestCalculator with the specified principal amount, interest rate, and time.
     *
     * @param principal The principal amount (initial investment or loan amount).
     * @param rate      The annual interest rate (in percentage).
     * @param time      The time duration for which the interest is calculated (in years).
     */
    public SimpleInterestCalculator(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    /**
     * Calculates and returns the simple interest based on the provided principal, rate, and time.
     *
     * @return The calculated simple interest.
     */
    public double calculateSimpleInterest() {
        double simpleInterest = (principal * rate * time) / 100.0;
        return simpleInterest;
    }

    /**
     * Gets the principal amount.
     *
     * @return The principal amount.
     */
    public double getPrincipal() {
        return principal;
    }

    /**
     * Gets the annual interest rate.
     *
     * @return The annual interest rate.
     */
    public double getRate() {
        return rate;
    }

    /**
     * Gets the time duration for which the interest is calculated.
     *
     * @return The time duration (in years).
     */
    public int getTime() {
        return time;
    }
}
