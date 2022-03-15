public class MetricTest {
    public static void main(String[] args) {
        MetricConvert converter = new MetricConvert();
        double m = 5;
        double mToCm = converter.metersToCm(m);
        double mToMm = converter.metersToMm(m);
        System.out.println(m + " m to " + mToCm + "cm i " + mToMm + "mm");
    }
}
