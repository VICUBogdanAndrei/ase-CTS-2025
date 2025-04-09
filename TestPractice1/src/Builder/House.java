package Builder;

public class House {
    //required fields
    private float lungime;
    private float latime;
    private float inaltime;
    private float nrEtaje;

    //optional fields
    private String materialConstructie;
    private String nrGeamuri;
    private String vopsea;
    private int nrCamere;
    private int nrBai;

    public float getLungime() {
        return lungime;
    }

    public float getLatime() {
        return latime;
    }

    public float getInaltime() {
        return inaltime;
    }

    public float getNrEtaje() {
        return nrEtaje;
    }

    public String getMaterialConstructie() {
        return materialConstructie;
    }

    public String getNrGeamuri() {
        return nrGeamuri;
    }

    public String getVopsea() {
        return vopsea;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public int getNrBai() {
        return nrBai;
    }

    @Override
    public String toString() {
        return "House{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                ", inaltime=" + inaltime +
                ", nrEtaje=" + nrEtaje +
                ", materialConstructie='" + materialConstructie + '\'' +
                ", nrGeamuri='" + nrGeamuri + '\'' +
                ", vopsea='" + vopsea + '\'' +
                ", nrCamere=" + nrCamere +
                ", nrBai=" + nrBai +
                '}';
    }

    private House() {
    }

    public static class HouseBuilder{

        private House house;

        public HouseBuilder(float lungime, float latime, float inaltime, float nrEtaje)
        {
            this.house = new House();
            this.house.lungime=lungime;
            this.house.latime=latime;
            this.house.inaltime=inaltime;
            this.house.nrEtaje=nrEtaje;
        }

        public HouseBuilder materialeConstructie (String materialConstructie)
        {
            this.house.materialConstructie=materialConstructie;
            return this;
        }
        public HouseBuilder nrGeamuri (String nrGeamuri)
        {
            this.house.nrGeamuri = nrGeamuri;
            return this;
        }
        public HouseBuilder vopsea (String vopsea)
        {
            this.house.vopsea =vopsea;
            return this;
        }
        public HouseBuilder nrCamere (int nrCamere)
        {
            this.house.nrCamere = nrCamere;
            return this;
        }
        public HouseBuilder nrBai (int nrBai)
        {
            this.house.nrBai=nrBai;
            return this;
        }

        public House build()
        {
            return this.house;
        }


    }
}
