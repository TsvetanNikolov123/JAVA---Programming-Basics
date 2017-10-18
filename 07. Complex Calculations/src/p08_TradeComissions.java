import java.util.Scanner;

public class p08_TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String city = console.nextLine().toLowerCase();
        double sales = Double.parseDouble(console.nextLine());
        double commission = -1.0;

        if (city.equals("sofia")) {
            if (0 <= sales && sales <= 500) {
                commission = sales * 0.05;
            } else if (500 < sales && sales <= 1000) {
                commission = sales * 0.07;
            } else if (1000 < sales && sales <= 10000) {
                commission = sales * 0.08;
            } else if (sales > 10000) {
                commission = sales * 0.12;
            }
        } else if (city.equals("varna")) {
            if (0 <= sales && sales <= 500) {
                commission = sales * 0.045;
            } else if (500 < sales && sales <= 1000) {
                commission = sales * 0.075;
            } else if (1000 < sales && sales <= 10000) {
                commission = sales * 0.10;
            } else if (sales > 10000) {
                commission = sales * 0.13;
            }
        } else if (city.equals("plovdiv")) {
            if (0 <= sales && sales <= 500) {
                commission = sales * 0.055;
            } else if (500 < sales && sales <= 1000) {
                commission = sales * 0.08;
            } else if (1000 < sales && sales <= 10000) {
                commission = sales * 0.12;
            } else if (sales > 10000) {
                commission = sales * 0.145;
            }
        }

        if (commission <= 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);
        }
    }
}
