public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int CreditSum = 1_000_000;
        int CreditTime = 36;
        int MonthCreditPay = service.calculate(CreditSum, CreditTime);
        System.out.println(MonthCreditPay);
    }
}
