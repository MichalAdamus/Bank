import java.util.Random;

public class MathOperators {
    public static void main(String[] args) {
        Random rand = new Random();

// Obtain a number between [0 - 49].
        int x = rand.nextInt(50);
        int y = rand.nextInt(50);
        System.out.println(" X = " + x + " , " + " Y = " + y);


        // Zadania nr 1
        boolean result = x > y;
        System.out.println(" Czy X większe od Y ? " + " WYNIK : " + result);

        // Zadanie nr 2
        int xMultipliedBy2 = x*2;
        result = xMultipliedBy2 > y;
        System.out.println(" Wynik mnożenia zmiennej X razy 2 to : " + xMultipliedBy2 + " " + "WYNIK : " + result);

        // Zadanie nr 3
        result = y < x + 3 && y > x - 2;
        System.out.println("y < x + 3 && y > x - 2 = " + result);

        // Zadanie nr 4
        int multiply = x * y;
        int modulo = multiply /2;
        result = modulo == 0;
        System.out.println("Czy liczba z wyniku mnożenia X*Y jest parzysta ? " + " Wynik: " + result);

    }
}
