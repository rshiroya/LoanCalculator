
public class Loan
{
    //constants
    private final int MONTHS_IN_YEAR = 12;
    // instance variables - replace the example below with your own
    private double monthlyPayment;
    private double loanAmount;
    private double monthlyInterestRate;
    private double numberOfPayments;
    
    public Loan(double inAmount, double inAnnualRate, double inNumberOfYears)
    {
        loanAmount = inAmount;
        monthlyInterestRate =inAnnualRate/(100 * MONTHS_IN_YEAR);
        numberOfPayments = inNumberOfYears * MONTHS_IN_YEAR;
       // L [ R(1 + R)p ] / [ (1 + R)p - 1 ]
        monthlyPayment = loanAmount * (monthlyInterestRate * 
                   Math.pow(1 + monthlyInterestRate, numberOfPayments))/
                   (Math.pow(1 + monthlyInterestRate,numberOfPayments)-1);
       }
}
