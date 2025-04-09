package FactoryMethod;

public abstract class AbstractPaymentFactory {
    public abstract IPayment createPayment(PaymentType paymentType);

    @Override
    public String toString() {
        return "AbstractPaymentFactory{}";
    }
}
