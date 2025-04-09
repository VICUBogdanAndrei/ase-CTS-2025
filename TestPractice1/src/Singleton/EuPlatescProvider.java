package Singleton;

public class EuPlatescProvider implements IPaymentProvider{

    private static volatile EuPlatescProvider INSTANCE = null;

    //constructor
    private EuPlatescProvider()
    {
        System.out.println("Conexiune stabilita catre EuPlatesc.ro");
    }

    //metoda statics
    public static EuPlatescProvider getInstance(){
        if(INSTANCE == null)
        {
            synchronized (EuPlatescProvider.class){
                if(INSTANCE==null)
                    return new EuPlatescProvider();
            }
        }
        return INSTANCE;
    }

    @Override
    public void initiateTranzactionb() {
        System.out.println("Tranzactia este initiata...");
    }



}
