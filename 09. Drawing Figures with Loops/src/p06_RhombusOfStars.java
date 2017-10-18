import java.util.Scanner;

/**
 *  * Created by TsvetanNikolov on 08/30/2017.
 *  
 */

public class p06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(repeatStr(" ", n - i));
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1 ; i--) {
            System.out.print(repeatStr(" ", n - i));
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
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