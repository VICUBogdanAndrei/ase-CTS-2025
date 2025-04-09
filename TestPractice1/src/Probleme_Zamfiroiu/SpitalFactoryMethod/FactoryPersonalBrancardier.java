package Probleme_Zamfiroiu.SpitalFactoryMethod;

public class FactoryPersonalBrancardier extends AbstractPersonalSpital{
    @Override
    public IPersonalSpital create() {
        return new PersonalBrancardier();
    }
}
