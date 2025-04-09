package Probleme_Zamfiroiu.SpitalBuilder;

public class Pacient {
    //required
    private String nume;
    private String prenume;

    //optional
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public boolean isPapuciCamera() {
        return papuciCamera;
    }

    public boolean isHalat() {
        return halat;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halat=" + halat +
                '}';
    }

    private Pacient() {
    }


    public static class PacientBuilder{
        private Pacient pacient;

        public PacientBuilder (String nume, String prenume)
        {
            pacient = new Pacient();
            this.pacient.nume=nume;
            this.pacient.prenume=prenume;

            this.pacient.papuciCamera=false;
            this.pacient.patRabatabil=false;
            this.pacient.micDejun=false;
            this.pacient.halat=false;
        }

        public PacientBuilder papuciCamera(boolean papuciCamera)
        {
            this.pacient.papuciCamera=papuciCamera;
            return this;
        }

        public PacientBuilder patRabatabil(boolean patRabatabil)
        {
            this.pacient.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder micDejun (boolean micDejun)
        {
            this.pacient.micDejun=micDejun;
            return this;
        }

        public PacientBuilder halat (boolean halat)
        {
            this.pacient.halat=halat;
            return this;
        }

        public Pacient build()
        {
            return this.pacient;
        }

    }

}
