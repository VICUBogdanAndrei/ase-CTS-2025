package FactoryMethod;

public class PatientFundsPaymentFactory extends AbstractPaymentFactory{
    @Override
    public IPayment createPayment(PaymentType paymentType) {
        return new PatientFundsPayment();
    }
}
