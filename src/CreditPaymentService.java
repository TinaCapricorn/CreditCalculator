public class CreditPaymentService {
    public int calculate(int CreditSum, int CreditTime){
        double MonthInterestRate = 9.99/12/100;
        double Coefficient = MonthInterestRate*Math.pow((1+MonthInterestRate),CreditTime)/(Math.pow((1+MonthInterestRate),CreditTime)-1);
        double MonthPay = CreditSum*Coefficient;
        int MonthCreditPay = (int) Math.round(MonthPay);
        return MonthCreditPay;
    }
}
