import java.text.DecimalFormat;

public class NthSeries {

    public static void main(String[] args) {
        System.out.println(seriesSum(9));
    }

    public static String seriesSum(int n) {

        DecimalFormat df = new DecimalFormat("0.00");

        double value = 0.00;
        for (double i = 0; i < n - 1; i++) {
            value += (1 / ((3 * i) + 4));
        }
        return (df.format(value + 1));
    }
}