package FactoryMethod;

public class Main {
    public static void main(String[] args) {

        PaymentType type = PaymentType.PRIVATE_INSURANCE;

        AbstractPaymentFactory myPayment = new PrivateInsurancePaymentFactory();

        IPayment payment = myPayment.createPayment(type);

        System.out.println(payment.getDiscount());

    }
}