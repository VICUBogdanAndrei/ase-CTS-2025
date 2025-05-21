package COMPORTAMENTALE.STRATEGY;

public class PlataCard implements IStrategiePlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Platit cu cardul: "+ suma);
    }
}
