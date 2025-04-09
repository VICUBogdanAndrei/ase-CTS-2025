package Probleme_Zamfiroiu.SpitalSimpleFactoryMethod;

public class Main {
    public static void main(String[] args) {
        TipPersonal type = TipPersonal.Medic;

        PersonalSpitalFactory personalSpitalFactory = new PersonalSpitalFactory();

        IPersonalSpital iPersonalSpital = personalSpitalFactory.createPersonal(type);

        iPersonalSpital.afisareDetalii();
    }
}