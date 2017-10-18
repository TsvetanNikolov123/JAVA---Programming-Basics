import java.util.Scanner;

public class p09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int stars = 1;

        if (n % 2 == 0) stars++;
        for (int i = 0; i < (n + 1) / 2; i++) {
            int dashes = (n - stars) / 2;
            System.out.print(repeatStr("-", dashes));
            System.out.print(repeatStr("*", stars));
            System.out.println(repeatStr("-", dashes));
            stars = stars + 2;
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.print("|");
            System.out.print(repeatStr("*", n - 2));
            System.out.println("|");
        }
    }

    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
