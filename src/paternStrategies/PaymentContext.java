package paternStrategies;

public class PaymentContext {

    public void setPaystrategy(PayStrategy paystrategy) {
        this.paystrategy = paystrategy;
    }

    private PayStrategy paystrategy;

    public PaymentContext(PayStrategy paystrategy) {
        this.paystrategy = paystrategy;
    }


    void executePayment(){
        if (paystrategy==null){

            System.out.println("PLeas choice a payment Mode to Process");
         return;
        }

        paystrategy.pay();
    }
}
