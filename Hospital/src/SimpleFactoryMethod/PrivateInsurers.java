package SimpleFactoryMethod;

public class PrivateInsurers implements IPayment{
    @Override
    public double getDiscount() {
        return 0.1;
    }
}
