import java.util.Scanner;

public class p06_MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int num = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(console.nextLine());
            if (input < num){
                num = input;
            }
        }

        System.out.println(num);
    }
}
