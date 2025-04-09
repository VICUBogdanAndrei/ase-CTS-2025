package FactoryMethod;

public class NationHealthPaymentFactory extends AbstractPaymentFactory{
    @Override
    public IPayment createPayment(PaymentType paymentType) {
        return new NationalHeathPayment();
    }
}
