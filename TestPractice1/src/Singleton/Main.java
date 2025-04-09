package Singleton;

public class Main {
    public static void main(String[] args) {
        IPaymentProvider provider = EuPlatescProvider.getInstance();
        provider.initiateTranzactionb();

        IPaymentProvider provider1 = EuPlatescProvider.getInstance();
        provider1.initiateTranzactionb();
    }
}