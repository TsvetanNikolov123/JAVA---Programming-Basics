import java.util.Scanner;

public class p06_NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mS = scanner.nextLine();
        String nS = scanner.nextLine();
        String lS = scanner.nextLine();

        int special = Integer.parseInt(scanner.nextLine());
        int control = Integer.parseInt(scanner.nextLine());

        // string sumS = mS + nS + lS;
        // int num = int.Parse(sumS);

        int m = Integer.parseInt(mS);
        int n = Integer.parseInt(nS);
        int l = Integer.parseInt(lS);

        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = l; k >= 1; k--) {
                    String iChar = "" + i;
                    String jChar = "" + j;
                    String kChar = "" + k;

                    String sumS = iChar + jChar + kChar;
                    int sum = Integer.parseInt(sumS);

                    if (sum % 3 == 0) {
                        special = special + 5;
                    } else if (sum % 10 == 5) {
                        special = special - 2;
                    } else if (sum % 2 == 0) {
                        special = special * 2;
                    }

                    if (special >= control) {
                        System.out.printf("Yes! Control number was reached! Current special number is %s.\n", special);
                        return;
                    }

                }
            }
        }
        if (special <= control) {
            System.out.printf("No! %s is the last reached special number.\n", special);
        }
    }
}
