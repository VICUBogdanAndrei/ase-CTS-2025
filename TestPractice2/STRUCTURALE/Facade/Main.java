package STRUCTURALE.Facade;

public class Main {
    public static void main(String[] args) {
        CardSanatateCheck cardSanatateCheck = new CardSanatateCheck();
        DisponibilitateCheck disponibilitateCheck = new DisponibilitateCheck();
        RetetaCheck retetaCheck = new RetetaCheck();

        String CNP ="5020502270026";
        String numarReteta = "12345";
        String medicament = "Paracetamol";

        //step by step
        System.out.println("\n-- STEP BY STEP --");
        cardSanatateCheck.VerificareCardSanatate(CNP);
        retetaCheck.VerificareReteta(numarReteta);
        disponibilitateCheck.VerificareDisponibilitateMedicamente(medicament);

        //facade
        FarmacieFacade farmacieFacade = new FarmacieFacade();
        farmacieFacade.verificariFarmacist(CNP,numarReteta,medicament);

    }
}