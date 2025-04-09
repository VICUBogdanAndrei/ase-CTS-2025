package SimpleFactoryMethod;

public class PrivateInsurancePayment implements IPayment {
    @Override
    public double getDiscount() {
        return 0.1;
    }
}
