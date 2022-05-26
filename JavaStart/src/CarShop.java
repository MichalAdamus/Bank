public class CarShop {
    public static void main(String[] args) {
        Car Nissan = new Car();
        Car Mercedes = new Car();
        Car Fiat = new Car();

        Nissan.brand = "Nissan";
        Nissan.model = "Quasqai";
        Nissan.carColor = "White";
        Nissan.version = "Tekna";
        Nissan.doors = 5;
        Nissan.price = 125000;

        String NissanInfo = Nissan.brand + " " + Nissan.model
        + ", Liczba Drzwi " + Nissan.doors + ", Kolor " + Nissan.carColor +
                ", Wersja wyposażenia " + Nissan.version + ", Cena wybranego modelu : " + Nissan.price + " PLN";
        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(NissanInfo);

        Mercedes.brand = "Mercedes";
        Mercedes.model = "GLC 500 AMG";
        Mercedes.carColor = "Black";
        Mercedes.version = "AMG";
        Mercedes.doors = 5;
        Mercedes.price = 567000;

        String MercedesInfo = Mercedes.brand + " " + Mercedes.model
                + ", Liczba Drzwi " + Mercedes.doors + ", Kolor " + Mercedes.carColor +
                ", Wersja wyposażenia " + Mercedes.version + ", Cena wybranego modelu : " + Mercedes.price + " PLN";;
        System.out.println();
        System.out.println("Alteratywnie proponujemy następujący samochód marki PREMIUM : ");
        System.out.println(MercedesInfo);

    }
}
