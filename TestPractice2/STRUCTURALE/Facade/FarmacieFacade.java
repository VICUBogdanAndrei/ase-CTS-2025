package STRUCTURALE.Facade;

public class FarmacieFacade {
    private CardSanatateCheck cardSanatateCheck;
    private DisponibilitateCheck disponibilitateCheck;
    private RetetaCheck retetaCheck;


    public FarmacieFacade ()
    {
        cardSanatateCheck = new CardSanatateCheck();
        disponibilitateCheck = new DisponibilitateCheck();
        retetaCheck = new RetetaCheck();
    }

    public boolean verificariFarmacist(String CNP, String numarReteta, String medicament)
    {
        System.out.println("\n-- STRUCTURALE.PROXY verificare --");
        boolean cardOk = cardSanatateCheck.VerificareCardSanatate(CNP);
        boolean retetaOK = retetaCheck.VerificareReteta(numarReteta);
        boolean medicamentOK = disponibilitateCheck.VerificareDisponibilitateMedicamente(medicament);

        return retetaOK && cardOk && medicamentOK;
    }
}
