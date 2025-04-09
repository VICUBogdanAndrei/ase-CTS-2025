import SimpleFactoryMethod.IPayment;
import SimpleFactoryMethod.PaymentFactory;
import SimpleFactoryMethod.PaymentType;
import Singleton.EuPlatescProvider;
import Singleton.IPaymentProvider;

public class Main {
    public static void main(String[] args) {

        PaymentType type = PaymentType.PRIVATE_INSURERS;

        PaymentFactory paymentFactory = new PaymentFactory();
        IPayment iPayment = paymentFactory.create(type);

        System.out.println(iPayment.getDiscount());

        IPaymentProvider iPaymentProvider = EuPlatescProvider.getInstance();
        iPaymentProvider.initiateTranzaction();




    }
}