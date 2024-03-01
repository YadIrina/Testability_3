public class CreditPaymentService {

    public int calculate(double numberOfPayments, double percent, double loanAmount, double monthlyPayment) {
        double monthlyPercent = percent / 12;
        double monthlyPayment = loanAmount * (monthlyPercent + (monthlyPercent / (Math.pow((1 + monthlyPercent), numberOfPayments))-1));

        return (double) monthlyPayment;

    }
}