import java.util.Scanner;

public class p01_PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int age = Integer.parseInt(console.nextLine());
        String gender = console.nextLine();

        if (gender.equals("m")) {
            if (age <= 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else {
            if (age <= 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        }
    }
}
