import java.util.Scanner;

public class p11_USDToBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double dolars = Double.parseDouble(console.nextLine());

        double leva = dolars * 1.79549;

        System.out.printf("%.2f BGN", leva);
    }
}

