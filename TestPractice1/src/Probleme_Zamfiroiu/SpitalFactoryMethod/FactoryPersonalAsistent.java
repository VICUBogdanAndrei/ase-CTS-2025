package Probleme_Zamfiroiu.SpitalFactoryMethod;

public class FactoryPersonalAsistent extends AbstractPersonalSpital{
    @Override
    public IPersonalSpital create() {
        return new PersonalAsistent();
    }
}
