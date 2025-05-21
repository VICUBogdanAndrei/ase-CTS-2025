package STRUCTURALE.DECORATOR;

public class BonFelicitare extends BonDecorator {
    public BonFelicitare(IBon bon) {
        super(bon);
    }

    @Override
    public String printeazaBon() {
        return super.printeazaBon()+ " La multi ani!\n\n";
    }
}
