import java.util.Scanner;

public class p05_Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int width = (2 * n) - 1;
        int height = (n / 2) + 4;
        int empty = n - 2;

        System.out.printf("@%s@%s@%s\n",
                repeatStr(" ", empty),
                repeatStr(" ", empty),
                repeatStr(" ", empty));

        empty--;

        System.out.printf("**%s*%s**\n",
                repeatStr(" ", empty),
                repeatStr(" ", empty));

        int empty1 = (width - 9) / 2;
        int dots = 1;
        int dotsInside = 1;

        for (int i = 1; i <= n / 2 - 2; i++) {
            System.out.printf("*%s*%s*%s*%s*%s*\n",
                    repeatStr(".", dots),
                    repeatStr(" ", empty1),
                    repeatStr(".", dotsInside),
                    repeatStr(" ", empty1),
                    repeatStr(".", dots));

            dots++;
            empty1 -= 2;
            dotsInside += 2;
        }

        System.out.printf("*%s*%s*%s*\n",
                repeatStr(".", dots),
                repeatStr(".", dotsInside),
                repeatStr(".", dots));

        dots++;

        System.out.printf("*%s%s.%s%s*\n",
                repeatStr(".", dots),
                repeatStr("*", dotsInside / 2),
                repeatStr("*", dotsInside / 2),
                repeatStr(".", dots));

        System.out.printf("%s\n",
                repeatStr("*", width));

        System.out.printf("%s\n",
                repeatStr("*", width));
    }

    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
