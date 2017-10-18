import java.io.Console;
import java.util.Scanner;

public class p10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftRight = (n - 1) / 2;

        for (int i = 1; i <= (n - 1) / 2; i++) {
            System.out.print(repeatStr("-", leftRight));
            System.out.print("*");
            int mid = n - (2 * leftRight) - 2;
            if (mid >= 0) {
                System.out.print(repeatStr("-", mid));
                System.out.print("*");
            }
            System.out.println(repeatStr("-", leftRight));
            leftRight--;
        }

        for (int i = (n + 1) / 2; i >= 1; i--) {
            System.out.print(repeatStr("-", leftRight));
            System.out.print("*");
            int mid = n - (2 * leftRight) - 2;
            if (mid >= 0) {
                System.out.print(repeatStr("-", mid));
                System.out.print("*");
            }
            System.out.println(repeatStr("-", leftRight));
            leftRight++;
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
