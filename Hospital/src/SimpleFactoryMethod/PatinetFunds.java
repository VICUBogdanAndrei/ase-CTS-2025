package SimpleFactoryMethod;

public class PatinetFunds implements IPayment{
    @Override
    public double getDiscount() {
        return 0.2;
    }
}
