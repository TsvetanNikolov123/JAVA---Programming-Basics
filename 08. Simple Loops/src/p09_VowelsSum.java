import java.util.Scanner;

public class p09_VowelsSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String s = console.nextLine();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);

            switch (word) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
