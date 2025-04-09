package Probleme_Zamfiroiu.SpitalFactoryMethod;

public class FactoryPersonalMedic extends AbstractPersonalSpital{
    @Override
    public IPersonalSpital create() {
        return new PersonalMedic();
    }
}
