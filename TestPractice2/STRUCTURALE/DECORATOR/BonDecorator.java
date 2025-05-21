package STRUCTURALE.DECORATOR;

public class BonDecorator implements IBon{

    private IBon bon;

    public BonDecorator(IBon bon) {
        this.bon = bon;
    }

    @Override
    public String printeazaBon() {
        return bon.printeazaBon();
    }
}
