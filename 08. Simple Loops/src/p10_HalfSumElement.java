import java.util.Scanner;

public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int biggestNum = Integer.MIN_VALUE;
        int sumPlusBiggestNum = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(console.nextLine());
            if (biggestNum < input) {
                biggestNum = input;
            }
            sumPlusBiggestNum += input;
        }

        if (sumPlusBiggestNum - biggestNum == biggestNum) {
            int sum = sumPlusBiggestNum - biggestNum;
            System.out.println("Yes Sum = " + (sum));
        } else {
            int diff = Math.abs(biggestNum - Math.abs(biggestNum - sumPlusBiggestNum));
            System.out.println("No Diff = " + diff);
        }
    }
}
