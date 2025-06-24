package Financial;

public class Main {

    public static double calculateFutureValue(double principal, double rate, int years) {
        return principal * Math.pow(1 + rate, years);
    }

    public static void main(String[] args) {
        double initialAmount = 20000;
        double annualInterestRate = 0.05;
        int timePeriod = 6;

        double futureValue = calculateFutureValue(initialAmount, annualInterestRate, timePeriod);
        System.out.printf("Future Value after %d years: ₹%.2f\n", timePeriod, futureValue);
    }
}

