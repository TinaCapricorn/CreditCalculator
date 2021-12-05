public class creditPaymentService {
    public int calculate(int creditSum, int creditTime){
        double monthInterestRate = 9.99/12/100;
        double coefficient = monthInterestRate*Math.pow((1+monthInterestRate),creditTime)/(Math.pow((1+monthInterestRate),creditTime)-1);
        double MonthPay = creditSum*coefficient;
        int MonthCreditPay = (int) Math.round(MonthPay);
        return MonthCreditPay;
    }
}
