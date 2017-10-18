import java.util.Scanner;

public class p13_CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double inputMoney = Double.parseDouble(console.nextLine());
        String fromCurrency = console.nextLine();
        String toCurrency = console.nextLine();

        double ratioUSD = 1.79549d;
        double ratioEUR = 1.95583d;
        double ratioGBP = 2.53405d;

        switch (fromCurrency) {
            case "USD":
                inputMoney *= ratioUSD;
                break;
            case "EUR":
                inputMoney *= ratioEUR;
                break;
            case "GBP":
                inputMoney *= ratioGBP;
                break;
            default:
                break;
        }

        switch (toCurrency) {
            case "USD":
                inputMoney /= ratioUSD;
                break;
            case "EUR":
                inputMoney /= ratioEUR;
                break;
            case "GBP":
                inputMoney /= ratioGBP;
                break;
            default:
                break;
        }

        System.out.printf("%.2f %s", inputMoney, toCurrency);
    }
}
