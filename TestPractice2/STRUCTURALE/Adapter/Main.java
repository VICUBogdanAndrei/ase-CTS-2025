package STRUCTURALE.Adapter;

public class Main {
    public static void main(String[] args) {

        Preparat preparat = new Preparat("Snitel",500,"ABCD","20");

        SoftVechi softVechi = new SoftVechi();

        softVechi.printeazaBonVechi(preparat);

        AdapterNouToVechi adapterNouToVechi = new AdapterNouToVechi();

        adapterNouToVechi.printeazaBonVechi(preparat);

    }
}