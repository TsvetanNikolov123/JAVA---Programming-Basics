import java.util.Scanner;

public class p08_OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int odd = 0;
        int even = 0;

        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(console.nextLine());
            if (i % 2 == 0) {
                even += input;
            } else {
                odd += input;
            }
        }

        if (odd == even) {
            System.out.println("Yes Sum = " + even);
        } else {
            System.out.println("No Diff = " + Math.abs(even - odd));
        }
    }
}
