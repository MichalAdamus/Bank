public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        double addResult = calc.add(6.55, 3.90);
        System.out.println(addResult);

        calc.addAndPrint(6,9);
    }
}
