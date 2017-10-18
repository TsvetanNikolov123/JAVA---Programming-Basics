import java.util.Scanner;
import java.text.DecimalFormat;

public class p11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");


        double n = Double.parseDouble(console.nextLine());
        double oddSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {
            double input = Double.parseDouble(console.nextLine());

            if (i % 2 == 0) {
                evenSum += input;
                if (input < evenMin) {
                    evenMin = input;
                }
                if (input > evenMax) {
                    evenMax = input;
                }
            } else {
                oddSum += input;
                if (input < oddMin) {
                    oddMin = input;
                }
                if (input > oddMax) {
                    oddMax = input;
                }
            }
        }

        System.out.println("OddSum=" + df.format(oddSum) + ",");

        if (oddMin != 1000000000.0) {
            System.out.println("OddMin=" + df.format(oddMin) + ",");
        } else {
            System.out.println("OddMin=No,");
        }

        if (oddMax != -1000000000.0) {
            System.out.println("OddMax=" + df.format(oddMax) + ",");
        } else {
            System.out.println("OddMax=No,");
        }

        System.out.println("EvenSum=" + df.format(evenSum));

        if (evenMin != 1000000000.0) {
            System.out.println("EvenMin=" + df.format(evenMin) + ",");
        } else {
            System.out.println("EvenMin=No,");
        }

        if (evenMax != -1000000000.0) {
            System.out.println("EvenMax=" + df.format(evenMax) + ",");
        } else {
            System.out.println("EvenMax=No");
        }
    }
}
