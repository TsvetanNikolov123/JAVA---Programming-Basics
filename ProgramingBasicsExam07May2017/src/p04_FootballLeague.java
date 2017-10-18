import java.util.Scanner;

public class p04_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        double fens = Double.parseDouble(scanner.nextLine());

        double a = 0.0;
        double b = 0.0;
        double v = 0.0;
        double g = 0.0;


        for (int i = 1; i <= fens; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")) {
                a++;
            } else if (sector.equals("B")) {
                b++;
            } else if (sector.equals("V")) {
                v++;
            } else if (sector.equals("G")) {
                g++;
            }
        }

        double aPercent = a / fens * 100.0;
        double bPercent = b / fens * 100.0;
        double vPercent = v / fens * 100.0;
        double gPercent = g / fens * 100.0;
        double allPercent = fens / capacity * 100.0;

        System.out.printf("%.2f", aPercent);
        System.out.println("%");
        System.out.printf("%.2f", bPercent);
        System.out.println("%");
        System.out.printf("%.2f", vPercent);
        System.out.println("%");
        System.out.printf("%.2f", gPercent);
        System.out.println("%");
        System.out.printf("%.2f", allPercent);
        System.out.println("%");
    }
}
