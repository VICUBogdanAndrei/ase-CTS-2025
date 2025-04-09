package Probleme_Zamfiroiu.SpitalFactoryMethod;

public class Main {
    public static void main(String[] args) {
        AbstractPersonalSpital abstractPersonalSpital = new FactoryPersonalMedic();
        IPersonalSpital iPersonalSpital = abstractPersonalSpital.create();

        iPersonalSpital.detalii();
    }
}