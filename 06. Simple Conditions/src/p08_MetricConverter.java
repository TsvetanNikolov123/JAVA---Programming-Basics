import java.math.BigDecimal;
import java.util.Scanner;

public class p08_MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number = Double.parseDouble(console.nextLine());
        String inputMetric = console.nextLine();
        String outputMetric = console.nextLine();

        double mm = 1000.0;
        double cm = 100.0;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double m = 1.0;

        double meters = 0;

        if (inputMetric.equals("m")) {
            meters = number / m;
        } else if (inputMetric.equals("mm")) {
            meters = number / mm;
        } else if (inputMetric.equals("cm")) {
            meters = number / cm;
        } else if (inputMetric.equals("mi")) {
            meters = number / mi;
        } else if (inputMetric.equals("in")) {
            meters = number / in;
        } else if (inputMetric.equals("km")) {
            meters = number / km;
        } else if (inputMetric.equals("ft")) {
            meters = number / ft;
        } else if (inputMetric.equals("yd")) {
            meters = number / yd;
        }

        if (outputMetric.equals("m")) {
            System.out.printf("%f", meters * m);
        } else if (outputMetric.equals("mm")) {
            System.out.printf("%f", meters * mm);
        } else if (outputMetric.equals("cm")) {
            System.out.printf("%f", meters * cm);
        } else if (outputMetric.equals("mi")) {
            System.out.printf("%f", meters * mi);
        } else if (outputMetric.equals("in")) {
            System.out.printf("%f", meters * in);
        } else if (outputMetric.equals("km")) {
            System.out.printf("%f", meters * km);
        } else if (outputMetric.equals("ft")) {
            System.out.printf("%f", meters * ft);
        } else if (outputMetric.equals("yd")) {
            System.out.printf("%f", meters * yd);
        }
    }
}