public class Main {
    public static void main(String[] args) {
        creditPaymentService service = new creditPaymentService();
        int creditSum = 1_000_000;
        int creditTime = 36;
        int monthCreditPay = service.calculate(creditSum, creditTime);
        System.out.println(monthCreditPay);
    }
}
