import java.util.Scanner;

public class p01_AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerQuantity = Double.parseDouble(scanner.nextLine());
        double wineQuantity = Double.parseDouble(scanner.nextLine());
        double rakiaQuantity = Double.parseDouble(scanner.nextLine());
        double whiskeyQuantity = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice * 0.5;
        double winePrice = rakiaPrice - (rakiaPrice * 0.4);
        double beerPrice = rakiaPrice - (rakiaPrice * 0.8);

        double rakiaTotalPrice = rakiaPrice * rakiaQuantity;
        double wineTotalPrice = winePrice * wineQuantity;
        double beerTotalPrice = beerPrice * beerQuantity;
        double whiskeyTotalPrice = whiskeyPrice * whiskeyQuantity;

        double priceToPay = rakiaTotalPrice + wineTotalPrice + beerTotalPrice + whiskeyTotalPrice;

        System.out.printf("%.2f", priceToPay);
    }
}
