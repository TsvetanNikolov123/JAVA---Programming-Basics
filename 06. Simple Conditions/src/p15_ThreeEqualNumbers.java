import java.util.Scanner;

public class p15_ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());
        int thirdNumber = Integer.parseInt(console.nextLine());

        if (firstNumber == secondNumber &&
                secondNumber == thirdNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
