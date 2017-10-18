import java.util.Scanner;

public class p04_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int r = 0; r < n; r++) {
            for (int c = 0; c <= r; c++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
