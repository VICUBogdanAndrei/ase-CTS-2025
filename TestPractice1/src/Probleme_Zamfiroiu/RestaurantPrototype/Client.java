package Probleme_Zamfiroiu.RestaurantPrototype;

import java.util.ArrayList;
import java.util.List;

public class Client implements Cloneable{
    private String nume;
    private int nrPersoane;
    private String masa;
    private List<String> numePersoane;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public List<String> getNumePersoane() {
        return numePersoane;
    }

    public void setNumePersoane(List<String> numePersoane) {
        this.numePersoane = numePersoane;
    }

    public Client(String nume, int nrPersoane, String masa, List<String> numePersoane) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.masa = masa;
        this.numePersoane = numePersoane;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", masa='" + masa + '\'' +
                ", numePersoane=" + numePersoane +
                '}';
    }

    @Override
    protected Object clone() {

        Client copy = null;
        try {
            copy = (Client) super.clone();
            copy.numePersoane= new ArrayList<>(this.numePersoane);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return copy;
    }
}
