package STRUCTURALE.DECORATOR;

import STRUCTURALE.PROXY.Achizitie;
import STRUCTURALE.PROXY.AchizitieProxy;
import STRUCTURALE.PROXY.Pacient;

public class Main {
    public static void main(String[] args) {
        IBon bon = new Bon();

        System.out.println("Normal: " + bon.printeazaBon());

        IBon bonFelicitare = new BonFelicitare(bon);

        System.out.println("Decorator: " + bonFelicitare.printeazaBon());



    }
}