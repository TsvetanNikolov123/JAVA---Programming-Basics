import java.util.Scanner;

public class p05_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;
        System.out.println(sum);
        for (int i = 1; i <= n ; i++) {
            sum = sum * 2 + 1;
            if (sum > n){
                break;
            } else {
                System.out.println(sum);
            }
        }
    }
}
