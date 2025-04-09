package SimpleFactoryMethod;

import FactoryMethod.PaymentType;

public class Main {
    public static void main(String[] args) {

        PaymentType type = PaymentType.PRIVATE_INSURANCE;

        PaymentFactory factory = new PaymentFactory();

        IPayment iPayment = factory.createPayment(type);

        System.out.println(iPayment.getDiscount());

    }
}