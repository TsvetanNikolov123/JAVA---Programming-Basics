import java.util.Scanner;

public class p07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int left = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(console.nextLine());
            left += input;
        }

        int right = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(console.nextLine());
            right += input;
        }

        if (Math.abs(left - right) == 0) {
            System.out.println("Yes, sum = " + right);
        } else {
            System.out.println("No, diff = " + Math.abs(left - right));
        }
    }
}
