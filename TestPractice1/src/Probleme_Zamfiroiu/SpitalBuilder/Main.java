package Probleme_Zamfiroiu.SpitalBuilder;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient.PacientBuilder("Bogdan","Vicu").build();

        System.out.println(pacient.toString());

        Pacient pacient1 = new Pacient.PacientBuilder("Claudia","Ionescu").halat(true).micDejun(true).build();

        System.out.println(pacient1.toString());


    }
}