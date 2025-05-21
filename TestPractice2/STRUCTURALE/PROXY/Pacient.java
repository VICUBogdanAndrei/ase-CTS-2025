package STRUCTURALE.PROXY;

public class Pacient {
    private String reteta;

    public Pacient(String reteta) {
        this.reteta = reteta;
    }

    public Pacient() {
        this.reteta=null;
    }

    public String getReteta() {
        return reteta;
    }

    public void setReteta(String reteta) {
        this.reteta = reteta;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "reteta='" + reteta + '\'' +
                '}';
    }
}
