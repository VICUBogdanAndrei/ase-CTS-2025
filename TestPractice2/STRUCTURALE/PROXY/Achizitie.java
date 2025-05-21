package STRUCTURALE.PROXY;

public class Achizitie implements IAchiztieMedicament{

    private Pacient pacient;

    public Achizitie(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public boolean achizitieMedicament(String reteta) {
        if(reteta ==null) {
            System.out.println("Pacietnul este la farmacist si nu are reteta!");
            return false;
        }

        else System.out.println("Pacientul are reteta!");
        return true;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }
}
