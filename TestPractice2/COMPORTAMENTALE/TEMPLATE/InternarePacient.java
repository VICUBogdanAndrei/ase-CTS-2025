package COMPORTAMENTALE.TEMPLATE;

public class InternarePacient extends AInternarePacient{
    @Override
    protected void analizareStare() {
        System.out.println("Analiza Stare pacient!");
    }

    @Override
    protected void verificareDisponibilitate() {
        System.out.println("Verificare disponibilitate saloane!");
    }

    @Override
    protected void emitereFisa() {
        System.out.println("Emitere fisa internare!");
    }
}
