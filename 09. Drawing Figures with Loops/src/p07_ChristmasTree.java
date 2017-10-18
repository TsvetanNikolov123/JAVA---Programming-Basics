import java.util.Scanner;

public class p07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            String stars = repeatStr("*", i);
            String spaces = repeatStr(" ", n - i);
            System.out.print(spaces);
            System.out.print(stars);
            System.out.print(" | ");
            System.out.print(stars);
            System.out.println(spaces);
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
