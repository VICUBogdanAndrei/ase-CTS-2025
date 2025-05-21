package STRUCTURALE.PROXY;

import java.sql.SQLOutput;

public class AchizitieProxy implements IAchiztieMedicament{

    Achizitie achizitieOld;

    public AchizitieProxy(Achizitie achizitieOld) {
        this.achizitieOld = achizitieOld;
    }

    @Override
    public boolean achizitieMedicament(String reteta) {
        if(reteta ==null)
        {
            System.out.println("Nu se poate achizitiona!");
            return false;
        }
        else
        {
            if(this.achizitieOld.achizitieMedicament(reteta)==true)
            {
                return true;
            }

            else{
                return false;
            }

        }
    }
}
