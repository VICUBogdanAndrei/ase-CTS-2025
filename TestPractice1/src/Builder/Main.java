package Builder;

public class Main {
    public static void main(String[] args) {

        House house = new House.HouseBuilder(10,12,3,9).nrBai(3).materialeConstructie("Caramida").vopsea("Galben+Verde").nrCamere(5).build();

        System.out.println(house.toString());
    }
}