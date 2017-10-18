import java.util.Scanner;

public class p02_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzlePrice = 2.60;
        double speakingDollPrice = 3.0;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.0;

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double puzzleQuantity = Double.parseDouble(scanner.nextLine());
        double speakingDollsQuantity = Double.parseDouble(scanner.nextLine());
        double teddyBearQuantity = Double.parseDouble(scanner.nextLine());
        double minionsQuantity = Double.parseDouble(scanner.nextLine());
        double trucksQuantity = Double.parseDouble(scanner.nextLine());

        double sumOfToys = puzzlePrice * puzzleQuantity +
                            speakingDollPrice * speakingDollsQuantity +
                            teddyBearPrice * teddyBearQuantity +
                            minionPrice * minionsQuantity +
                            truckPrice * trucksQuantity;

        double toysQuantity = puzzleQuantity + speakingDollsQuantity +
                                teddyBearQuantity + minionsQuantity +
                                trucksQuantity;

        if (toysQuantity >= 50) {
            sumOfToys = sumOfToys - (sumOfToys * 0.25);
        }

        double totalMoneyAfterRent = sumOfToys - (sumOfToys * 0.1);

        if (totalMoneyAfterRent >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", totalMoneyAfterRent - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - totalMoneyAfterRent);
        }

    }
}
