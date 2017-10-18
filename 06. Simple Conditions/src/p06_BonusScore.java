import java.util.Scanner;

public class p06_BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter score: ");
        double number = Double.parseDouble(console.nextLine());
        double bonusPoints = 0.0;
        if (number > 1000) {
            bonusPoints += number * 0.1;
        } else if (number > 100) {
            bonusPoints += number * 0.2;
        } else if (number <= 100) {
            bonusPoints += 5;
        }

        if (number % 2 == 0){
            bonusPoints += 1;
        }

        if (number % 10 == 5){
            bonusPoints+= 2;
        }

        double totalScore = number + bonusPoints;

        System.out.printf("Bonus score: %f", bonusPoints);
        System.out.println();
        System.out.printf("Total score: %f", totalScore);
    }
}
