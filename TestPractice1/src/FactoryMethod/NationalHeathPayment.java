package FactoryMethod;

public class NationalHeathPayment implements IPayment{
    @Override
    public double getDiscount() {
        return 0;
    }
}
