import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        int third = Integer.parseInt(console.nextLine());

        int combinedTime = first + second + third;
        if (combinedTime < 10) {
            System.out.println("0:0" + combinedTime);
        } else if (combinedTime < 60) {
            System.out.println("0:" + combinedTime);
        } else if (combinedTime < 120) {
            int seconds = combinedTime - 60;
            if (seconds < 10) {
                System.out.println("1:0" + seconds);
            } else {
                System.out.println("1:" + seconds);
            }
        } else if (combinedTime < 180) {
            int seconds = combinedTime - 120;
            if (seconds < 10) {
                System.out.println("2:0" + seconds);
            } else {
                System.out.println("2:" + seconds);
            }
        }
    }
}
