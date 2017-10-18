import java.util.Scanner;

public class p03_SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int r = 0; r <= n; r++) {
            System.out.print("*");
            for (int c = 0; c < n; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
