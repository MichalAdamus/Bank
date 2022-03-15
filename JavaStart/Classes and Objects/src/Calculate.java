public class Calculate {
    public static void main(String[] args) {
        double x = 15;
        double y = 5.5;

        Calculator calculator = new Calculator();
        double add = calculator.add(x, y);
        double substract = calculator.substract(x, y);
        System.out.println(x + " + " + y + " = " + add);
        System.out.println(x + " - " + y + " = " + substract);
    }
}
