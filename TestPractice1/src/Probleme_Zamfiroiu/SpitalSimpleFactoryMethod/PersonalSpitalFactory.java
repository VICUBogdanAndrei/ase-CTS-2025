package Probleme_Zamfiroiu.SpitalSimpleFactoryMethod;

public class PersonalSpitalFactory {

    public IPersonalSpital createPersonal (TipPersonal type)
    {
        IPersonalSpital personalSpital = null;
        if(type == TipPersonal.Medic)
            personalSpital =new PersonalMedic();
        else if(type == TipPersonal.Brancardier)
            personalSpital = new PersonalBrancardier();
        else if(type ==TipPersonal.Asistent)
            personalSpital = new PersonalAsistent();

        return personalSpital;
    }
}
