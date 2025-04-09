package Probleme_Zamfiroiu.RestaurantPrototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Client clientOriginal = new Client("Popescu Ion", 3, "Masa 5", List.of("Ana","Bogdan","Marcel"));

        Client clientCopy = (Client) clientOriginal.clone();

        System.out.println(clientCopy.toString());

    }
}