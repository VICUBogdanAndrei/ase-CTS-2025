package STRUCTURALE.Adapter;

public class Preparat {
    private String denumire;
    private float cantitate;
    private String reteta;
    private String timp;

    public Preparat(String denumire, float cantitate, String reteta, String timp) {
        this.denumire = denumire;
        this.cantitate = cantitate;
        this.reteta = reteta;
        this.timp = timp;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getCantitate() {
        return cantitate;
    }

    public void setCantitate(float cantitate) {
        this.cantitate = cantitate;
    }

    public String getReteta() {
        return reteta;
    }

    public void setReteta(String reteta) {
        this.reteta = reteta;
    }

    public String getTimp() {
        return timp;
    }

    public void setTimp(String timp) {
        this.timp = timp;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumire='" + denumire + '\'' +
                ", cantitate=" + cantitate +
                ", reteta='" + reteta + '\'' +
                ", timp='" + timp + '\'' +
                '}';
    }
}

