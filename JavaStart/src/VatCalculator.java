public class VatCalculator {
    public static void main(String[] args) {
        double netto = 1150;
        double vat = 0.23;
        double vatAmount = netto*vat;
        double brutto = netto + vatAmount;

        System.out.println("Cena natto towaru: " + netto);
        System.out.println(" Kwota VAT: " + vatAmount);
        System.out.println(" Do zapłaty brutto : " + brutto);
    }
}
