package COMPORTAMENTALE.TEMPLATE;

public abstract class AInternarePacient {

    public final void pasiInternare()
    {
        analizareStare();
        verificareDisponibilitate();
        emitereFisa();
    }

    protected abstract void analizareStare();
    protected abstract void verificareDisponibilitate();
    protected abstract void emitereFisa();

}
