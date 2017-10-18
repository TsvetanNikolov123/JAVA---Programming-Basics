import java.util.Scanner;

public class p11_Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String projection = console.nextLine();
        int row = Integer.parseInt(console.nextLine());
        int column = Integer.parseInt(console.nextLine());

        double siting = row * column;


        if (projection.equals("Premiere")) {
            System.out.printf("%.2f", siting * 12.00);
            System.out.println();
            System.out.println("leva");
        } else if (projection.equals("Normal")) {
            System.out.printf("%.2f", siting * 7.50);
            System.out.println();
            System.out.println("leva");
        } else if (projection.equals("Discount")) {
            System.out.printf("%.2f", siting * 5.00);
            System.out.println();
            System.out.println("leva");
        }
    }
}
