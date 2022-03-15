public class CarShop {
    public static void main(String[] args) {
        Car nissan1 = new Car();
        nissan1.carBrand = "Nissan";
        nissan1.carModel = "Quasqai";
        nissan1.carColor = "Snow white";
        nissan1.doors = 4;

        Car nissan2 = new Car();
        nissan2.carBrand = "Nissan";
        nissan2.carModel = "Juke";

        System.out.println(nissan1.carModel);
        System.out.println(nissan2.carModel);
    }
}
