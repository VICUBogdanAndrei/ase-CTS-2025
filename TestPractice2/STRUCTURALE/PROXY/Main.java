package STRUCTURALE.PROXY;

import STRUCTURALE.Facade.CardSanatateCheck;
import STRUCTURALE.Facade.DisponibilitateCheck;
import STRUCTURALE.Facade.FarmacieFacade;
import STRUCTURALE.Facade.RetetaCheck;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("123456");
        Pacient pacient1 = new Pacient();

        Achizitie achizitie = new Achizitie(pacient);
        Achizitie achizitie1 = new Achizitie(pacient1);

        AchizitieProxy achizitieProxy = new AchizitieProxy(achizitie);

        achizitieProxy.achizitieMedicament(achizitieProxy.achizitieOld.getPacient().getReteta());

        AchizitieProxy achizitieProxy1 = new AchizitieProxy(achizitie1);
        achizitieProxy1.achizitieMedicament(achizitieProxy1.achizitieOld.getPacient().getReteta());
    }
}