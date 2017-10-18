import java.util.Scanner;

public class p08_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.print(repeatStr("*", n * 2));
        System.out.print(repeatStr(" ", n));
        System.out.println(repeatStr("*", n * 2));

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            System.out.print(repeatStr("/", 2 * n - 2));
            System.out.print("*");
            if (i == (n - 1) / 2 - 1) {
                System.out.print(repeatStr("|", n));
            } else {
                System.out.print(repeatStr(" ", n));
            }
            System.out.print("*");
            System.out.print(repeatStr("/", 2 * n - 2));
            System.out.println("*");
        }

        System.out.print(repeatStr("*", n * 2));
        System.out.print(repeatStr(" ", n));
        System.out.println(repeatStr("*", n * 2));
    }

    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
