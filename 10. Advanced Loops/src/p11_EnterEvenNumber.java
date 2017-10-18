import java.util.Scanner;

public class p11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            try
            {
                System.out.print("Enter even number: ");
                int n = Integer.parseInt(scanner.nextLine());

                if (n % 2 == 0)
                {
                    System.out.println("Even number entered: " + n);
                    break;
                }
                System.out.println("The number is not even.");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid number!");
            }
        }
    }
}
