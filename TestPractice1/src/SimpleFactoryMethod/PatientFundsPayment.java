package SimpleFactoryMethod;

public class PatientFundsPayment implements IPayment {
    @Override
    public double getDiscount() {
        return 0.20;
    }
}
