//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int numberOfPayments = 12;
        double percent = 9.99;
        int loanAmount = 1_000_000;


        double monthlyPayment = service.calculate(numberOfPayments,percent,loanAmount);
        System.out.println("Ежемесячный платёж :" + monthlyPayment);
    }
}