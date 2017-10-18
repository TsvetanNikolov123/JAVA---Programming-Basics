import java.util.Scanner;

public class p13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        int num = 1;

        while (num <= n){
            for (int i = 0; i < counter; i++) {
                System.out.print(num + " ");
                num++;
                if (num > n){
                    return;
                }
            }
            counter++;
            System.out.println();
        }
    }
}
