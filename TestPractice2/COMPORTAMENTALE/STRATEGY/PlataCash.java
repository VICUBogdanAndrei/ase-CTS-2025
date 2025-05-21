package COMPORTAMENTALE.STRATEGY;

public class PlataCash implements IStrategiePlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Platit cash: "+ suma);
    }
}
