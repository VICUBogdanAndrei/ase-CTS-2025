package FactoryMethod;

public class PrivateInsurancePaymentFactory extends AbstractPaymentFactory{
    @Override
    public IPayment createPayment(PaymentType paymentType) {
        return new PrivateInsurancePayment();
    }
}
