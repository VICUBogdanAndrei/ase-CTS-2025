package COMPORTAMENTALE.STRATEGY;

public class Client {
    private IStrategiePlata strategiePlata;

    public Client(IStrategiePlata strategiePlata) {
        this.strategiePlata = strategiePlata;
    }

    public void efectueazaPlata(double suma)
    {
        if(strategiePlata!=null)
            this.strategiePlata.plateste(suma);
        else {
            System.out.println("Nu a fost selectat un tip de plata!");
        }
    }

}
