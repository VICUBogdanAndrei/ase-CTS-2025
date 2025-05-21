package STRUCTURALE.Adapter;

public class AdapterNouToVechi  extends SoftNou implements ISoftVechi{


    @Override
    public void printeazaBonVechi(Preparat p) {
        System.out.println("STRUCTURALE.Adapter:");

        this.printeazaBonNou(p.getDenumire());
    }
}
