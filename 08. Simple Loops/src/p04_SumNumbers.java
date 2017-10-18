import java.util.Scanner;

public class p04_SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(console.nextLine());
            sum += input;
        }

        System.out.println(sum);
    }
}
