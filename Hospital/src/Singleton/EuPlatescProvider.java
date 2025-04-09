package Singleton;

public class EuPlatescProvider implements IPaymentProvider{

    private static volatile EuPlatescProvider INSTANCE = null;


    private EuPlatescProvider()
    {
        System.out.println("Conexiune stabilita catre EuPlatesc.ro");
    }

    public static EuPlatescProvider getInstance()
    {
        if(INSTANCE==null)
        {
            synchronized (EuPlatescProvider.class){
                if(INSTANCE==null)
                    return new EuPlatescProvider();
            }
        }
        return INSTANCE;
    }

    @Override
    public void initiateTranzaction() {
        System.out.println("Se initiaza tranzactia...");
    }
}
