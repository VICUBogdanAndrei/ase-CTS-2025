package COMPORTAMENTALE.STRATEGY;

import COMPORTAMENTALE.TEMPLATE.InternarePacient;

public class Main {
    public static void main(String[] args) {
        IStrategiePlata strategiePlataCard = new PlataCard();
        IStrategiePlata strategiePlataCash = new PlataCash();

        Client client = new Client(strategiePlataCard);
        client.efectueazaPlata(500);

        Client clientCash = new Client(strategiePlataCash);
        client.efectueazaPlata(400);

        IStrategiePlata blank = null;
        Client clientNull = new Client(blank);
        clientNull.efectueazaPlata(200);
    }
}