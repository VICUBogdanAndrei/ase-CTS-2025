package SimpleFactoryMethod;

import FactoryMethod.PaymentType;

public class PaymentFactory {
    public IPayment createPayment(PaymentType type)
    {
        IPayment payment=null;

        if(type==PaymentType.PATIENT_FUNDS)
            payment = new PatientFundsPayment();
        if(type==PaymentType.NATIONAL_HEALTH)
            payment=new NationalHeathPayment();
        if (type ==PaymentType.PRIVATE_INSURANCE)
            payment = new PrivateInsurancePayment();

        return payment;
    }
}
