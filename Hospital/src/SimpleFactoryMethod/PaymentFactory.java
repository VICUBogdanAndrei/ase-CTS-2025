package SimpleFactoryMethod;

public class PaymentFactory {

    public IPayment create (PaymentType type)
    {
        IPayment iPayment = null;

        if(type==PaymentType.PATIENT_FUNDS)
            iPayment = new PatinetFunds();
        else if(type==PaymentType.PRIVATE_INSURERS)
            iPayment= new PrivateInsurers();
        else if(type==PaymentType.NATIONAL_HEALTH_INSURANCE_HOUSE)
            iPayment=new NationalHealthInsuranceHouse();
        return iPayment;
    }

}
