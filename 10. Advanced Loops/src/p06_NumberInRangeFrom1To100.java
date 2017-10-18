import java.util.Scanner;

public class p06_NumberInRangeFrom1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Еnter a number in the range [1...100]: ");
            int n = Integer.parseInt(scanner.nextLine());

            if (!(n >= 1 && n <= 100)) {
                System.out.println("Invalid number!");
            } else {
                System.out.println("The number is: " + n);
                break;
            }
        }
    }
}
