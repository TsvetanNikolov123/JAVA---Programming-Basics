import java.util.Scanner;

public class p05_InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.nextLine());

        if (!(input <= 200 && input >= 100)) {
            System.out.println("invalid");
        }
    }
}
