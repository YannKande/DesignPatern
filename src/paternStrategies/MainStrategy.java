package paternStrategies;

public class MainStrategy {

    public static void main(String[] args) {

        //pay with MPESSA Orange Money
        PaymentContext paymentContext=new PaymentContext(new OrangeMoneyPayment());
        paymentContext.executePayment();


        //pay with Mpessa Money
         paymentContext.setPaystrategy(new MpessaPayment());
         paymentContext.executePayment();

         //pay with Airtel Money
        paymentContext.setPaystrategy(new AirtelMoneyPayment());
        paymentContext.executePayment();

    }
}
