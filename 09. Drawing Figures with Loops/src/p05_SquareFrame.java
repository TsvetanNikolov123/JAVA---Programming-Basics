import java.util.Scanner;

public class p05_SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        System.out.print("+ ");
        System.out.print(repeatStr("- ",n-2));
        System.out.println("+");

        for (int i = 0; i < n - 2; i++) {
            System.out.print("| ");
            System.out.print(repeatStr("- ",n-2));
            System.out.println("|");
        }

        System.out.print("+ ");
        System.out.print(repeatStr("- ",n-2));
        System.out.println("+");
    }

    public static String repeatStr(String str,int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
